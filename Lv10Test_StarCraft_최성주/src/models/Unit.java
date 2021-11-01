package models;

interface Repairable{
	
}

public class Unit {
	private int MAX_HP;
	private int hp;
	private int atk;
	private int def;
	
	public Unit(int hp, int atk, int def) {
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}
	
	public int getHp() {
		return hp;
	}
	public int setHp(int hp) {
		this.hp = hp;
		return this.hp;
	}
	
	public int getAtk() {
		return atk;
	}
	public int getDef() {
		return def;
	}
}
