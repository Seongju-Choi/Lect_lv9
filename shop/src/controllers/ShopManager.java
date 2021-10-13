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
		boolean isRun = true;
		while(isRun) {
			printMenu();
			selectMenu();
		}
	}
	
	public void printMenu() {
	System.out.println("1.가입\n2.탈퇴\n3.로그인\n4.로그아웃\n100.관리자\n0.종료");	
	}
	
	public boolean selectMenu() {
		
		String input = sc.next();
		
		try {
			
			int sel = Integer.parseInt(input);
			
			if(sel == 1) {
				um.joinUser();
			}
			else if(sel == 2) {
				um.deleteAcc();
			}
			else if(sel == 3) {
				um.login();
			}
			else if(sel == 4) {
				if(um.log != -1) {
					System.out.println("=== 로그아웃 완료 ===");
					um.log = -1;
				}
				else System.out.println("=== 로그인 중인 계정이 없습니다. ===");
			}
			else if(sel == 100) {
				
			}
			else if(sel == 0) {
				return false;
			}
		} catch (Exception e) {
			System.out.println("=== 잘못된 입력입니다. ===");
		}
		return true;
	}
	
}
