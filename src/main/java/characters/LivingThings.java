
package characters;

public abstract class LivingThings {

	protected int level; // increase everytime we meet the coach or xp is at max
	protected int pv; // different for each class
	protected int maxPv; // max PV when fully healed
	protected int strength; // different for each class
	protected int agility; // different for each class
	protected int intelligence; // different for each class

	public int getStrength() {
		return strength;
	}

	public int getAgility() {
		return agility;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public int getLevel() {
		return level;
	}

	public int getPv() {
		return pv;
	}

	public int getMaxPv() {
		return maxPv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public boolean stillAlive() {
		return pv > 0;
	}
	
	public abstract void levelUp();

}
