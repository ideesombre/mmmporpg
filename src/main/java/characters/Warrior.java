package characters;

public class Warrior extends Characters {

	public Warrior() {
		super(300, 10, 8, 6);
	}

	@Override
	public void levelUp() {
		super.levelUp();
		pv *= 1.10;
		strength += 4;
		agility += 1;
		intelligence += 1;
		System.out.println("Level up !");
	}

}
