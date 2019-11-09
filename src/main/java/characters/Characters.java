package characters;

/**
 * 
 * @author Estelle
 *
 */
public abstract class Characters extends LivingThings {

	protected int xp = 0; // initialized at 0 when character created
	private int xpNext = 100; // xp required to reach next level

	/**
	 * 
	 * @param pv
	 * @param strength
	 * @param agility
	 * @param intelligence
	 */
	public Characters(int maxPv, int strength, int agility, int intelligence) {
		super(maxPv, strength, agility, intelligence);
	}

	public void levelUp() {
		level += 1; // update level
		xpNext *= 1.10; // update xp required for next level by 10 %
		maxPv *= 1.3; // update max PV by 30%
		pv = maxPv;
		xp = 0; // Reinitialize xp to zero
	}

	@Override
	public String toString() {
		return "Characters [level=" + level + ", pv=" + pv + ", xp=" + xp + ", xpNext=" + xpNext + ", strength="
				+ strength + ", agility=" + agility + ", intelligence=" + intelligence + "]";
	}



	public int getXp() {
		return xp;
	}

	public int getXpNext() {
		return xpNext;
	}




}
