package run;

import characters.LivingThings;

public class Game {
	
	int round;
	LivingThings perso;
	int maxRound = 15;
	
	public Game(LivingThings perso) {
		this.round = 1;
		this.perso = perso;
		Round.round(this);
	}
	
	public Game(int round, LivingThings perso) {
		this.round = round;
		this.perso = perso;
	}

	
	public void nextRound() {
		round++;
	}
	
	public int getRound() {
		return round;
	}
	
	public LivingThings getPerso() {
		return perso;
	}
}
