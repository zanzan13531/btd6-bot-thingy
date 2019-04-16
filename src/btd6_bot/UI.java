package btd6_bot;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

/**
 * This makes a UI which can listen on the keys that you type.
 * If you type 's' then it will queue a stop, that is it will stop the program after the game is finished, before it confirms restart.
 * If you type 'e' then it will emergency stop, and basically kill the entire JVM. This will not kill BTD6 though, so use it with caution. (i.e. if it's blowing up your computer).
 * @author ryan
 *
 */
public class UI extends JFrame implements KeyListener {
	
	private JButton startButton;
	private JLabel text;
	private bot bot;
	private Thread thread;
	
	public UI() throws Exception {
		this.bot = new bot();
		this.thread = new Thread(this.bot);
		
		this.startButton = new JButton("Start");
		this.startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thread.start();
			}
		});
		this.add(startButton, BorderLayout.NORTH);
		
		this.text = new JLabel("Press 's' to stop and 'e' to die.");
		this.text.setFont(new Font("Consolas", Font.PLAIN, 48));
		this.add(this.text, BorderLayout.CENTER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if (arg0.getKeyCode() == KeyEvent.VK_S) {
			System.out.println("You pressed 's'.");
			this.bot.end();
		} else if (arg0.getKeyCode() == KeyEvent.VK_E) {
			System.out.println("You pressed 'e'. You will die in 5-10 business days.");
			this.bot.end();
			this.thread.interrupt();
			System.exit(0);
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		//Do Nothing
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		//Do Nothing
	}
	
}
