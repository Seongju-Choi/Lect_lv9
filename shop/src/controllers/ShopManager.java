package controllers;

import models.Shop;
import controllers.UserManager;

public class ShopManager {
	
	public static ShopManager instance = new ShopManager();
	
	private ShopManager(){
		
	}
	
	public void run() {
		printMenu();
		selectMenu();
	}
	
	public void printMenu() {
	System.out.println("1.����\n2.Ż��\n3.�α���\n4.�α׾ƿ�\n100.������\n0.����");	
	}
	
	public void selectMenu() {
		
		int sel = Shop.sc.nextInt();
		
		if(sel == 1) {}
		else if(sel == 2) {}
		else if(sel == 3) {}
		else if(sel == 4) {}
		else if(sel == 100) {}
		else if(sel == 0) {}
		
	}
	
//	public void 
}
