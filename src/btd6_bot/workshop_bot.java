package btd6_bot;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class workshop_bot {

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
				r.mouseMove(840, 446); // go to position of obyn placement
				Thread.sleep(25);
			}

			Thread.sleep(500);

			r.keyPress(KeyEvent.VK_U); // obyn hotkey
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_U);

			Thread.sleep(500);

			r.mousePress(InputEvent.BUTTON1_MASK); // pulaces down obyn
			Thread.sleep(100);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(100);

			Thread.sleep(500);

			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(847, 391); // go to position of ninja placement
				Thread.sleep(25);
			}

			Thread.sleep(500);

			r.keyPress(KeyEvent.VK_D); // ninja hotkey
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_D);

			Thread.sleep(500);

			r.mousePress(InputEvent.BUTTON1_MASK); // places down ninja
			Thread.sleep(100);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(100);

			Thread.sleep(500);

			r.mousePress(InputEvent.BUTTON1_MASK); // clicks on ninja
			Thread.sleep(100);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(100);

			Thread.sleep(500);

			r.keyPress(KeyEvent.VK_SPACE); // starts rounds
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_SPACE);

			Thread.sleep(500);

			r.keyPress(KeyEvent.VK_SPACE); // speeds stuff up
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_SPACE);

			Thread.sleep(500);

			r.keyPress(KeyEvent.VK_SLASH); // bottom path hotkey (001 ninja)
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_SLASH);

			Thread.sleep(500);

			r.keyPress(KeyEvent.VK_COMMA); // top path hotkey (101 ninja)
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_COMMA);

			Thread.sleep(500);

			r.keyPress(KeyEvent.VK_COMMA); // top path hotkey (201 ninja)
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_COMMA);

			Thread.sleep(45000); // 45 secs in

			r.keyPress(KeyEvent.VK_COMMA); // top path hotkey (301 ninja)
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_COMMA);

			Thread.sleep(75000); // 2 min in

			r.keyPress(KeyEvent.VK_COMMA); // top path hotkey (401 ninja)
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_COMMA);

			Thread.sleep(60000); // 3 min in

			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(1004, 364); // go to position of super placement
				Thread.sleep(25);
			}

			Thread.sleep(500);

			r.keyPress(KeyEvent.VK_S); // super hotkey
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_S);

			Thread.sleep(500);

			r.mousePress(InputEvent.BUTTON1_MASK); // places down super
			Thread.sleep(100);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(100);

			Thread.sleep(500);

			r.mousePress(InputEvent.BUTTON1_MASK); // clicks on super
			Thread.sleep(100);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(100);

			Thread.sleep(60000); // 4 min in

			r.keyPress(KeyEvent.VK_SLASH); // bottom path hotkey (001 super)
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_SLASH);

			Thread.sleep(500);

			r.keyPress(KeyEvent.VK_SLASH); // bottom path hotkey (002 super)
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_SLASH);

			Thread.sleep(60000); // 5 min in

			r.keyPress(KeyEvent.VK_SLASH); // bottom path hotkey (003 super)
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_SLASH);

			Thread.sleep(15000); // 5:15 min in

			r.keyPress(KeyEvent.VK_COMMA); // top path hotkey (103 super)
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_COMMA);

			Thread.sleep(15000); // 6:25 min in

			r.keyPress(KeyEvent.VK_COMMA); // top path hotkey (203 super)
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_COMMA);

			Thread.sleep(30000); // 7:35 min in

			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(936, 736); // go to position of freeplay button
				Thread.sleep(25);
			}

			Thread.sleep(500);

			r.mousePress(InputEvent.BUTTON1_MASK); // clicks on freeplay button
			Thread.sleep(100);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(100);

			Thread.sleep(3000);

			r.keyPress(KeyEvent.VK_SPACE); // starts freeplay mode
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_SPACE);

			Thread.sleep(3000);

			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(1332, 71); // go to position of settings button
				Thread.sleep(25);
			}

			Thread.sleep(500);

			r.mousePress(InputEvent.BUTTON1_MASK); // clicks on settings button
			Thread.sleep(100);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(100);

			Thread.sleep(500);

			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(889, 745); // go to position of restart button
				Thread.sleep(25);
			}

			Thread.sleep(500);

			r.mousePress(InputEvent.BUTTON1_MASK); // clicks on restart button
			Thread.sleep(100);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(100);

			Thread.sleep(500);

			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(948, 640); // go to position of confirm restart button
				Thread.sleep(25);
			}

			Thread.sleep(500);

			r.mousePress(InputEvent.BUTTON1_MASK); // clicks on confirm restart button
			Thread.sleep(100);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(100);

		}

	}

}