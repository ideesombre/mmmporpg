package dice;

import java.util.Random;

public class DiceRandom {

	private Random r = new Random();
	
	public int d10() {
		return r.nextInt(10)+1;
	}
	
	public int d12() {
		return r.nextInt(12)+1;
	}
	


}
