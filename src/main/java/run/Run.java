package run;

import characters.*;

public class Run {

	public static void main(String[] args) {
		Characters mage = new Mage();
		System.out.println(mage.toString());
		
		mage.levelUp();
		System.out.println(mage.toString());
	
		Characters warrior = new Warrior();
		System.out.println(warrior.toString());
		
		warrior.levelUp();
		System.out.println(warrior.toString());
	}

}
