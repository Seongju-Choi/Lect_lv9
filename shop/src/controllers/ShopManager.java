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
			System.out.println("1.가입\n2.탈퇴\n3.로그인\n100.관리자\n0.종료");
		}
		else if(um.log == 100) {
			System.out.println("1.아이템관리\n2.카테고리관리\n3.장바구니관리\n4.유저관리\n0.로그아웃");
		}
		else System.out.println("1.쇼핑\n2.장바구니목록\n0.로그아웃");
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
					else System.out.println("=== 권한이 없는 접근입니다. ===");
				}
				else if(sel == 0) {
					return false;
				}
				else if(um.log == 100) {
					if(sel == 1) {
						itemMenu();
					}
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
			System.out.println("=== 잘못된 입력입니다. ===");
		}
		return true;
	}
	
	public void shoppingMenu() {
		
	}
	public void myCart() {
		
	}
	public void itemMenu() {
		System.out.println("1.아이템 추가\n2.아이템 삭제");
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
		System.out.println("1.카테고리 추가\n2.카테고리 삭제");
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
