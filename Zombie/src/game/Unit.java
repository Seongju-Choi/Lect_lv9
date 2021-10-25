package game;

interface Attack{
	public void attack(); 
}
interface Damegeable{
	public void 
}

public class Unit {
	private String name;
	private int hp;
	private int atk;
	private int def;
	private int floor;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return this.atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return this.def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getFloor() {
		return this.floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	
}
