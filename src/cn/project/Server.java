
package cn.project;
import java.io.*;
import java.net.*;

// Server class
public class Server {
    private InetAddress ipaddress;
    private String hostname;
    private static ServerSocket server;
    private static int port = 9876;
    private static ObjectInputStream FromClient;
    private static ObjectOutputStream ToClient;

    public static void Connection() throws IOException, ClassNotFoundException{

        server = new ServerSocket(port);
        //keep listens indefinitely until receives 'exit' call or program terminates
        while(true){
            System.out.println("Waiting for the client request");
            String message;
            //read from socket to ObjectInputStream object
            try ( //creating socket and waiting for client connection
                    Socket socket = server.accept()) {
                //read from socket to ObjectInputStream object
                FromClient = new ObjectInputStream(socket.getInputStream());
                //convert ObjectInputStream object to String
                message = (String) FromClient.readObject();
                System.out.println("Message Received: " + message);
                //create ObjectOutputStream object
                ToClient = new ObjectOutputStream(socket.getOutputStream());
                //write object to Socket
                ToClient.writeObject("Hi Client "+message);
                //close resources
                FromClient.close();
                ToClient.close();
            }
            //terminate the server if client sends exit request
            if(message.equalsIgnoreCase("exit")) break;
        }
        System.out.println("Shutting down Socket server!!");
        //close the ServerSocket object
        server.close();
    }
    public String getIP(){
        return String.valueOf(this.ipaddress);
    }
    public String getHostName(){
        return this.hostname;
    }
    public static void main(String[] args) throws ClassNotFoundException, IOException {    
        Server.Connection();
    }

    }
