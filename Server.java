// Client - Server Application(Client code)
import java.io.*;
import java.net.*;
import java.util.*;

public class Server {

    public static void main(String args[]) throws IOException {
        try {
            ServerSocket ss = new ServerSocket(4444);
            System.out.println("Waiting for client...");
            Socket s = ss.accept();
            System.out.println("client connected");
            
            InputStreamReader isr = new InputStreamReader(s.getInputStream());
            BufferedReader br = new BufferedReader(isr);

            PrintWriter pw = new PrintWriter(s.getOutputStream());
            Scanner sc = new Scanner(System.in);
            boolean val = false;
            while (!val) {
                String str = br.readLine();
                System.out.println("Client: " + str);
		        
                if (str.equalsIgnoreCase("disconnect server")) {
                    System.out.println("Client Disconnected successfully ");
                    break;
                } else {
                    String servermsg = sc.nextLine();
                    pw.println(servermsg);
                    pw.flush();
                }

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
