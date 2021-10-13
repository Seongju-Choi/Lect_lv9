package controllers;

import java.util.Scanner;
import controllers.UserManager;

public class ShopManager {
	
	public static Scanner sc = new Scanner(System.in);
	public static ShopManager instance = new ShopManager();
	UserManager um = UserManager.instance;
	
	private ShopManager(){
		
	}
	
	public void run() {
		printMenu();
		selectMenu();
	}
	
	public void printMenu() {
	System.out.println("1.가입\n2.탈퇴\n3.로그인\n4.로그아웃\n100.관리자\n0.종료");	
	}
	
	public void selectMenu() {
		
		int sel = sc.nextInt();
		
		if(sel == 1) {
			um.joinUser();
		}
		else if(sel == 2) {
			um.deleteAcc();
		}
		else if(sel == 3) {
			
		}
		else if(sel == 4) {
			
		}
		else if(sel == 100) {
			
		}
		else if(sel == 0) {
			
		}
		
	}
	
}
