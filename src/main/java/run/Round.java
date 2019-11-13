package run;

import dice.DiceRandom;

public class Round {

	
	public static void round(Game game) {
		
		// TODO random sur 100
		// TODO check value for event
		// 1<= x <=70  then fight
		// 71 <= x <= 90 then coach
		// 91 <= x <= 100 then healer
		int eventChance = DiceRandom.random100();
		
		if (eventChance <= 70) {
			Events.fightEvent(game);
		} else if (eventChance <=90) {
			Events.coatchEvent(game);
		} else {
			Events.healerEvent(game);
		}
		
		
	}

}
