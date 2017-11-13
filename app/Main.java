import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    // Sockets
    static Socket s;
    static ServerSocket ss;
    static InputStreamReader isr;
    static BufferedReader br;
    static String message;


    public static void main(String[] args) {

        System.out.println("Starting the server...");
        try {
            // Establish the socket connection and listen for incoming
            ss = new ServerSocket(7800);
            System.out.println("Server has started! Accepting connections.");

            // If the socket was started
            while (true) {
                // Accept a packet
                s = ss.accept();
                if (s != null) {
                    System.out.println("Packet received!");
                }

                // Read the line
                isr = new InputStreamReader(s.getInputStream());
                br = new BufferedReader(isr);
                message = br.readLine();

                // Print the message
                System.out.println("Message recevied: " + message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
