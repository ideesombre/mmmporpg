package characters;

/**
 * 
 * @author Estelle
 *
 */
public abstract class Characters extends LivingThings{

	protected int xp = 0; // initialized at 0 when character created
	protected int xpNext = 100; // xp required to reach next level

	/**
	 * 
	 * @param pv
	 * @param strength
	 * @param agility
	 * @param intelligence
	 */
	public Characters(int pv, int strength, int agility, int intelligence) {
		this.level = 1;
		this.pv = pv;
		this.maxPv = pv;
		this.strength = strength;
		this.agility = agility;
		this.intelligence = intelligence;
	}

	public void levelUp() {
		level += 1; // update level
		xpNext *= 1.10; // update xp required for next level
		xp = 0; // Reinitialize xp to zero
	}

	public int getXp() {
		return xp;
	}

	public int getXpNext() {
		return xpNext;
	}

	@Override
	public String toString() {
		return "Characters [level=" + level + ", pv=" + pv + ", xp=" + xp + ", xpNext=" + xpNext + ", strength="
				+ strength + ", agility=" + agility + ", intelligence=" + intelligence + "]";
	}
	


}
