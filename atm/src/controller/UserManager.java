package controller;

import model.Bank;
import model.User;
import java.util.ArrayList;

public class UserManager {
	
	private UserManager() {
		
	}
	
	public static UserManager instance = new UserManager(); 
	private ArrayList<User> users = new ArrayList<>();
	
	private void joinUser() {
		System.out.print("id :");
		String id = Bank.sc.next();
		System.out.print("pw : ");
		String pw = Bank.sc.next();
		System.out.print("name : ");
		String name = Bank.sc.next();
		
	}
	
}
