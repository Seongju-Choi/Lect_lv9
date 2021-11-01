package models;

public class SCV extends GroundUnit {

	public SCV() {
		super(150, 5, 1);
		System.out.println("이야~야근이다");
		System.out.println(super.getHp() + "/" + super.getAtk() + "/" + super.getDef());
	}
	
}
