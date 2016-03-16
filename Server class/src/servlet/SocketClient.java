package servlet;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class SocketClient {
	Socket socket;
	public void clientManager(){
		try {
			socket = new Socket("localhost", 673);
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			
			oos.close();
			ois.close();
			socket.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}