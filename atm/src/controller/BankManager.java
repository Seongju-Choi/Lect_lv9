package controller;

import model.Bank;

public class BankManager {
	
	private UserManager um = UserManager.instance;
	
	public static BankManager instance = new BankManager();
	private BankManager() {
		
	}
	
	public void run() {
		boolean isRun = true;
		while(isRun) {
			System.out.println(Bank.getName() + "ATM");
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
		String input = Bank.sc.next();
		
		try {
			
			if(Bank.log == -1) {
				System.out.print("menu : ");
				int sel = Integer.parseInt(input);
				
				if(sel == 1) {
					Bank.log = um.login();
				}
				else if(sel == 2) {
					um.joinUser();
				}
				else if(sel == 3) {
					
				}
			}
			else {
				
			}
		} catch(Exception e){
			
		}
	}
}
