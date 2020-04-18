package Gui;
import javax.swing.JFrame;


	public class TwoMyJFrame extends JFrame {

		public TwoMyJFrame() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			setLocation(300,00);
//			setSize(1500, 1500);
			setTitle("System zarz¹dzania zakonem Jedi");
			
			
			add(new TreeMyJPanel2());
			// gdyby 2 klasy to 
			//add(nazwa(),BorderLayout.EAST);
			//add(nazwa(),BorderLayout.WEST);
			pack();
		}
	}
