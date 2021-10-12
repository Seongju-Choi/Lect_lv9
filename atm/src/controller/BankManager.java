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
			System.out.println("1.�α���\n2.ȸ������\n3.����");
		}
		else System.out.println("1.���°���/öȸ\n2.�������\3.�α׾ƿ�");
		System.out.print("menu : ");
		
		if(Bank.log == 0) {
			System.out.println("8.������");
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
			else { // �α����� ���� ������
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
				System.out.println("1.��ü������ȸ\n2.��ü������ȸ\n3.�ڷΰ���");
				selectAdmin();
			}
		} catch(Exception e){
			System.out.println("�Է°��� Ȯ���ϼ���.");
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
