package controller;

import model.Bank;
import controller.UserManager;

public class BankManager {
	
	private UserManager um = UserManager.instance;
	private AccountManager am = AccountManager.instance;
	private FileManager fm = FileManager.instance;
	
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
			System.out.println("1.로그인\n2.회원가입\n3.종료");
		}
		else System.out.println("1.계좌개설/철회\n2.은행업무\3.로그아웃");
		System.out.print("menu : ");
		
		if(Bank.log == 0) {
			System.out.println("8.관리자");
		}
	}
	private boolean selectMenu() {
		
		String input = Bank.sc.next();
		
		try {
			int sel = Integer.parseInt(input);
			if(Bank.log == -1) {
				
				if(sel == 1) {
					Bank.log = um.login();
				}
				else if(sel == 2) {
					um.joinUser();
				}
				else if(sel == 3) {
					return false;
				}
			}
			else { // 로그인을 했을 때에만
				if(sel == 1) {
					am.inputMoney();
				}
				else if(sel == 2) {
					am.outMoney();
				}
				else if(sel == 3) {
					am.whithdraw();
				}
				else if(sel == 4) {
					am.printAccs();
				}
				else if(sel == 5) {
					am.createAcc();
				}
				else if(sel == 6) {
					am.deleteAcc();
				}
				else if(sel == 7) {
					Bank.log = -1;
				}
			}
			
			if(sel == 0 && Bank.log == 0) {
				System.out.println("1.전체유저조회\n2.전체계좌조회\n3.뒤로가기");
				selectAdmin();
			}
		} catch(Exception e){
			System.out.println("입력값을 확인하세요.");
		}
		
		return true;
	}
	
	private void selectAdmin() {
		String input = Bank.sc.next();
		
		try {
			int sel = Integer.parseInt(input);
			
			if(sel == 1) {
				um.printAllData();
			}
			else if(sel == 2) {
				am.printAllData();
			}
			else if(sel == 3) {
				printMenu();
			}
		} catch (Exception e) {
			
		}
	}
}
