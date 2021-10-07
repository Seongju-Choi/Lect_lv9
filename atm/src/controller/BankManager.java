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
			System.out.println("1.로그인\n2.회원가입\n3.종료");
		}
		else System.out.println("1.계좌개설/철회\n2.은행업무\3.로그아웃");
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
