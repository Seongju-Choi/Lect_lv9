package controller;

import model.Bank;
import model.User;
import java.util.ArrayList;
import java.util.Random;

public class UserManager {
	
	public static UserManager instance = new UserManager(); 
	private UserManager() {}
	
	// setAdmin
	public void setAdmin() {
		User admin = new User(9999, "admin", "0000", "관리자");
		this.users.add(admin);
	}
	
	// users
	private ArrayList<User> users = new ArrayList<>();
	
	public void joinUser() {
		System.out.print("id :");
		String id = Bank.sc.next();
		System.out.print("pw : ");
		String pw = Bank.sc.next();
		System.out.print("name : ");
		String name = Bank.sc.next();
		
		boolean check = false;
		for(User user : this.users) {
			if(id.equals(user.getId()))
				check = true;
		}
		
		if(!check) {
			User newUser = new User(randomcode(), id, pw, name);
			this.users.add(newUser);
		}
		else System.out.println("중복된 아이디 입니다.");
		
	}
	
	private int randomcode() {
		Random rn = new Random();
		while(true) {
			int ranCode = rn.nextInt(8999) + 1000;
			
			boolean check = false;
			for(User user : this.users) {
				if(ranCode == user.getUserCode()) {
					check = true;
				}
			}
			
			if(!check) {
				return ranCode;
			}
		}
	}
	
	public int login() {
		System.out.println("id : ");
		String id = Bank.sc.next();
		System.out.println("pw : ");
		String pw = Bank.sc.next();
		
		for(int i=0; i<this.users.size(); i++) {
			if(users.get(i).getId().equals(id) && users.get(i).getPw().equals(pw)) {
				return i;
			}
		}
		return -1;
	}
	
	public void printAllData() {
		for(User user : this.users) {
			System.out.println(user);
		}
	}
	
	public User getUser(int index) {
		return this.users.get(index);
	}
	
	public int getUsersSize() {
		return this.users.size();
	}
	
	public void addUsers(User user) {
		this.users.add(user);
	}
}
