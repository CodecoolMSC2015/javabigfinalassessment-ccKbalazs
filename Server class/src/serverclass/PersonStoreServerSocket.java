package serverclass;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class PersonStoreServerSocket {
	DataReader store;
	static FileOutputStream fos;
	static ObjectOutputStream oos;
	Socket socket;
	
	public void start(){
		try {
			ServerSocket serverSocket = new ServerSocket(673);
			socket = serverSocket.accept();
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			
			serverSocket.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
