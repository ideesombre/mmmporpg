package Monsters;

public abstract class Monsters {

	private int level;
	protected int pv;  //different for each class
	protected int agility;  //different for each class
	
	
	public Monsters(int level, int pv, int agility) {
		super();
		this.level = level;
		this.pv = pv;
		this.agility = agility;
	}


	public int getLevel() {
		return level;
	}


	public int getPv() {
		return pv;
	}


	public int getAgility() {
		return agility;
	}


	public void setPv(int pv) {
		this.pv = pv;
	}
	
	
	
	
}
