package indura.netportscan;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class Scanners {

    public static void showIP() {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("IP adress: " + address);
        } catch (UnknownHostException e) {
            System.out.println("Unable to get the local IP");
        }
    }
    
    public static void portScanner(String host, int startPort, int endPort) {

        List<Integer> openPorts = new ArrayList<>();

        System.out.println();
        System.out.println("[*] Scanning port of " + host);
        System.out.println();

        for (int port = startPort; port <= endPort; port++) {
            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress(host, port), 200);
                socket.close();
                openPorts.add(port);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("[*] OPEN PORTS");
        System.out.println("----------------------------");

        for (Integer openPort : openPorts) {
            System.out.println("-> " + openPort);
        }
    }

    public static void networkScanner(String subnet, int startIp, int endIp) {

        System.out.println();
        System.out.println("Scanning hosts on: " + subnet);
        System.out.println();

        List<String> activeHosts = new ArrayList<>();

        for (int ip = startIp; ip <= endIp; ip++) {
            String currentIp = subnet + ip;

            try {
                InetAddress address = InetAddress.getByName(currentIp);

                if (address.isReachable(1000)) {
                    activeHosts.add(currentIp);
                }

            } catch (IOException e) {
                System.out.println("Error scanning " + currentIp);
            }
            
        }

        System.out.println("[*] ACTIVE HOSTS");
        System.out.println("-----------------------");

        for (String host : activeHosts) {
            System.out.println("-> " + host);
        }
    
    }
}
