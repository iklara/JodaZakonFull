package mypakage;
import java.awt.EventQueue;

public class SwingMain {
			
		public static void main(String[] args) {
			
			EventQueue.invokeLater(new Runnable() {
				@Override
				public void run() {
					
					MyJFrame window = new MyJFrame();
					
				}
			});
			
		}
	}
