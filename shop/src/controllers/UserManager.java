package controllers;

import java.util.ArrayList;
import java.util.Random;
import models.User;

public class UserManager {
	Random rn = new Random();
	public static UserManager instance = new UserManager();
	ArrayList<User> userList = new ArrayList<>();
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
	
	public boolean logIn() {
		log = -1;
		System.out.print("id : ");
		String id = ShopManager.sc.next();
		for(int i=0; i<userList.size(); i++) {
			if(id.equals(userList.get(i).getId())){
				log = i;
				break;
			}
		}
		if(log == -1) {
			System.out.println("=== 없는 id 입니다. ===");
		} else {
			System.out.println("=== " + userList.get(log).getId() + "로그인 ===");
			return true;
		}
		return false;
	}
	public void logOut() {
		if(log != -1) {
			System.out.println("=== " + userList.get(log).getId() + "로그아웃 ===");
		}
		log = -1;
	}
	
}
