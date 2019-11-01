package characters;

public class Rogue extends Characters {

	public Rogue() {
		super(250, 8, 10, 8);
	}

	@Override
	public void levelUp() {
		super.levelUp();
		pv *= 1.08;
		strength += 2;
		agility += 3;
		intelligence += 2;
		System.out.println("Level up !");
	}

}
