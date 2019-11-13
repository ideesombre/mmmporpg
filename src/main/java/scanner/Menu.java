package scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import characters.*;
import run.Game;

public class Menu {

	private static Scanner sc = new Scanner(System.in);

	public static void startGame() {
		String str = mainMenu();

		// check the reply value
		if (str.equals("1") || str.equals("2")) {
			switch (str) {
			// Load a previous game
			case "1":
				System.out.println("Select your previous game to load");
				break;

			// create new perso
			case "2":
				createPerso();
				break;
			}
		} else { // return to mainMenu
			System.out.println("Your value is not valid");
			startGame();
		}

	}

	public static void startGame(Scanner sc) {
		String str = mainMenu();

		// check the reply value
		if (str.equals("1") || str.equals("2")) {
			switch (str) {
			// Load a previous game
			case "1":
				System.out.println("Select your previous game to load");
				break;

			// create new perso
			case "2":
				createPerso();
				break;
			}
		} else { // return to mainMenu
			System.out.println("Your value is not valid");
			startGame();
		}

	}

	public static String mainMenu() {

		System.out.println("Do you want to: \n 1. Load a previous game \n 2. New Game");
		return sc.nextLine();

	}

	public static void createPerso() {
		System.out.println("Select your character's category :\n 1. Warrior \n 2. Mage \n 3. Rogue ");
		String str = sc.nextLine();

		// check the reply value
		if (str.equals("1") || str.equals("2") || str.equals("3")) {
			LivingThings perso;
			Game game;
			switch (str) {

			case "1":
				perso = new Warrior();
				System.out.println("Welcome Warrior");
				System.out.println(perso.toString());
				game = new Game(perso);
				break;
			case "2":
				perso = new Mage();
				System.out.println("Welcome Mage");
				System.out.println(perso.toString());
				game = new Game(perso);
				break;
			case "3":
				perso = new Rogue();
				System.out.println("Welcome Rogue");
				System.out.println(perso.toString());
				game = new Game(perso);
				break;
			}
		} else {
			System.out.println("Your value is not valid");
			createPerso();
		}

	}

	public static int attackChoice() {
		System.out.println("Do you want to do :\n 1. a magical attack \n 2. a physical attack ");
		String str = sc.nextLine();

		// check the reply value
		try {
			if (str.equals("1") || str.equals("2")) {

				switch (str) {

				case "1":
					return 1;
				case "2":
					return 2;
				}
			}
		} catch (Exception e) {
			System.out.println("Your value is not valid");
			attackChoice();
		}

	}

}
