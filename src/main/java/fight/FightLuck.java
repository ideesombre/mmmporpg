package fight;

import Monsters.Monster1;
import characters.Characters;

public class FightLuck {
	
	/**
	 * 
	 * @param me attacker
	 * @param monster defender
	 * @param basicLuck physical or magical
	 * @return the attack chance of 
	 */
	public int FightLuck(Characters me, Monster1 monster, BasicSuccessRatio basicLuck) {
		return basicLuck.getBasicLuck() + (monster.getLevel() - me.getLevel())*10/100
				+(monster.getAgility() - me.getAgility())*5/100;
	}
	
}
