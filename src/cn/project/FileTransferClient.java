/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.project;

import java.io.*;
import java.io.File;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author DELL
 */
public class FileTransferClient {
    public File[] FileToSend;
    public Socket socket;
    public DataOutputStream toServer;
    public FileInputStream fromServer;
    
    public void SendFile(File fileToSend) throws IOException{
        socket=new Socket("localhost",1234);
        
        toServer=new DataOutputStream(socket.getOutputStream());
        
        fromServer=new FileInputStream(fileToSend.getAbsolutePath());
        
        String fileName=fileToSend.getName();
        byte[] fileNameBytes = fileName.getBytes();
        
        byte[] fileContentBytes=new byte[(int)fileToSend.length()];
        fromServer.read(fileContentBytes);
        
        toServer.writeInt(fileNameBytes.length);
        toServer.write(fileNameBytes);
        
        toServer.writeInt(fileContentBytes.length);
        toServer.write(fileContentBytes);
        
        
    }

    public static void main(String[] args) throws IOException {
//        FileToSend=new File[1];
        
    }

    
}
