package Rozproszone;

import java.io.PrintWriter;
import java.net.Socket;

public class Klient {
	
	public static void main( String [] args) {
		
		try {
			Socket socket = new Socket("172.16.97.104", 9000);
//			Socket socket = new Socket("localhost", 9000);
			PrintWriter output = new PrintWriter(socket.getOutputStream());
			output.println("hello to ja iwona");
			output.close();
			
			socket.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
