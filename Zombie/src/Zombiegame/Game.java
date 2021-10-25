package Zombiegame;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	
	Scanner sc = new Scanner(System.in);
	
	Hero player;
	ArrayList<Unit> enemy = new ArrayList<>();
	private Game() {}
	private static Game instance = new Game();
	public void getsInstance() = {} 
	
	public void setGame() {
		player = new Hero("용사", 100, 5, 5, 0);
		enemy.add(new Zombie("보통좀비",10,5,5,3));
		enemy.add(new Zombie("조금강한좀비",50,10,10,6));
		enemy.add(new Zombie("강한좀비",100,15,15,9));
	}
	public void printGame() {
		System.out.println("[현재 층 : " + player.getFloor() +"]");
	}
	
	
}
