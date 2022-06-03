
package cn.project;
import java.io.*;
import java.net.*;

class Client {
	private String IP;
	private String hostname;
	private Socket socket=null;
	private ObjectOutputStream ToServer = null;
	private ObjectInputStream FromServer = null;
        
        public void ConnectionEst() throws IOException{
            socket = new Socket(hostname, 9876);
        }
	public void clientConn(String S) throws IOException, InterruptedException, ClassNotFoundException{
		IP = InetAddress.getLocalHost().getHostAddress();
                System.out.println(S+"Client");
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

