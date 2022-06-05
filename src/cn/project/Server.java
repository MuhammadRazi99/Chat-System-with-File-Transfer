package cn.project;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

// Server class
public class Server {

    private InetAddress ipaddress;
    private String hostname;
    private ServerSocket serverSocket;
    private final int port = 6789;
//    private ObjectInputStream FromClient;
//    private ObjectOutputStream ToClient;

    public Server() {
        try {
            serverSocket = new ServerSocket(port);
            ServerConnection();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void ServerConnection() {

        try {
            while (!serverSocket.isClosed()) {
//                String message;
                Socket connectionSocket = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(connectionSocket);
                Thread thread = new Thread(clientHandler);
                thread.start();
                System.out.println("Client: " + clientHandler.clientUserName + " has connected!");
//            FromClient = new ObjectInputStream(socket.getInputStream());
//            message = FromClient.readObject().toString();
//            System.out.println("Message Received: " + message);
//            ToClient = new ObjectOutputStream(socket.getOutputStream());
//            ToClient.writeObject("Hi Client " + message);
//            FromClient.close();
//            ToClient.close();
            }
//        if (message.equalsIgnoreCase("exit")) {
//            break;
//        }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            close();
        }
    }

    private void close() {
        try {
            if (serverSocket != null) {
                serverSocket.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getIP() {
        return String.valueOf(this.ipaddress);
    }

    public String getHostName() {
        return this.hostname;
    }

//    public static void main(String[] args) throws ClassNotFoundException, IOException {
//        Server.startServer();
//    }
}
