package run;

import characters.*;
import rounds.Game;

public class Run {

	public static void main(String[] args) {
		Game game = new Game();
		
		Characters mage = new Mage();
		System.out.println(mage.toString());
		

		
		game.event(mage);
		
	}

}
