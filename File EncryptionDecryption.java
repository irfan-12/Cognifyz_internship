
import java.io.*;
import java.util.*;

public class Task_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation to perform:\n1. Encryption\n2. Decryption");
        String con = sc.nextLine();
        System.out.print("Enter file name: ");
        String sourcefile = sc.nextLine();
        System.out.print("Enter the file name to save as (after file Encrypt or Decrypt): ");
        String savedFile = sc.nextLine();
        System.out.print("Enter Secret key: ");
        int sk = sc.nextInt();

        if (con.equals("1") || con.equalsIgnoreCase("Encryption")) {
            try (FileReader fr = new FileReader(sourcefile); FileWriter fw = new FileWriter(savedFile)) {

                int ch;
                while ((ch = fr.read()) != -1) {
                    fw.write(ch + sk);
                }
                System.out.println("File encrypted successfully");
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else if (con.equals("2") || con.equalsIgnoreCase("Decryption")) {
            try (FileReader fr = new FileReader(sourcefile); FileWriter fw = new FileWriter(savedFile)) {

                int ch;
                while ((ch = fr.read()) != -1) {
                    fw.write(ch - sk);
                }
                System.out.println("File decrypted successfully");
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else {
            System.out.println("Invalid option, please try again!");
        }

        sc.close(); // Close the scanner
    }
}
