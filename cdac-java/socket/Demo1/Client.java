import java.io.*;
import java.net.*;

public class Client {
    private Socket socket = null;
    private BufferedReader input = null;
    private DataOutputStream out = null;

    public Client(String address, int port){
        try {
            // Create socket connection
            socket = new Socket(address, port);
            System.out.println("Connected");

            // Use BufferedReader instead of DataInputStream for input from console
            input = new BufferedReader(new InputStreamReader(System.in));
            out = new DataOutputStream(socket.getOutputStream());

        } catch (UnknownHostException u) {
            System.out.println("Unknown Host: " + u.getMessage());
            return;
        } catch (IOException i) {
            System.out.println("IO Error: " + i.getMessage());
            return;
        }

        String line = "";
        while(!line.equals("Over")){
            try {
                // Read from console
                line = input.readLine();
                out.writeUTF(line);
            } catch (IOException e) {
                System.out.println("IO Error while reading/writing: " + e.getMessage());
            }
        }

        // Close the connection
        try {
            input.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            System.out.println("Error while closing resources: " + e.getMessage());
        }

    }

    public static void main(String[] args){
        Client client = new Client("127.0.0.1", 5000);
    }
}
