/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cn.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ahmed
 */
public class ClientHandler implements Runnable {

    public static ArrayList<ClientHandler> clientHandlers = new ArrayList<>();
    private Socket clientSocket;
    private BufferedReader inFromClient;
    private BufferedWriter outToServer;
    String clientUserName;

    ClientHandler(Socket connectionSocket) {
        try {
            clientSocket = connectionSocket;
            outToServer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            inFromClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            clientUserName = inFromClient.readLine();
            transferMessage(" -- " + clientUserName + " has entered the chat -- ");
            clientHandlers.add(this);
        } catch (IOException ex) {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
            close(clientSocket, outToServer, inFromClient);
        }
    }

    @Override
    public void run() {
        String msgFromClient;
        while (clientSocket.isConnected()) {
            try {
                msgFromClient = inFromClient.readLine();
                transferMessage(msgFromClient);
            } catch (IOException ex) {
                Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                close(clientSocket, outToServer, inFromClient);
                break;
            }
        }
    }

    private void transferMessage(String msgToSend) {
        for (ClientHandler client : clientHandlers) {
            try {
                if (!client.clientUserName.equals(clientUserName)) {
                    client.outToServer.write(msgToSend + "\n");
                }
            } catch (IOException ex) {
                Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                close(clientSocket, outToServer, inFromClient);
            }
        }
    }

    public void removeClient() {
        clientHandlers.remove(this);
        transferMessage(" -- " + clientUserName + " has left the chat -- ");
    }

    private void close(Socket clientSocket, BufferedWriter outFromClient, BufferedReader inFromClient) {
        removeClient();
        try {
            if (inFromClient != null) {
                inFromClient.close();
            }
            if (outFromClient != null) {
                outFromClient.close();
            }
            if (clientSocket != null) {
                clientSocket.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
