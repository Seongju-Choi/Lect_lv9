package controller;

import model.Bank;

public class BankManager {
	
	private BankManager() {
		
	}
	public static BankManager instance = new BankManager();
	
	public void run() {
		boolean isRun = true;
		while(isRun) {
			printMenu();
			selectMenu();
		}
	}
	
	private void printMenu() {
		if(Bank.log == -1) {
			System.out.println("1.�α���\n2.ȸ������\n3.����");
		}
		else System.out.println("1.���°���/öȸ\n2.�������\3.�α׾ƿ�");
	}
	private void selectMenu() {
		System.out.print("menu : ");
		int sel = Bank.sc.nextInt();
		
		if(sel == 1) {
			
		}
		else if(sel == 2) {
			
		}
		else if(sel == 3) {
			
		}
	}
}
