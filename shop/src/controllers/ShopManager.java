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
	System.out.println("1.����\n2.Ż��\n3.�α���\n4.�α׾ƿ�\n100.������\n0.����");	
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
					System.out.println("=== �α׾ƿ� �Ϸ� ===");
					um.log = -1;
				}
				else System.out.println("=== �α��� ���� ������ �����ϴ�. ===");
			}
			else if(sel == 100) {
				
			}
			else if(sel == 0) {
				return false;
			}
		} catch (Exception e) {
			System.out.println("=== �߸��� �Է��Դϴ�. ===");
		}
		return true;
	}
	
}
