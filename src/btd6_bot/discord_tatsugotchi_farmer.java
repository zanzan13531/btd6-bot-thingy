package btd6_bot;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

public class discord_tatsugotchi_farmer {

	public static void main(String[] args) throws Exception { // THROW EXCEPTION; you'll need to throw AWTException or
																// InterruptedException and its just easier to throw the
																// master superclass
		/*
		 * Robot r = new Robot(); // INSTANTIATE ROBOT
		 * 
		 * // THIS CODE PRESSES A KEY // you generally want the thread.sleep in the
		 * middle to have like 50 to 200 milliseconds of time between pressing and
		 * releasing the key to make sure it registers // to change the key, just change
		 * the part after VK to whatever you want. If you need to press shift, make the
		 * application hold down the shift key before pressing
		 * r.keyPress(KeyEvent.VK_ALT); Thread.sleep(100);
		 * r.keyRelease(KeyEvent.VK_ALT);
		 * 
		 * // THIS CODE MOVES THE MOUSE // this currently moves to 20, 10; input where
		 * you want the mouse to go as (x, y) // note that because of tv he focus, this
		 * sadly is not instantaneous, but still is fairly fast and accurate for(int
		 * focus = 0; focus < 8; focus++ ) { r.mouseMove(20, 10); Thread.sleep(25); }
		 * 
		 * // THIS CODE WAITS // this is in milliseconds; currently the code waits for 1
		 * second Thread.sleep(1000);
		 * 
		 * // THIS CODE CLICKS THE MOUSE // the waits are necessary for the clicks to
		 * register r.mousePress(InputEvent.BUTTON1_MASK); Thread.sleep(100);
		 * r.mouseRelease(InputEvent.BUTTON1_MASK); Thread.sleep(100);
		 */

		Robot r = new Robot(); // INSTANTIATE ROBOT
		Random random = new Random();

		Thread.sleep(10000); //time to get ready
		
		double wait = 0;
		int time = 0;
		
		while (true) {
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			
			Thread.sleep(100);
			
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			wait = 15 + Math.abs(random.nextDouble() * 15);
			time = (int) (wait * 1000);
			
			Thread.sleep(time);
			
		}

	}

}