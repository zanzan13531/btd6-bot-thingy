package btd6_bot;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

//commit test

public class bot {
	
	public static void main(String[] args) throws Exception {

		Robot r = new Robot();//The robot which does stuff

		while (true) {

			Thread.sleep(10000); // just to get everything ready

			// starts in game
			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(581, 385); // go to position of obyn placement
				Thread.sleep(25);
			}

			Thread.sleep(500);

			pressKey(r, KeyEvent.VK_U); // obyn hotkey

			Thread.sleep(500);

			click(r);

			Thread.sleep(500);

			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(666, 400); // go to position of ninja placement
				Thread.sleep(25);
			}

			Thread.sleep(500);

			pressKey(r, KeyEvent.VK_D); // ninja hotkey

			Thread.sleep(500);

			click(r); // places ninja

			Thread.sleep(500);

			click(r); // clicks on ninja

			Thread.sleep(500);
			
			pressKey(r, KeyEvent.VK_SPACE); // starts game

			Thread.sleep(500);

			pressKey(r, KeyEvent.VK_SPACE); // fast forward's game

			Thread.sleep(500);

			pressKey(r, KeyEvent.VK_SLASH); // bottom path upgrade (001 ninja)

			Thread.sleep(500);

			pressKey(r, KeyEvent.VK_COMMA); // top path upgrade (101 ninja)

			Thread.sleep(500);

			pressKey(r, KeyEvent.VK_COMMA); // top path upgrade (201 ninja)

			Thread.sleep(45000); // 45 secs in

			pressKey(r, KeyEvent.VK_COMMA); // top path upgrade (301 ninja)

			Thread.sleep(75000); // 2 min in

			pressKey(r, KeyEvent.VK_COMMA); // top path upgrade (401 ninja)

			Thread.sleep(60000); // 3 min in

			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(659, 311); // go to position of super placement
				Thread.sleep(25);
			}

			Thread.sleep(500);

			pressKey(r, KeyEvent.VK_S); // super monkey hotkey

			Thread.sleep(500);

			click(r); // places super monkey

			Thread.sleep(500);

			click(r); // clicks on super monkey

			Thread.sleep(60000); // 4 min in

			pressKey(r, KeyEvent.VK_SLASH); // bottom path upgrade (001 super)

			Thread.sleep(500);

			pressKey(r, KeyEvent.VK_SLASH); // bottom path upgrade (002 super)

			Thread.sleep(60000); // 5 min in

			pressKey(r, KeyEvent.VK_SLASH); // bottom path upgrade (003 super)

			Thread.sleep(15000); // 5:15 min in

			pressKey(r, KeyEvent.VK_COMMA); // top path upgrade (103 super)

			Thread.sleep(60000); // 6:15 min in

			pressKey(r, KeyEvent.VK_COMMA); // top path upgrade (203 super)

			Thread.sleep(90000); // 7:45 min in

			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(971, 799); // go to position of freeplay button
				Thread.sleep(25);
			}

			Thread.sleep(500);

			click(r); // clicks on freeplay button

			Thread.sleep(3000);

			pressKey(r, KeyEvent.VK_SPACE); // starts freeplay

			Thread.sleep(3000);

			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(1311, 85); // go to position of settings button
				Thread.sleep(25);
			}

			Thread.sleep(500);

			click(r); // clicks on settings button

			Thread.sleep(500);

			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(925, 800); // go to position of restart button
				Thread.sleep(25);
			}

			Thread.sleep(500);

			click(r); // clicks on restart button

			Thread.sleep(500);

			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(990, 683); // go to position of confirm restart button
				Thread.sleep(25);
			}

			Thread.sleep(500);

			click(r); // clicks on confirm restart button
		}

	}
	
	public static void click(Robot r) throws Exception { // method that clicks
		r.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(100);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(100);
	}
	
	public static void pressKey(Robot r, int key) throws Exception { // method that presses a key
		r.keyPress(key);
		Thread.sleep(100);
		r.keyRelease(key);
	}

}