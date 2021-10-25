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
		player = new Hero("용사", 100, 5, 5, 0);
		enemy.add(new Zombie("보통좀비",10,5,5,3));
		enemy.add(new Zombie("조금강한좀비",50,10,10,6));
		enemy.add(new Zombie("강한좀비",100,15,15,9));
	}
	public void printGame() {
		System.out.println("[현재 층 : " + player.getFloor() +"]");
		System.out.println("[1]회복하기");
		System.out.println("[2]강화하기");
		System.out.println("[3]다음층으로 이동");
		System.out.print("입력 : ");
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
