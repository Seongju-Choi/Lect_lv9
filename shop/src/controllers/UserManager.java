package controllers;

import java.util.ArrayList;
import java.util.Random;
import models.User;

public class UserManager {
	Random rn = new Random();
	public static UserManager instance = new UserManager();
	private ArrayList<User> userList = new ArrayList<>();
	int log = -1;
	
	private UserManager() {}
	
	public void setAdmin() {
		User admin = new User(9999, "admin", "0000", "������");
		this.userList.add(admin);
	}
	
	public void randomcode() {
		
	}
	
	public void joinUser() {
		System.out.print("id : ");
		String id = ShopManager.sc.next();
		System.out.print("pw : ");
		String pw = ShopManager.sc.next();
		System.out.print("name : ");
		String name = ShopManager.sc.next();
		
		User newuser = new User(this.userList.size(), id, pw, name);
		this.userList.add(newuser);
	}
	public void deleteAcc() {
		System.out.print("id : ");
		String id = ShopManager.sc.next();
		System.out.print("pw : ");
		String pw = ShopManager.sc.next();
		System.out.print("name : ");
		String name = ShopManager.sc.next();
	}
	
	public boolean logIn() {
		log = -1;
		System.out.print("id : ");
		String id = ShopManager.sc.next();
		System.out.print("pw : ");
		String pw = ShopManager.sc.next();
		
		for(int i=0; i<userList.size(); i++) {
			if(id.equals(userList.get(i).getId())){
				log = i;
				break;
			}
		}
		if(log == -1) {
			System.out.println("=== ���� id �Դϴ�. ===");
		} else {
			System.out.println("=== " + userList.get(log).getId() + "�α��� ===");
			return true;
		}
		return false;
	}
	public void logOut() {
		if(log != -1) {
			System.out.println("=== " + userList.get(log).getId() + "�α׾ƿ� ===");
		}
		log = -1;
	}
	
	public void logInAdmin() {
		System.out.print("admin id : ");
		String id = ShopManager.sc.next();
		System.out.println("pw : ");
		String pw = ShopManager.sc.next();
		System.out.println("name : ");
		String name = ShopManager.sc.next();
		
	}
	public void printuserList() {
		System.out.println(this.userList.size());
	}
	
}
