
package cn.project;
import java.io.*;
import java.net.*;

public class Client {
	private static String IP;
	private static String hostname;
	private static Socket socket=null;
	private static ObjectOutputStream ToServer = null;
	private static ObjectInputStream FromServer = null;
        
        public static void ConnectionEst() throws IOException{
            socket = new Socket(hostname, 9876);
        }
	public static void clientConn(String S) throws IOException, InterruptedException, ClassNotFoundException{
		IP = InetAddress.getLocalHost().getHostAddress();
                System.out.println(S);
		hostname = InetAddress.getLocalHost().getHostName();
			//establish socket connection to server
			//write to socket using ObjectOutputStream
			ToServer = new ObjectOutputStream(socket.getOutputStream());
                        FromServer = new ObjectInputStream(socket.getInputStream());
                        
     
                            ToServer.writeObject(S);
                            String message = (String) FromServer.readObject();
                            System.out.println("Message: " + message);
                   

			//read the server response message
			//close resources
			FromServer.close();
			ToServer.close();
                        
}
	public static void main(String[] args) throws ClassNotFoundException, IOException, InterruptedException {

	}

}

