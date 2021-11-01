package models;

public class Tank extends Unit {
	public Tank() {
		super(200, 30, 2);
		System.out.println("ÅÊÅ©");
		System.out.println(super.getHp() + "/" + super.getAtk() + "/" + super.getDef());
	}
}
