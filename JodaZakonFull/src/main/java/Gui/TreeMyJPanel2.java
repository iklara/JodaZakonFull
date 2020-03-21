package Gui;
	import java.awt.Color;

import java.awt.Dimension;
import java.awt.Event;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;

import mypakage.MyJPanel.MojaDelete;
	


	public class TreeMyJPanel2 extends JPanel{
		
	//	wpisZBDdoPlikuEksport wpisZBDdoPlikuEksport = new wpisZBDdoPlikuEksport();
	//	wpisZBDdoPlikuEksport.export();
		
		
		
		@Override
		public Dimension getPreferredSize() {
			return new Dimension (1000,1000);
		}

			public TreeMyJPanel2() {
				
				public class ExportToDB implements ActionListener {

					public void actionPerformed(Event e) {
					//	wpisZBDdoPlikuEksport.export();
						
						System.out.println("Wpisane do bazy danych!!!!!!");
					}
			}
				
				Font czcionka = new Font("Arial", Font.BOLD, 24);
				Font czcionka2 = new Font("Arial", Font.BOLD, 12);
				
				
				setLayout(null);
				
				JLabel etykieta = new JLabel();
				etykieta.setFont(czcionka);
				etykieta.setText("Zakony Jedi");
				etykieta.setBounds(150, 50, 400, 50);
				etykieta.setForeground(Color.black);
				
				add(etykieta);
				

				JLabel etykieta1 = new JLabel();
				etykieta1.setFont(czcionka);
				etykieta1.setText("Jedi");
				etykieta1.setBounds(700,50, 400, 50);
				etykieta1.setForeground(Color.black);
				
				add(etykieta1);
				
				JTextField text = new JTextField();
				text.setBounds(25,100, 450, 400);
				
				add(text);
				
				JTextField text2 = new JTextField();
				text2.setBounds(525, 100, 450, 400);
				add(text2);
				
				JLabel etykieta3 = new JLabel();
				etykieta3.setFont(czcionka2);
				etykieta3.setText("Rejestracja Zakonu Jedi");
				etykieta3.setBounds(200,500, 400, 50);
				etykieta3.setForeground(Color.black);
				
				add(etykieta3);
				
				JLabel etykieta4 = new JLabel();
				etykieta4.setFont(czcionka2);
				etykieta4.setText("Nazwa:");
				etykieta4.setBounds(50,550, 400, 50);
				etykieta4.setForeground(Color.black);
				
				add(etykieta4);
				
				JTextField text3 = new JTextField();
				text3.setBounds(150, 550, 300, 25);
				add(text3);
			
				JButton button = new JButton("Wybierz");
				button.setBounds(25, 600, 120, 25);
				add(button);
				
			
				
				JButton button1 = new JButton("Import");
				button1.setBounds(25, 750, 120, 25);
				add(button1);
				
				JButton button2 = new JButton("Eksport");
				button2.setBounds(25, 800, 120, 25);
				add(button2);
				
				JTextField text4 = new JTextField();
				text4.setBounds(150, 600, 300, 150);
				
				add(text4);
				
				JTextField text5 = new JTextField();
				text5.setBounds(150, 800, 300, 25);
				text5.setText("wpisz nazwe i sciezke pliku");
				add(text5);
				
				JButton button3 = new JButton("Zarejestruj");
				button3.setBounds(100, 900, 120, 25);
				add(button3);
				
				JButton button4 = new JButton("Wyczysc");
				button4.setBounds(300, 900, 120, 25);
				add(button4);
				//**************************************************
				//Start 2 strony tabeli
				
				
				JLabel etykieta5 = new JLabel();
				etykieta5.setFont(czcionka2);
				etykieta5.setText("Rejestracja Jedi");
				etykieta5.setBounds(650,500, 400, 50);
				etykieta5.setForeground(Color.black);
				
				add(etykieta5);
				
				JLabel etykieta6 = new JLabel();
				etykieta6.setFont(czcionka2);
				etykieta6.setText("Nazwa:");
				etykieta6.setBounds(550,550, 400, 50);
				etykieta6.setForeground(Color.black);
				
				add(etykieta6);
				
				JTextField text6 = new JTextField(); //text obok nazwy
				text6.setBounds(650, 550, 300, 25);
				add(text6);
				
				JLabel etykieta7 = new JLabel();
				etykieta7.setFont(czcionka2);
				etykieta7.setText("Kolor miecza: ");
				etykieta7.setBounds(550,600, 400, 50);
				etykieta7.setForeground(Color.black);
				add(etykieta7);
				
				JLabel etykieta8 = new JLabel();
				etykieta8.setFont(czcionka2);
				etykieta8.setText("Moc:");
				etykieta8.setBounds(550,650, 400, 50);
				etykieta8.setForeground(Color.black);
				add(etykieta8);
				
				String[] kolor = {"    ", "Niebieski","¯ó³ty", "Czerwony","Fioletowy","Czarny"};
				 JComboBox ComboBox1 = new JComboBox(kolor);
				 ComboBox1.setBounds(650,600, 300, 25);
				 add(ComboBox1);
   
				 JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 1000,100);  
				 slider.setBounds(650,650,300,50);
				 slider.setMajorTickSpacing(1000);
				 slider.setMinorTickSpacing(100);
			//	 slider.setValue(500);
				 slider.setPaintTicks(true);
				 slider.setPaintLabels(true);
				add(slider);
				
				JButton button5 = new JButton("Import");
				button5.setBounds(525, 750, 120, 25);
				add(button5);
				
				JButton button6 = new JButton("Eksport");
				button6.setBounds(525, 800, 120, 25);
				button6.addActionListener(new ExportToDB());
				add(button6);
				 
				
				JLabel etykieta9 = new JLabel();
				etykieta9.setFont(czcionka2);
				etykieta9.setText("Strona Mocy:");
				etykieta9.setBounds(650,700, 400, 50);
				etykieta9.setForeground(Color.black);
				add(etykieta9);
				
				JRadioButton radio = new JRadioButton("Jasna");
				radio.setBounds(825, 675, 100, 100);
				add(radio);
				
				JRadioButton radio1 = new JRadioButton("Ciemna");
				radio1.setBounds(750, 675, 100, 100);
				add(radio1);
				
				ButtonGroup buttonGr = new ButtonGroup();
				buttonGr.add(radio1);
				buttonGr.add(radio);
				
				JButton button8 = new JButton("Zarejestruj");
				button8.setBounds(600, 900, 120, 25);
			
				add(button8);
		
				
				JButton button9 = new JButton("Wyczysc");
				button9.setBounds(800, 900, 120, 25);
				add(button9);
				
				JTextField text7 = new JTextField();
				text7.setBounds(650, 800, 300, 25);
				text7.setText("wpisz nazwe i sciezke pliku");
				text7.setEnabled(true);
				add(text7);
			}
	}
	
//	button8.addActionListener( ActionEvent e){
//		JediZarejestruj = new JediZarejestruj();
//	jedi.setName(text6.getText());
//	jedi.setMoc(slider.getValue());
//	jedi.setKolorMiecza(ComboBox1.getSelectionIndex());
//	if (radio.isSelected()) {
//		jedi.setSite(1);
//	}else {
//		jedi.setSide(2);
//	}
//	}
//	
	