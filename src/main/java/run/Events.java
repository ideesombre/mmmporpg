package run;

import fight.Fight;

public class Events {

	public static void healerEvent(Game game) {

		if (game.getPerso().getPv() == game.getPerso().getMaxPv()
				|| game.getPerso().getPv() >= game.getPerso().getMaxPv() * 75 / 100) {
			game.getPerso().setPv(game.getPerso().getMaxPv());
		} else {
			game.getPerso().setPv(game.getPerso().getMaxPv() * 25 / 100);
		}
	}
	
	public static void coatchEvent(Game game) {
		
		game.getPerso().levelUp();
		
	}
	
	public static void fightEvent(Game game) {
		Fight.fight(game);
	}

}
