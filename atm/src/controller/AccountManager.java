package controller;

import java.util.Random;
import java.util.ArrayList;

import model.Account;
import model.Bank;
import model.User;

public class AccountManager {
	// ���� �α��� ���� ȸ����
	// ������ ������ ���� Ȯ���� �ǰ�
	// ������ ���� Account.MAX ���� ��������
	// ó���� �� ������ ����
	private UserManager um = UserManager.instance;
	public static AccountManager instance = new AccountManager(); 
	
	private ArrayList<Account> accs = new ArrayList<>();
	
	private User getUser(int log) {
		return um.getUser(log);
	}
	
	public void createAcc() {
		int userCode = getUser(Bank.log).getUserCode();
		
		int cnt = getUser(Bank.log).getAccCnt();
		if(cnt <3) {
			this.accs.add(new Account(randomCode(), userCode));
			getUser(Bank.log).setAccCnt(++cnt);
			System.out.print("���»��� �Ϸ�!");
		}
		else {
			System.out.println("�ִ� �������� ������ �ʰ��߽��ϴ�.");
		}
	}
	
	public void deleteAcc() {
		printAccs();
		System.out.print("������ ���� ���� : ");
		
		String input = Bank.sc.next();
		int delIdx = findIndex(input);
		
		int cnt = getUser(Bank.log).getAccCnt();
		
		if(delIdx != -1) {
			this.accs.remove(delIdx);
			getUser(Bank.log).setAccCnt(--cnt);
			System.out.println("����öȸ �Ϸ�");
		}
		
	}
	
	
	
	private int randomCode() {
		Random rn= new Random();
		while(true) {
			int ranCode = rn.nextInt(8999) + 1000;
			
			boolean check = false;
			for(Account acc : this.accs) {
				if(ranCode == acc.getAccNum())
					check = true;
			}
			
			if(!check)
				return ranCode;
		}
	}
	
	public void printAccs() {
		int userCode = getUser(Bank.log).getUserCode();
		
		for(int i=0; i<this.accs.size(); i++) {
			if(userCode == accs.get(i).getUserCode()) {
				System.out.print(i+1 + ") ");
				System.out.println(accs.get(i));
			}
		}
	}
	
	
	
	private int findIndex(String input) {
		int index = -1;
		try {
			int userCode = getUser(Bank.log).getUserCode();
			int cnt = getUser(Bank.log).getAccCnt();
			
			int num = Integer.parseInt(input);
			
			if(num >= 0 && num < cnt) {
				int tempCnt = 0;
				for(int i=0; i<this.accs.size(); i++) {
					if(userCode == this.accs.get(i).getUserCode()) {
						index = i;
						tempCnt ++;
						if(tempCnt == num)
							break;
					}
				}
			}
		} catch (Exception e) {
			
		}
		return index;
	}
	
	public void inputMoney() {
		printAccs();
		System.out.print("�Ա��� ���� ���� : ");
		
		String input = Bank.sc.next();
		int index = findIndex(input);
		
		if(index != -1) {
			Account temp = this.accs.get(index);
			int balance = findIndex(input);
			
			System.out.print("�Աݱݾ� : ");
			int money = Bank.sc.nextInt() + temp.getMoney();
			
			if(money > 0) {
				balance += money;
				temp.setMoney(balance);
				System.out.printf("��� �Ϸ�, �ܾ� : %d��", balance);
			}
		}
	}
	public void outMoney() {
		printAccs();
		System.out.print("����� ���� ���� : ");
		
		String input = Bank.sc.next();
		int index = findIndex(input);
		
		if(index != -1) {
			Account temp = this.accs.get(index);
			int balance = Bank.sc.nextInt(); // ���ܤ���
			
			System.out.print("��ݱݾ� : ");
			int money = Bank.sc.nextInt();
			
			if(balance >= money) {
				balance -= money;
				temp.setMoney(balance);
				System.out.printf("��� �Ϸ�, �ܾ� : %d��", balance);
			}
		}
	}
	
	public void whithdraw() {
		System.out.print("��ü�� ���¹�ȣ : ");
		int target = Bank.sc.nextInt();
		
		int targetIdx = -1;
		for(int i=0; i<this.accs.size(); i++) {
			if(target == this.accs.get(i).getAccNum()) {
				targetIdx = i;
			}
		}
		
		printAccs();
		System.out.println("����� ���� ���� : ");
		
		String input = Bank.sc.next();
		int index = findIndex(input);
		
		if(targetIdx != -1 && index != -1) {
			
			System.out.print("��ü�� �ݾ� : ");
			int money = Bank.sc.nextInt();
				
			Account temp = this.accs.get(index);
			int balance = temp.getMoney();
				
			if(balance >= money) {
				balance -= money;
				temp.setMoney(balance);
					
				temp = this.accs.get(targetIdx);
				balance = temp.getMoney();
				balance += money;
				temp.setMoney(balance);
			}
			else System.out.println("�ܾ��� �����մϴ�.");
		}
		else System.out.println("�������� �ʴ� �����Դϴ�.");
	}
	
	public void printAllData() {
		for(Account acc : this.accs) 
			System.out.println(acc);
	}
	
	public Account getAccout(int index) {
		return this.accs.get(index);
	}
	
	public int getAccsSize() {
		return this.accs.size();
	}
	public void addAccount(Account acc) {
		this.accs.add(acc);
	}
}
