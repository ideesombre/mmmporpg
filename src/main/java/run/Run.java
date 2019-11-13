package run;

<<<<<<< HEAD
import characters.*;
=======
import java.util.Scanner;

import characters.*;
import scanner.Menu;
>>>>>>> 8d9f9206e8a16e51d7964dec8a7e8fb046122af6

public class Run {

	public static void main(String[] args) {
<<<<<<< HEAD
		Characters mage = new Mage();
		System.out.println(mage.toString());
		
		mage.levelUp();
		System.out.println(mage.toString());
	
		Characters warrior = new Warrior();
		System.out.println(warrior.toString());
		
		warrior.levelUp();
		System.out.println(warrior.toString());
=======
//		Scanner sc = new Scanner(System.in);
		
//		Characters mage = new Mage();
//		System.out.println(mage.toString());
//		
//		mage.levelUp();
//		System.out.println(mage.toString());
//	
//		Characters warrior = new Warrior();
//		System.out.println(warrior.toString());
//		
//		warrior.levelUp();
//		System.out.println(warrior.toString());
//		
		
		Menu.startGame();
		
//		Characters mage = new Mage();
//		System.out.println(mage.toString());
//		
//		mage.setPv(20);
//		System.out.println(mage.toString());
//		Game game = new Game(mage);
//		System.out.println(mage.getMaxPv());
//		
//		Events.healer(game);
//		System.out.println(mage.toString());

>>>>>>> 8d9f9206e8a16e51d7964dec8a7e8fb046122af6
	}

}
