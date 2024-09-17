// Client - Server Application(Client code)
import java.io.*;
import java.net.*;
import java.util.*;

public class Client {

    public static void main(String args[]) throws IOException {
        try {
            System.out.println("Connecting to Server...");
            Socket s = new Socket("localhost", 4444);
            System.out.println("Server connected");

            
            PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            Scanner sc = new Scanner(System.in);

            
            Thread readThread = new Thread(() -> {
                try {
                    String serverstr;
                    while ((serverstr = br.readLine()) != null) {
                        System.out.println("Server: "+ serverstr);
                    }
                } catch (IOException e) {
                    System.out.println("Client not Connected to server");
                }
            });
            readThread.start();

            
            String userInput;
            while (true) {
                userInput = sc.nextLine();
                pw.println(userInput);
                if (userInput.equalsIgnoreCase("disconnect server")) {
                    System.out.println("Disconnected server, Successfully");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
