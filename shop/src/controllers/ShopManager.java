package controllers;

import java.util.Scanner;

public class ShopManager {
	
	public static Scanner sc = new Scanner(System.in);
	public static ShopManager instance = new ShopManager();
	UserManager um = UserManager.instance;
	ItemManager im = ItemManager.instance;
	
	private ShopManager(){
		
	}
	
	public void run() {
		while(true) {
			System.out.print("[debug]usersize :  ");
			UserManager.instance.printuserList();
			System.out.println("[debug]log :  " + UserManager.log);
			printMenu();
			selectMenu();
		}
	}
	
	public void printMenu() {
		if(UserManager.log == -1 || UserManager.log == 100) {
			System.out.println("1.����\n2.Ż��\n3.�α���\n4.�α׾ƿ�\n100.������\n0.����");
		}
		else System.out.println("1.����\n2.��ٱ��ϸ��\n0.�α׾ƿ�");
		
	}
	
	public void selectMenu() {
		
		String input = sc.next();
		
		try {
			
			int sel = Integer.parseInt(input);
			
				if(UserManager.log == -1) {
					if(sel == 1) {
						um.joinUser();
					}
					else if(sel == 2) {
						um.deleteAcc();
					}
					else if(sel == 3) {
						um.logIn();
					}
					else if(sel == 4) {
						UserManager.log = -1;
					}
					else if(sel == 100) {
						if(UserManager.log == 100) {
							adminMenu();
						}
						else System.out.println("=== ������ ���� �����Դϴ�. ===");
					}
					else if(sel == 0) {
						
					}
				}
				else {
					if(sel == 1) {
						shoppingMenu();
					}
					else if(sel == 2) {
						
					}
					else if(sel == 0) {
						UserManager.log = -1;
					}
				}
		} catch (Exception e) {
			System.out.println("=== �߸��� �Է��Դϴ�. ===");
		}
	}
	
	public void shoppingMenu() {
		
	}
	public void myCart() {
		
	}
	
	public void adminMenu() {
		boolean run = true;
		while(true) {
			System.out.println("1.�����۰���\n2.ī�װ�����\n3.��ٱ��ϰ���\n4.��������\n0.�ڷΰ���");
			int sel = ShopManager.sc.nextInt();
			
			if(sel == 1) {
				itemMenu();
			}
			else if(sel == 2) {
				categoryMenu();
			}
			else if(sel == 3) {}
			else if(sel == 4) {}
			else if(sel == 0) {
				run = false;
			}
		}
	}
	
	public void itemMenu() {
		System.out.println("1.������ �߰�\n2.������ ����");
		int sel = ShopManager.sc.nextInt();
		if(sel == 1) {
			im.addItem();
		}
		else if(sel == 2) {
			im.delItem();
		}
		else if(sel == 0) {
			selectMenu();
		}
		
	}
	public void categoryMenu() {
		System.out.println("1.ī�װ� �߰�\n2.ī�װ� ����");
		int sel = ShopManager.sc.nextInt();
		if(sel == 1) {
			im.addCategory();
		}
		else if(sel == 2) {
			im.delCatgory();
		}
		else if(sel == 0) {
			selectMenu();
		}
	}
}
