package entities;

public class Champion {

	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public int getArmor() {
		return armor;
	}
	
	public void takeDamage(Champion other) {
		Champion champion = other;
		
		if(getLife() > 0 && getArmor() < champion.attack) {
			life -= champion.attack - armor;
		}
		if(getLife() > 0 && getArmor() >= champion.attack) {
			life += - 1;
		}		
	}
	
	public String status() {
		String livingConditions = "";
		
		if(getLife() <= 0) {
			livingConditions = "(morreu)";
			setLife(0);
		}		
		
		return getName()
				+ ": "
				+ String.format("%d", getLife())
				+ " de vida "
				+ String.format("%s", livingConditions);	
	}	
}
