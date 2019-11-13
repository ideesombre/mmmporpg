package dice;

import java.util.Random;

public class DiceRandom {

	private static Random r = new Random();

	public static int d10() {
		return r.nextInt(10) + 1;
	}

	public static int d12() {
		return r.nextInt(12) + 1;
	}

	public static int random100() {
		return r.nextInt((100 - 1) + 1) + 1; // return int between 1 and 100
	}

}
