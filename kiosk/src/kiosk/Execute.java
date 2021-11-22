package kiosk;

import javax.swing.JFrame;
import java.awt.Color;

public class Execute extends JFrame {
	public Execute() {
		super("Cafe");
		setLayout(null);
		setBounds(0,0,450,800);
		setBackground(Color.white);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new Order());
		
		setVisible(true);
		revalidate();
	}
}
