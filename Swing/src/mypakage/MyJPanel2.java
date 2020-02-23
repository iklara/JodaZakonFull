package mypakage;
	import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JRadioButton;
	import javax.swing.JTextField;


	public class MyJPanel2 extends JPanel{
		

		
		
		@Override
		public Dimension getPreferredSize() {
			return new Dimension (500,500);
		}

			public MyJPanel2() {
				
				Font czcionka = new Font("Jokerman", Font.ITALIC, 12);
				
				
				setLayout(null);
				
				JLabel etykieta = new JLabel();
				etykieta.setFont(czcionka);
				etykieta.setText("STRONA LOGOWANIA 2");
				etykieta.setBounds(50, 0, 250, 100);
				etykieta.setForeground(Color.BLUE);
				
				add(etykieta);
				

				JLabel etykieta1 = new JLabel();
				etykieta1.setFont(czcionka);
				etykieta1.setText("LOGIN:");
				etykieta1.setBounds(50, 50, 200, 50);
				etykieta1.setForeground(Color.RED);
				
				add(etykieta1);
				
				JTextField text = new JTextField();
				text.setBounds(250,50, 200, 50);
				
				add(text);
				
				JLabel etykieta2 = new JLabel();
				etykieta2.setFont(czcionka);
				etykieta2.setText("HASLO");
				etykieta2.setBounds(50, 100, 200, 50);
				etykieta2.setForeground(Color.GREEN);
				add(etykieta2);
				
				JTextField text2 = new JTextField();
				text2.setBounds(250, 100, 200, 50);
				add(text2);
				
				JLabel etykieta3 = new JLabel();
				etykieta3.setFont(czcionka);
				etykieta3.setText("Powtorz Haslo");
				etykieta3.setBounds(50, 150, 200, 50);
				etykieta3.setForeground(Color.BLACK);		
				add(etykieta3);
				
				JTextField text3 = new JTextField();
				text3.setBounds(250,150, 200, 50);
				add(text3);
				
				JLabel etykieta4 = new JLabel();
				etykieta4.setFont(czcionka);
				etykieta4.setText("Jezyk");
				etykieta4.setBounds(50, 200, 200, 50);
				etykieta4.setForeground(Color.BLACK);		
				add(etykieta4);
				
				JCheckBox checkBox = new JCheckBox();
				checkBox.setFont(czcionka);
				checkBox.setText("Java");
				checkBox.setSelected(true);
				checkBox.setBounds(150,200,100,50);
				add(checkBox);
				
				JCheckBox checkBox1 = new JCheckBox();
				checkBox1.setFont(czcionka);
				checkBox1.setText("C++");
				checkBox1.setBounds(300,200,100,50);
				add(checkBox1);
			
				
				JLabel etykieta5 = new JLabel();
				etykieta5.setFont(czcionka);
				etykieta5.setText("Plec");
				etykieta5.setBounds(50, 300, 200, 50);
				etykieta5.setForeground(Color.BLACK);		
				add(etykieta5);
				
				JRadioButton radio = new JRadioButton("K");
				radio.setBounds(150, 250, 100, 100);
				add(radio);
				
				JRadioButton radio1 = new JRadioButton("M");
				radio1.setBounds(250, 250, 100, 100);
				add(radio1);
				
				ButtonGroup buttonGr = new ButtonGroup();
				buttonGr.add(radio1);
				buttonGr.add(radio);
				
				
				JButton button = new JButton("Delete");
				button.setBounds(150, 350, 120, 50);
				add(button);
				
				JButton button1 = new JButton("Zapisz");
				button1.setBounds(300, 350, 120, 50);
				add(button1);
				
				
			}
		}

