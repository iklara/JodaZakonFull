package Rozproszone;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {

		ServerSocket ss;
		int port = 9000;
		boolean lock = true;

		try {

			while (lock) {
				System.out.println("Serwer slucha na porcie" + port);

				ss = new ServerSocket(port);

				Socket klientPodlaczony = ss.accept();
				Scanner input = new Scanner(klientPodlaczony.getInputStream());

				if (input.hasNextLine()) {
					System.out.println(klientPodlaczony.getPort() + ":" + input.nextLine());
				}
				input.close();
				ss.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
