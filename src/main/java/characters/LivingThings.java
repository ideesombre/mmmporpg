package characters;

public abstract class LivingThings {
	
	protected int level = 1; // increase everytime we meet the coach or xp is at max
	protected int pv;  //different for each class
	protected int mxPv; // max PV when fully healed
	protected int xp = 0; // initialized at 0 when character created
	protected int xpNext = 100; // xp required to reach next level
	protected int strength; //different for each class
	protected int agility;  //different for each class
	protected int intelligence;  //different for each class
	
	

}
