package indura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.SecureRandom;
import java.util.Scanner;
import indura.netportscan.*;
import indura.scraper.*;

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
                    Scanners.showEachControllerIp();
                    break;

                case 3:
                    System.out.print("Enter the IP of the network you want to scan (e.g 192.168.1.): ");
                    String network = extra.nextLine();
                    System.out.print("Enter the start of the range of IP's you want to scan: ");
                    int ipStart = extra.nextInt();
                    System.out.print("Enter the end of the range: ");
                    int ipEnd = extra.nextInt();
                    Scanners.networkScanner(network, ipStart, ipEnd);
                    break;

                case 4:
                    System.out.print("Enter the IP of the host you want to verify the ports: ");
                    String host = extra.nextLine();
                    System.out.print("Enter the start of the range of ports you want to verify: ");
                    int portStart = extra.nextInt();
                    System.out.print("Enter the end of the range of ports: ");
                    int portEnd = extra.nextInt();
                    Scanners.portScanner(host, portStart, portEnd);
                    break;

                case 5:
                    System.out.print("Enter the complete url of the website: ");
                    String url = extra.nextLine();
                    WebScraper.scrapWebsite(url);
                    break;

                case 6:
                    System.out.print("Enter the length of the password (8 characters or more suggested): ");
                    int length = extra.nextInt();
                    System.out.println();
                    System.out.println("[*] Your Password");
                    System.out.println("---------------------------------");
                    System.out.println(generateSecurePassword(length));
                    break;

                case 7:
                    repeat = false;
                    break;
            
                default:
                    System.out.println();
                    System.out.println("[*] WARNING");
                    System.out.println("---------------------------------");
                    System.out.println("Enter a valid option please...");
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
        System.out.println("[2] Show the IP of each of your controllers");
        System.out.println("[3] Host Scanning");
        System.out.println("[4] Port Verification");
        System.out.println("[5] Web Scraping");
        System.out.println("[6] Generate a Secure Password");
        System.out.println("[7] Exit");
        System.out.println();
        System.out.println("--------------------------------------------------");

    }

    public static String generateSecurePassword(int length) {

        String charLower = "abcdefghijklmnopqrstuvwxyz";
        String charUpper = charLower.toUpperCase();
        String number = "0123456789";
        String symbol = "!@#$%^&*_=+-/";

        String charCombination = charLower + charUpper + number + symbol;

        SecureRandom random = new SecureRandom();
        
        if (length < 1) throw new IllegalArgumentException("The length must be at least 1, but is highly recommended to enter at least 8 characters");

        StringBuilder sb = new StringBuilder(length);

        // Generar la contraseña con la longitud dada
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(charCombination.length());
            sb.append(charCombination.charAt(randomIndex));
        }

        return sb.toString();

    }
}