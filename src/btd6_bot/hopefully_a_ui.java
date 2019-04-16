package btd6_bot;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField; 

public class hopefully_a_ui {
	
	public static void main(String s[]) {
		
		JFrame f = new JFrame("hopefully this works");
		
		f.setSize(400, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		
		f.add(p);
		
		p.setLayout(null);
		
		JLabel test = new JLabel("test");
		test.setBounds(50, 50, 100, 50);
		p.add(test);
		
		f.setVisible(true);
		
	}
	
}
