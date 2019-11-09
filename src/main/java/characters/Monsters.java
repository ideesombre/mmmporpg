package characters;

import java.util.Random;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Monsters extends LivingThings{

	private Random r = new Random();
	

	public Monsters(int level, int maxPv, int strength, int agility, int intelligence) {
		super(level, maxPv, strength, agility, intelligence);	
	}


	@Override
	public void levelUp() {
		// TODO Auto-generated method stub
		
	}

}
