package Zombiegame;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	
	Scanner sc = new Scanner(System.in);
	
	Hero player;
	ArrayList<Unit> enemy = new ArrayList<>();
	private Game() {}
	private static Game instance = new Game();
	public static Game getInstance() {
			return instance;
	} 
	
	public void run() {
		
		boolean isRun = true;
		while(isRun) {
			setGame();
			printGame();
			int sel = sc.nextInt();
			
			if(sel == 1) {}
			else if(sel == 2) {}
			else if(sel == 3) {move();}
		}
	}
	
	public void setGame() {
		player = new Hero("���", 100, 5, 5, 0);
		enemy.add(new Zombie("��������",10,5,5,3));
		enemy.add(new Zombie("���ݰ�������",50,10,10,6));
		enemy.add(new Zombie("��������",100,15,15,9));
	}
	public void printGame() {
		System.out.println("[���� �� : " + player.getFloor() +"]");
		System.out.println("[1]ȸ���ϱ�");
		System.out.println("[2]��ȭ�ϱ�");
		System.out.println("[3]���������� �̵�");
		System.out.print("�Է� : ");
	}
	
	public void move() {
		int floor = player.getFloor() +1;
		System.out.println(floor);
		player.setFloor(floor);
		System.out.println(player.getFloor());
		
	}
	public void healing() {
		if(player.getHp() >= 0) {
			
		}
		else
	}
	
	
}
