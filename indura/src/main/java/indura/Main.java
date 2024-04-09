package indura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import indura.netportscan.*;

public class Main {
    public static void main(String[] args) {

        int option;
        boolean repeat = true;
        Scanner sc = new Scanner(System.in);
        Scanner extra = new Scanner(System.in);

        while (repeat) {
            showBanner();
            showMenu();
            System.out.print("Enter your selection: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    Scanners.showIP();
                    break;

                case 2:
                    System.out.print("Enter the IP of the network you want to scan (e.g 192.168.1.): ");
                    String network = extra.nextLine();
                    System.out.print("Enter the start of the range of IP's you want to scan: ");
                    int ipStart = extra.nextInt();
                    System.out.print("Enter the end of the range: ");
                    int ipEnd = extra.nextInt();
                    Scanners.networkScanner(network, ipStart, ipEnd);
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;
            
                default:
                    break;
            }
        }
        

    }

    public static void showBanner() {

        System.out.println();
        System.out.println("--------------------------------------------------");

        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("bash", "-c", "figlet -f slant InduraSC");

        try {
            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("        [+] Coded By AbyssWatcher [+]");
        System.out.println("--------------------------------------------------");
    }

    public static void showMenu() {
        System.out.println();
        System.out.println("[1] Show your IP");
        System.out.println("[2] Host Scanning");
        System.out.println("[3] Port Verification");
        System.out.println("[4] Web Scraping");
        System.out.println("[5] Generate a Secure Password");
        System.out.println("[6] Exit");
        System.out.println();
        System.out.println("--------------------------------------------------");

    }
}