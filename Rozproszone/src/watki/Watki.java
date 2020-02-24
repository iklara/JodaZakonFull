package watki;

public class Watki {
	
	
		public static void main(String[] args) {
			Runnable proces1 = new Runnable() {
				@Override
				public void run() {
					while (true) {
						System.out.println("Proces 1: A");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			};
			Runnable proces2 = new Runnable() {
				@Override
				public void run() {
					while (true) {
						System.out.println("Proces 2: B");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			};
			Runnable proces3 = new Runnable() {
				@Override
				public void run() {
					while (true) {
						System.out.println("Proces 3: C");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			};
			Thread watek1 = new Thread(proces1);
			Thread watek2 = new Thread(proces2);
			Thread watek3 = new Thread(proces3);
			watek1.start();
			watek2.start();
			watek3.start();
		}
	}