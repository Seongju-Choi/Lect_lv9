package controllers;

import java.util.Vector;
import models.User;

public class UserManager {
	
	public static UserManager instance = new UserManager();
	Vector<User> userList = new Vector<User>();
	int log = -1;
	
	private UserManager() {}
	
	public void joinUser() {
		System.out.print("id : ");
		String id = ShopManager.sc.next();
		System.out.print("pw : ");
		String pw = ShopManager.sc.next();
		System.out.print("name : ");
		String name = ShopManager.sc.next();
	}
	public void deleteAcc() {
		System.out.print("id : ");
		String id = ShopManager.sc.next();
		System.out.print("pw : ");
		String pw = ShopManager.sc.next();
		System.out.print("name : ");
		String name = ShopManager.sc.next();
	}
	
	public boolean login() {
		log = -1;
		System.out.print("id : ");
		String id = ShopManager.sc.next();
		
	}
	
}
