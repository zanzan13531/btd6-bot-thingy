package btd6_bot;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

// hello

public class bot implements Runnable {
	
	private Robot r;
	private boolean ended;
	
	public bot() throws Exception {
		this.r = new Robot();
	}
	
	public void end() {
		this.ended = true;
	}
	
	@Override
	public void run() {
		try {
			while (true) {

				Thread.sleep(10000); // just to get everything ready

				// starts in game
				moveMouse(581, 385); // go to position of obyn placement

				pressKey(KeyEvent.VK_U); // obyn hotkey
				
				click();

				moveMouse(666, 400); // go to position of ninja placement

				pressKey(KeyEvent.VK_D); // ninja hotkey

				click(); // places ninja			

				click(); // clicks on ninja
				
				pressKey(KeyEvent.VK_SPACE); // starts game

				pressKey(KeyEvent.VK_SPACE); // fast forward's game

				pressKey(KeyEvent.VK_SLASH); // bottom path upgrade (001 ninja)

				pressKey(KeyEvent.VK_COMMA); // top path upgrade (101 ninja)

				pressKey(KeyEvent.VK_COMMA); // top path upgrade (201 ninja)

				Thread.sleep(44500); // 45 secs in

				pressKey(KeyEvent.VK_COMMA); // top path upgrade (301 ninja)

				Thread.sleep(74500); // 2 min in

				pressKey(KeyEvent.VK_COMMA); // top path upgrade (401 ninja)

				Thread.sleep(59500); // 3 min in

				moveMouse(659, 311); // go to position of super placement

				pressKey(KeyEvent.VK_S); // super monkey hotkey

				click(); // places super monkey

				click(); // clicks on super monkey

				Thread.sleep(59500); // 4 min in

				pressKey(KeyEvent.VK_SLASH); // bottom path upgrade (001 super)

				pressKey(KeyEvent.VK_SLASH); // bottom path upgrade (002 super)

				Thread.sleep(59500); // 5 min in

				pressKey(KeyEvent.VK_SLASH); // bottom path upgrade (003 super)

				Thread.sleep(14500); // 5:15 min in

				pressKey(KeyEvent.VK_COMMA); // top path upgrade (103 super)

				Thread.sleep(59500); // 6:15 min in

				pressKey(KeyEvent.VK_COMMA); // top path upgrade (203 super)

				Thread.sleep(89500); // 7:45 min in
				
				moveMouse(971, 799);

				click(); // clicks on freeplay button

				Thread.sleep(2500);

				pressKey(KeyEvent.VK_SPACE); // starts freeplay

				Thread.sleep(2500);

				moveMouse(1311, 85);
				
				click(); // clicks on settings button
				
				moveMouse(925, 800);
				
				click(); // clicks on restart button

				moveMouse(990, 683);
				
				if (this.ended) {
					break;
				}
				
				click(); // clicks on confirm restart button
			}
		} catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}
	
	public static void main(String[] args) throws Exception {
		bot b = new bot();
		b.run();
	}
	
	/**
	 * Moves the mouse to the specified coordinates.
	 * @param x The x-coordinate to move the mouse to.
	 * @param y The y-coordinate to move the mouse to.
	 * @throws Exception
	 */
	public void moveMouse(int x, int y) throws Exception {
		for (int focus = 0; focus < 8; focus++) {
			this.r.mouseMove(x, y); // go to position of ninja placement
			Thread.sleep(25);
		}
		
		Thread.sleep(500);
	}
	
	/**
	 * Clicks at the current mouse location.
	 * @throws Exception
	 */
	public void click() throws Exception {
		this.r.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(100);
		this.r.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(600);
	}
	
	/**
	 * Triggers a keypress.
	 * @param key The key to press
	 * @throws Exception
	 * @pineapple indent
	 */
	public void pressKey(int key) throws Exception {
		this.r.keyPress(key);
		Thread.sleep(100);
		this.r.keyRelease(key);
		Thread.sleep(500);
	}

}