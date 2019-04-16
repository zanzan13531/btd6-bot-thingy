package btd6_bot;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

//commit test

public class bot {
	
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

		/*
		 * //starts at beggining
		 * 
		 * for(int focus = 0; focus < 8; focus++ ) { r.mouseMove(808, 788); //go to
		 * position of play button Thread.sleep(25); }
		 * 
		 * Thread.sleep(500);
		 * 
		 * r.mousePress(InputEvent.BUTTON1_MASK); //clicks on play button
		 * Thread.sleep(100); r.mouseRelease(InputEvent.BUTTON1_MASK);
		 * Thread.sleep(100);
		 * 
		 * Thread.sleep(500);
		 * 
		 * for(int focus = 0; focus < 8; focus++ ) { r.mouseMove(1187, 842); //go to
		 * position of expert button Thread.sleep(25); }
		 * 
		 * Thread.sleep(500);
		 * 
		 * r.mousePress(InputEvent.BUTTON1_MASK); //clicks on expert button
		 * Thread.sleep(100); r.mouseRelease(InputEvent.BUTTON1_MASK);
		 * Thread.sleep(100);
		 * 
		 * Thread.sleep(500);
		 * 
		 * for(int focus = 0; focus < 8; focus++ ) { r.mouseMove(815, 216); //go to
		 * position of dark castle button Thread.sleep(25); }
		 * 
		 * Thread.sleep(500);
		 * 
		 * r.mousePress(InputEvent.BUTTON1_MASK); //clicks on dark castle button
		 * Thread.sleep(100); r.mouseRelease(InputEvent.BUTTON1_MASK);
		 * Thread.sleep(100);
		 * 
		 * Thread.sleep(500);
		 * 
		 * for(int focus = 0; focus < 8; focus++ ) { r.mouseMove(475, 366); //go to
		 * position of easy button Thread.sleep(25); }
		 * 
		 * Thread.sleep(500);
		 * 
		 * r.mousePress(InputEvent.BUTTON1_MASK); //clicks on easy button
		 * Thread.sleep(100); r.mouseRelease(InputEvent.BUTTON1_MASK);
		 * Thread.sleep(100);
		 * 
		 * Thread.sleep(500);
		 * 
		 * for(int focus = 0; focus < 8; focus++ ) { r.mouseMove(482, 533); //go to
		 * position of easy easy button Thread.sleep(25); }
		 * 
		 * Thread.sleep(500);
		 * 
		 * r.mousePress(InputEvent.BUTTON1_MASK); //clicks on easy easy button
		 * Thread.sleep(100); r.mouseRelease(InputEvent.BUTTON1_MASK);
		 * Thread.sleep(100);
		 * 
		 * Thread.sleep(6000);
		 * 
		 */

		while (true) {

			Thread.sleep(10000); // just to get everything ready

			// starts in game
			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(581, 385); // go to position of obyn placement
				Thread.sleep(25);
			}

			Thread.sleep(500);

			pressKey(r, KeyEvent.VK_U);

			Thread.sleep(500);

			click();

			Thread.sleep(500);

			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(666, 400); // go to position of ninja placement
				Thread.sleep(25);
			}

			Thread.sleep(500);

			pressKey(r, KeyEvent.VK_D);

			Thread.sleep(500);

			click();

			Thread.sleep(500);

			click();

			Thread.sleep(500);
			
			pressKey(r, KeyEvent.VK_SPACE);

			Thread.sleep(500);

			pressKey(r, KeyEvent.VK_SPACE);

			Thread.sleep(500);

			pressKey(r, KeyEvent.VK_SLASH);

			Thread.sleep(500);

			pressKey(r, KeyEvent.VK_COMMA);

			Thread.sleep(500);

			pressKey(r, KeyEvent.VK_COMMA);

			Thread.sleep(45000); // 45 secs in

			pressKey(r, KeyEvent.VK_COMMA);

			Thread.sleep(75000); // 2 min in

			pressKey(r, KeyEvent.VK_COMMA);

			Thread.sleep(60000); // 3 min in

			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(659, 311); // go to position of super placement
				Thread.sleep(25);
			}

			Thread.sleep(500);

			pressKey(r, KeyEvent.VK_S);

			Thread.sleep(500);

			click();

			Thread.sleep(500);

			click();

			Thread.sleep(60000); // 4 min in

			pressKey(r, VK_SLASH);

			Thread.sleep(500);

			pressKey(r, VK_SLASH);

			Thread.sleep(60000); // 5 min in

			pressKey(r, VK_SLASH);

			Thread.sleep(15000); // 5:15 min in

			pressKey(r, VK_COMMA);

			Thread.sleep(60000); // 6:15 min in

			pressKey(r, VK_COMMA);

			Thread.sleep(90000); // 7:45 min in

			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(971, 799); // go to position of freeplay button
				Thread.sleep(25);
			}

			Thread.sleep(500);

			click();

			Thread.sleep(3000);

			pressKey(r, VK_SPACE);

			Thread.sleep(3000);

			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(1311, 85); // go to position of settings button
				Thread.sleep(25);
			}

			Thread.sleep(500);

			click();

			Thread.sleep(500);

			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(925, 800); // go to position of restart button
				Thread.sleep(25);
			}

			Thread.sleep(500);

			click();

			Thread.sleep(500);

			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(990, 683); // go to position of confirm restart button
				Thread.sleep(25);
			}

			Thread.sleep(500);

			click();
		}

	}
	
	public static void click(Robot r) {
		r.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(100);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(100);
	}
	
	public static void pressKey(Robot r, KeyEvent key) {
		r.keyPress(key);
		Thread.sleep(100);
		r.keyRelease(key);
	}

}