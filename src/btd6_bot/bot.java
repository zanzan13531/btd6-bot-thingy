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

			pressKey(r, KeyEvent.VK_U);

			Thread.sleep(500);

			click(r);

			Thread.sleep(500);

			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(666, 400); // go to position of ninja placement
				Thread.sleep(25);
			}

			Thread.sleep(500);

			pressKey(r, KeyEvent.VK_D);

			Thread.sleep(500);

			click(r);

			Thread.sleep(500);

			click(r);

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

			click(r);

			Thread.sleep(500);

			click(r);

			Thread.sleep(60000); // 4 min in

			pressKey(r, KeyEvent.VK_SLASH);

			Thread.sleep(500);

			pressKey(r, KeyEvent.VK_SLASH);

			Thread.sleep(60000); // 5 min in

			pressKey(r, KeyEvent.VK_SLASH);

			Thread.sleep(15000); // 5:15 min in

			pressKey(r, KeyEvent.VK_COMMA);

			Thread.sleep(60000); // 6:15 min in

			pressKey(r, KeyEvent.VK_COMMA);

			Thread.sleep(90000); // 7:45 min in

			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(971, 799); // go to position of freeplay button
				Thread.sleep(25);
			}

			Thread.sleep(500);

			click(r);

			Thread.sleep(3000);

			pressKey(r, KeyEvent.VK_SPACE);

			Thread.sleep(3000);

			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(1311, 85); // go to position of settings button
				Thread.sleep(25);
			}

			Thread.sleep(500);

			click(r);

			Thread.sleep(500);

			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(925, 800); // go to position of restart button
				Thread.sleep(25);
			}

			Thread.sleep(500);

			click(r);

			Thread.sleep(500);

			for (int focus = 0; focus < 8; focus++) {
				r.mouseMove(990, 683); // go to position of confirm restart button
				Thread.sleep(25);
			}

			Thread.sleep(500);

			click(r);
		}

	}
	
	public static void click(Robot r) throws Exception {
		r.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(100);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(100);
	}
	
	public static void pressKey(Robot r, int key) throws Exception {
		r.keyPress(key);
		Thread.sleep(100);
		r.keyRelease(key);
	}

}