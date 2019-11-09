package dice;

import java.util.Random;

public class DiceRandom {

	private static Random r = new Random();

	public static int d12() {
		return r.nextInt(12) + 1;
	}

	public static boolean getRandPercent(int percent) {
		return ( r.nextInt(100) +1 ) <= percent;
	}

	public static int getRandPercent() {
		return r.nextInt(100) + 1;
	}
}
