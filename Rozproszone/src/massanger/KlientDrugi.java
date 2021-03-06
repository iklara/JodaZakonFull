package massanger;

	
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.net.Socket;
	import java.util.Scanner;
	
	public class KlientDrugi {
		Socket klient;
		public KlientDrugi() {
			try {
				klient = new Socket("localhost", 9000);
			} catch (IOException e) {
				e.printStackTrace();
			}
			uruchomOdczyt();
			uruchomWysylanie();
		}
		private void uruchomWysylanie() {
			Runnable wysylanieRunnable = new Runnable() {
				@Override
				public void run() {
					try {
						PrintWriter wysylka = new PrintWriter(klient.getOutputStream());
						Scanner console = new Scanner(System.in);
						while (true) {
							if (console.hasNextLine()) {
								wysylka.println(console.nextLine());
								wysylka.flush();
							}
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			Thread wysylanie = new Thread(wysylanieRunnable);
			wysylanie.start();
		}
		private void uruchomOdczyt() {
			Runnable odczytRunnable = new Runnable() {
				@Override
				public void run() {
					try {
						Scanner odczyt = new Scanner(klient.getInputStream());
						while (true) {
							if (odczyt.hasNextLine())
								System.out.println("Klient: " + odczyt.nextLine());
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			Thread watekOdczyt = new Thread(odczytRunnable);
			watekOdczyt.start();
		}
		public static void main(String[] args) {
			new KlientDrugi();
		}
	}

