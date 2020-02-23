package mypakage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MyJPanel extends JPanel {

	JTextField text;
	JPasswordField text2;

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(500, 500);
	}

	class MojaAkcja implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (text.getText().equalsIgnoreCase("Admin") && text2.getText().equalsIgnoreCase("Admin")) {

				System.out.println(" Zalogowano");
			} else {

				System.out.println(" niezalogowano");
			}

		}
	}

		class MojaDelete implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText(" ");
				text2.setText(" ");
			}
	}

	public MyJPanel() {

		Font czcionka = new Font("Jokerman", Font.ITALIC, 12);

//			for(int i = 0; i < 20; i++)
//				add(new JButton("Guzik" + i));

		setLayout(null);

		JLabel etykieta = new JLabel();
		etykieta.setFont(czcionka);
		etykieta.setText("Strona logowania");
		etykieta.setBounds(50, 10, 250, 100);
		etykieta.setForeground(Color.BLUE);

		add(etykieta);

//			JTextArea text = new JTextArea();
//			text.setBounds(50,50, 40, 40);
//			text.setLineWrap(true);
//			add(text);
//	
//			JRadioButton radio = new JRadioButton("Kliknij");
//			radio.setBounds(100, 100, 100, 100);
//			add(radio);

		JLabel etykieta1 = new JLabel();
		etykieta1.setFont(czcionka);
		etykieta1.setText("LOGIN:");
		etykieta1.setBounds(50, 100, 200, 50);
		etykieta1.setForeground(Color.RED);

		add(etykieta1);

		text = new JTextField();
		text.setBounds(250, 100, 200, 50);

		add(text);

		JLabel etykieta2 = new JLabel();
		etykieta2.setFont(czcionka);
		etykieta2.setText("HASLO");
		etykieta2.setBounds(50, 150, 200, 50);
		etykieta2.setForeground(Color.GREEN);

		add(etykieta2);

		text2 = new JPasswordField();
		text2.setBounds(250, 150, 200, 50);
		

		add(text2);

		JLabel etykieta3 = new JLabel();
		etykieta3.setFont(czcionka);
		etykieta3.setText("zapomnialem Hasla");
		etykieta3.setBounds(250, 200, 200, 50);
		etykieta3.setForeground(Color.BLACK);

		add(etykieta3);

		JButton button = new JButton("Delete");
		button.setBounds(150, 250, 120, 50);
		button.addActionListener(new MojaDelete());
		add(button);

		JButton button1 = new JButton("Zaloguj");
		button1.setBounds(300, 250, 120, 50);
		button1.addActionListener(new MojaAkcja());
		add(button1);

	}
	
}
