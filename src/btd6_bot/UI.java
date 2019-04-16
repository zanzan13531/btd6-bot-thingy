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
	
	private JButton startButton; //declaring stuff
	private JButton softStop;
	private JButton hardStop;
	private JLabel text;
	private bot bot;
	private Thread thread;
	
	/* soft stop means that the bot finishes the current game and then stops
	 * hard stop means that the entire program immediately stops and
	 * exits
	 */
	
	public UI() throws Exception {
		this.bot = new bot(); //creates bot
		this.thread = new Thread(this.bot); //creates thread
		this.startButton = new JButton("Start"); //making the start button
		this.startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //actions when pressing the start button
				thread.start(); //starts the program
				startButton.setVisible(false); //hides the button
				softStop = new JButton("Stop at end of cycle (or press 's')"); //creates the soft stop button
				softStop.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) { //action when pressing the softstop button
						bot.end(); //ends at the end of the cycle
					}
				});
				add(softStop, BorderLayout.NORTH); //places the button
				hardStop = new JButton("Emergency stop (or press 'e')"); //making the hardstop button
				hardStop.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) { //action when pressing the hardstop button
						bot.end();
						thread.interrupt();
						System.exit(0); //shuts down the program
					}
				});
				add(hardStop, BorderLayout.SOUTH); //places button
			}
		});
		this.add(startButton, BorderLayout.NORTH); //places button
		
		this.text = new JLabel("BTD6 bot");
		this.text.setFont(new Font("Consolas", Font.PLAIN, 48)); //text stuff
		this.add(this.text, BorderLayout.CENTER);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //directions when closed
		//this.pack(); //compacts the size
		setSize(400, 300); //sets a size
		this.setVisible(true); //shows the JFrame
	}

	@Override
	public void keyPressed(KeyEvent arg0) { //softstop when 's' key is pressed
		if (arg0.getKeyCode() == KeyEvent.VK_S) {
			System.out.println("You pressed 's'.");
			this.bot.end();
		} else if (arg0.getKeyCode() == KeyEvent.VK_E) { //hardstop when 'e' key is pressed
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
