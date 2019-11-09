package fight;

import characters.*;
import dice.DiceRandom;

public class Fight {
	
	private static DiceRandom r = new DiceRandom();
	private static int physicalfightLuck ;
	private static int magicalfightLuck ;
	


	/**
	 * 
	 * @param Character me - the attacker
	 * @param Monster monster - the defender
	 * @param Enum basicLuck in % - physical or magical basic success ratio
	 * @return int in %- the attack success ratio
	 */
	public static int fightLuck(LivingThings me, LivingThings monster, BasicSuccessRatio basicLuck) {
		return basicLuck.getBasicLuck() + (monster.getLevel() - me.getLevel())*10
				+(monster.getAgility() - me.getAgility())*5;
	}
	
	// TODO scanner pour demander si fight physique or magical
	/**
	 * fight event
	 * 
	 * @return whether the fight was a success
	 */
	public static boolean fight(LivingThings me, LivingThings monster) {
		setPhysicalfightLuck(fightLuck(me, monster, BasicSuccessRatio.PHYSICAL));
		setMagicalfightLuck(fightLuck(me, monster, BasicSuccessRatio.MAGICAL));
		boolean success = true;
//		while ( me.stillAlive() && monster.stillAlive()) {
//			
//			
//		}
		 
		
		
		// TODO
		/*
		 * while (me.getPv() > 0 && monster.getPv() > 0) {
		 * continue le fight
		 * 
		 * alterne les attaquants et demande si physique ou magique
		 * 
		 *  if !attack() 
		 *  break;
		 *  
		 *  else 
		 *  continue fight
		 */
		return success;
		
	}
	

	/**
	 * Physical attack
	 * 
	 * @return whether the attack was a success
	 */
//	public static boolean physicalAttack(LivingThings perso) {
//		int power = perso.getStrength() + r.d12();
//		if ()
//		boolean success = true; 
//		// TODO
//		return success;
//		
//	}
	
	public int getPhysicalfightLuck() {
		return physicalfightLuck;
	}

	public static void setPhysicalfightLuck(int physicalLuck) {
		physicalfightLuck = physicalLuck;
	}

	public int getMagicalfightLuck() {
		return magicalfightLuck;
	}

	public static void setMagicalfightLuck(int magicalLuck) {
		magicalfightLuck = magicalLuck;
	}
	
}
