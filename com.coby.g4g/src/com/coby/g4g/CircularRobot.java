package com.coby.g4g;

public class CircularRobot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String path = "GLGLGLG";
		String path2 = "GLGGGLGLG";
		
		circularPath(path);
		circularPath(path2);
	}
	
	public static void circularPath(String path) {
		int x = 0;
		int y = 0;
		int dir = 0;
		for (char c:path.toCharArray()) {
			if (c == 'R') {
				dir = (((dir + 1) % 4) + 4) % 4;
			} else if (c == 'L') {
				dir = (((dir - 1) % 4) + 4) % 4;
			} else if (c == 'G') {
				switch(dir) {
					case 0: y += 1;
					break;
					case 1: x += 1;
					break;
					case 2: y -= 1;
					break;
					case 3: x -= 1;
					break;
				}
//				System.out.println("dir: " + dir + " x,y: " + x + "," + y);
			}
		}
//		System.out.println(x + "," + y);
		if (x == 0 && y == 0) {
			System.out.println("Circular");
		} else {
			System.out.println("Not Circular");
		}
	}

}
