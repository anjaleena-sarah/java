import java.io.*;
import java.util.*;
import java.net.*;

public class Server1 {
    public static void main(String[] args) {
        ServerSocket ss;
        Socket as;
        DataInputStream sin;
        DataOutputStream sout;
        Scanner s = new Scanner(System.in);

        try {
            ss = new ServerSocket(1234);
            System.out.println("Server started, waiting for client...");
            as = ss.accept();
            System.out.println("Client connected...");

            sin = new DataInputStream(as.getInputStream());
            sout = new DataOutputStream(as.getOutputStream());

            String received;
            String send;

            while (true) {
                received = sin.readUTF();
                System.out.println("Client says: " + received);

                if (received.equals("quit")) {
                    System.out.println("Client is closing");
                    break;
                }

                System.out.print("Server: ");
                send = s.nextLine();
                sout.writeUTF(send);

                if (send.equals("quit")) {
                    System.out.println("Server is stopping");
                    break;
                }
            }

            sin.close();
            sout.close();
            s.close();
            as.close();
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}