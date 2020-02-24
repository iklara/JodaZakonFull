package massanger;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {

	public static void main(String[] args) {
		boolean lock = true;

		Runnable odczyt = new Runnable() {
			@Override
			public void run() {

				ServerSocket ss;
				int port = 9000;
			

				try {
					
					ss = new ServerSocket(port);

					Socket klientPodlaczony = ss.accept();
					Scanner input = new Scanner(klientPodlaczony.getInputStream());

					while (lock) {
						System.out.println("Serwer slucha na porcie" + port);

						

						if (input.hasNextLine()) {
							System.out.println(klientPodlaczony.getPort() + ":" + input.nextLine());
						}
						
					}
					
					input.close();
					ss.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		};

		Runnable zapis = new Runnable() {
			@Override
			public void run() {
				while (lock) {

					try {
//						Socket socket = new Socket("172.16.97.104", 9000);
					Socket socket = new Socket("localhost", 9000);
						PrintWriter output = new PrintWriter(socket.getOutputStream());
						output.println("hello to ja iwona");
						output.close();

						socket.close();

					} catch (Exception e) {
						e.printStackTrace();
					}

				}

			}
		};

		Thread watekOdczyt = new Thread(odczyt);
		Thread watekZapis = new Thread(zapis);

		watekOdczyt.start();
		watekZapis.start();
		
		
		
	}
}