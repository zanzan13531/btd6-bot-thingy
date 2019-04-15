package btd6_bot;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;

public class coordinate_finder {
	
	public static void main(String[] args) throws Exception {
		
		Thread.sleep(3000);
		
		for(int i = 0; i < 10; i++) {
			
			PointerInfo a = MouseInfo.getPointerInfo();
			Point b = a.getLocation();
			int x = (int) b.getX();
			int y = (int) b.getY();
			System.out.println("(" + x + ", " + y + ")");
			
			Thread.sleep(100);	
		}

	}

}
