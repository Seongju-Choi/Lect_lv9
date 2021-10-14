package controllers;

import java.util.Scanner;

public class ShopManager {
	
	public static Scanner sc = new Scanner(System.in);
	public static ShopManager instance = new ShopManager();
	UserManager um = UserManager.instance;
	
	private ShopManager(){
		
	}
	
	public void run() {
		boolean isRun = true;
		while(isRun) {
			System.out.print("=== ");
			UserManager.instance.printuserList();
			System.out.println(" ===");
			System.out.println("log :  " + um.log);
			printMenu();
			selectMenu();
		}
	}
	
	public void printMenu() {
		if(um.log == -1) {
			System.out.println("1.����\n2.Ż��\n3.�α���\n100.������\n0.����");
		}
		else if(um.log == 100) {
			System.out.println("1.�����۰���\n2.ī�װ�����\n3.��ٱ��ϰ���\n4.��������\n0.�α׾ƿ�");
		}
		else System.out.println("1.����\n2.��ٱ��ϸ��\n0.�α׾ƿ�");
	}
	
	public boolean selectMenu() {
		
		String input = sc.next();
		
		try {
			
			int sel = Integer.parseInt(input);
			
				if(um.log == -1) {
				if(sel == 1) {
					um.joinUser();
				}
				else if(sel == 2) {
					um.deleteAcc();
				}
				else if(sel == 3) {
					um.logIn();
				}
				else if(sel == 100) {
					if(um.log == 100) {
						
					}
					else System.out.println("=== ������ ���� �����Դϴ�. ===");
				}
				else if(sel == 0) {
					return false;
				}
				else if(um.log == 100) {
					if(sel == 1) {item}
					else if(sel == 2) {}
					else if(sel == 3) {}
					else if(sel == 4) {}
					else if(sel == 0) {
						um.logOut();
					}
				}
				else {
					if(sel == 1) {
						shoppingMenu();
					}
					else if(sel == 2) {
						
					}
					else if(sel == 0) {
						um.logOut();
					}
				}
			}
		} catch (Exception e) {
			System.out.println("=== �߸��� �Է��Դϴ�. ===");
		}
		return true;
	}
	
	
	
	public void shoppingMenu() {
		
	}
	
}
