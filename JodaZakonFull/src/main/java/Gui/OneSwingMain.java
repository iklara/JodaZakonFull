package Gui;
import java.awt.EventQueue;

public class OneSwingMain {
			
		public static void main(String[] args) {
			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					
					TwoMyJFrame window = new TwoMyJFrame();
					
				}
			});
			
		}
	}
