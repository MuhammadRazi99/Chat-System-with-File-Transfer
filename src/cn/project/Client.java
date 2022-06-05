package cn.project;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {

    private String IP;
    private String hostname;
    private Socket clientSocket;
    private BufferedReader inFromClient;
    private BufferedWriter outToServer;
    String UserName;

    public void ClientConnection(String userName) {
        try {
            IP = InetAddress.getLocalHost().getHostAddress();
            hostname = InetAddress.getLocalHost().getHostName();
            clientSocket = new Socket(hostname, 6789);
            outToServer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            inFromClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            UserName = userName;
//            System.out.println("Sending request to Socket Server");
//            FromServer = new ObjectInputStream(socket.getInputStream());
//            String message = (String) FromServer.readObject();
//            System.out.println("Message: " + message);
//            //close resources
//            FromServer.close();
//            outToServer.close();
        } catch (UnknownHostException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//    public void sendMessage(String msgToSend) {
//        try {
//            while (clientSocket.isConnected()) {
//                outToServer.write(UserName + ": " + msgToSend);
//                outToServer.newLine();
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
//            close(clientSocket, outToServer, inFromClient);
//        }
//    }

//    public void recieveMessage() {
//        new Thread(() -> {
//            String msgToRecieve;
//            while (clientSocket.isConnected()) {
//                try {
//                    msgToRecieve = inFromClient.readLine();
//                    System.out.println(msgToRecieve);
//                } catch (IOException ex) {
//                    Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
//                    close(clientSocket, outToServer, inFromClient);
//                }
//            }
//        }).start();
//    }

//    private void close(Socket clientSocket, BufferedWriter outFromClient, BufferedReader inFromClient) {
//        try {
//            if (inFromClient != null) {
//                inFromClient.close();
//            }
//            if (outFromClient != null) {
//                outFromClient.close();
//            }
//            if (clientSocket != null) {
//                clientSocket.close();
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

}
