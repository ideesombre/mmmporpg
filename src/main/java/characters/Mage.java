package characters;

public class Mage extends Characters {

	public Mage() {
		super(200, 6, 6, 10);
	}

	@Override
	public void levelUp() {
		super.levelUp();
		pv *= 1.06;
		strength += 2;
		agility += 1;
		intelligence += 5;
		System.out.println("Level up !");
	}

}
