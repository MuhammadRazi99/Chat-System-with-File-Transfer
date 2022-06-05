/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.project;

import java.io.*;
import java.net.*;
import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class FileTransferServer {
    public ServerSocket serveSocket;
    public Socket socket;
    public DataInputStream fromClient;
    public DataOutputStream toClient;
    private String fileName;
    private String fileContent;
    
    private String getFileExtension(String name){
        int i=name.lastIndexOf('.');
        if(i>0){
            return name.substring(i+1);
        }
        else{
            return "No extension found";
        }
    }
    
    public void revieveFile() throws IOException{
    serveSocket=new ServerSocket(1234);
    while(true){
           socket=serveSocket.accept();
           System.out.println("Connection established");
           fromClient=new DataInputStream(socket.getInputStream());
           toClient=new DataOutputStream(socket.getOutputStream());
           
           int fileNameLength = fromClient.readInt();
           if(fileNameLength > 0){
               byte[] fileNameBytes=new byte[fileNameLength];
//               fromClient.readFully(fileNameBytes,0,fileNameBytes.length);
               fromClient.readFully(fileNameBytes,0,fileNameLength);  
               fileName=new String(fileNameBytes);
               int fileContentLength=fromClient.readInt();
               if(fileContentLength > 0){
               byte[] fileContentBytes=new byte[fileContentLength];
//               fromClient.readFully(fileNameBytes,0,fileContentBytes.length);
               fromClient.readFully(fileContentBytes,0,fileContentLength);
               fileContent=new String(fileContentBytes);
//               break;
               }
            }
            System.out.println("File Name="+fileName);
            System.out.println("File Content="+fileContent);
        
    }
    }

    public static void main(String[] args) throws IOException {
        FileTransferServer server=new FileTransferServer();
        server.revieveFile();
        
    }
    
    }
 
