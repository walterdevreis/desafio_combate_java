package entities;

public class Champion {

	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion(String name, int life, int damage, int armor) {
		this.name = name;
		this.life = life;
		attack = damage;
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
		
		if(life > 0 && armor < champion.attack) {
			life -= champion.attack - armor;
		}
		if(life > 0 && armor >= champion.attack) {
			life += - 1;
		}		
	}
	
	public String status() {
		String livingConditions = "";
		
		if(life <= 0) {
			livingConditions = "(morreu)";
			life = 0;
		}		
		
		return name
				+ ": "
				+ String.format("%d", life)
				+ " de vida "
				+ String.format("%s", livingConditions);	
	}	
}
