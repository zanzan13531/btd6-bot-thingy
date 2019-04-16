package btd6_bot;

import java.awt.BorderLayout;
import java.awt.Font;
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
	
	private JLabel text;
	private bot bot;
	private Thread thread;
	
	public UI() throws Exception {
		this.bot = new bot();
		this.thread = new Thread(this.bot);
		this.thread.start();
		
		this.text = new JLabel("Press 's' to stop and 'e' to die.");
		this.text.setFont(new Font("Trebuchet MS", Font.PLAIN, 48));
		this.add(this.text, BorderLayout.CENTER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if (arg0.getKeyCode() == KeyEvent.VK_S) {
			this.bot.end();
		} else if (arg0.getKeyCode() == KeyEvent.VK_E) {
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
