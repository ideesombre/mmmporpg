package characters;

/**
 * 
 * @author Estelle
 *
 */
public abstract class Characters {

	private int level = 0;
	protected int pv;  //different for each class
	protected int xp = 0; // initialized at 0 when character created
	private int xpNext = 100; // xp required to reach next level
	protected int strength; //different for each class
	protected int agility;  //different for each class
	protected int intelligence;  //different for each class

	/**
	 * 
	 * @param pv
	 * @param strength
	 * @param agility
	 * @param intelligence
	 */
	public Characters(int pv, int strength, int agility, int intelligence) {
		this.pv = pv;
		this.strength = strength;
		this.agility = agility;
		this.intelligence = intelligence;
	}

	public void levelUp() {
		level += 1; // update level
		xpNext *= 1.10; // update xp required for next level
		xp = 0; // Reinitialize xp to zero
	}

	@Override
	public String toString() {
		return "Characters [level=" + level + ", pv=" + pv + ", xp=" + xp + ", xpNext=" + xpNext + ", strength="
				+ strength + ", agility=" + agility + ", intelligence=" + intelligence + "]";
	}

	public int getLevel() {
		return level;
	}

	public int getPv() {
		return pv;
	}

	public int getXp() {
		return xp;
	}

	public int getXpNext() {
		return xpNext;
	}

	public int getStrength() {
		return strength;
	}

	public int getAgility() {
		return agility;
	}

	public int getIntelligence() {
		return intelligence;
	}
	


}
