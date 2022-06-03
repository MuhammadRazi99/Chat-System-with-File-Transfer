
package cn.project;
import java.io.*;
import java.net.*;

public class Client {
	private static String IP;
	private static String hostname;
	private static Socket socket;
	private static ObjectOutputStream ToServer = null;
	private static ObjectInputStream FromServer = null;

	public  static void clientConn(String S) throws IOException, InterruptedException, ClassNotFoundException{
		IP = InetAddress.getLocalHost().getHostAddress();
		hostname = InetAddress.getLocalHost().getHostName();
		socket = null;
		ToServer = null;
		FromServer = null;
			//establish socket connection to server
			socket = new Socket(hostname, 9876);
			//write to socket using ObjectOutputStream
			ToServer = new ObjectOutputStream(socket.getOutputStream());
			ToServer.writeObject(S);
			System.out.println("Sending request to Socket Server");
			//read the server response message
			FromServer = new ObjectInputStream(socket.getInputStream());
			String message = (String) FromServer.readObject();
			System.out.println("Message: " + message);
			//close resources
			FromServer.close();
			ToServer.close();
	
}
	

}

