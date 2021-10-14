package controllers;

import java.util.ArrayList;
import models.User;

public class UserManager {
	
	public static UserManager instance = new UserManager();
	private ArrayList<User> userList = new ArrayList<>();
	int log = -1;
	
	private UserManager() {}
	
	public void setAdmin() {
		User admin = new User("admin", "0000", "관리자");
		this.userList.add(admin);
	}
	
	public void joinUser() {
		System.out.print("id : ");
		String id = ShopManager.sc.next();
		System.out.print("pw : ");
		String pw = ShopManager.sc.next();
		System.out.print("name : ");
		String name = ShopManager.sc.next();
		
		boolean check = true;
		for(int i=0; i<userList.size(); i++) {
			if(id.equals(userList.get(i).getId())) {
				check = true;
			}
			else {
				check = false;
			}
		}
		if(check == true) {
			System.out.println("=== 사용중인 아이디명 입니다. ==-");
		}
		else if(check == false) {
			User newuser = new User(id, pw, name);
			userList.add(newuser);
			System.out.println("=== 가입 완료 ===");
		}
	}
	public void deleteAcc() {
		System.out.print("id : ");
		String id = ShopManager.sc.next();
		System.out.print("pw : ");
		String pw = ShopManager.sc.next();
		System.out.print("name : ");
		String name = ShopManager.sc.next();
		
		for(int i=0; i<userList.size(); i++) {
			if(id.equals(userList.get(i).getId()) && pw.equals(userList.get(i).getPw()) && name.equals(userList.get(i).getName())) {
				userList.remove(i);
			}
		}
		
	}
	
	public boolean logIn() {
		System.out.print("id : ");
		String id = ShopManager.sc.next();
		System.out.print("pw : ");
		String pw = ShopManager.sc.next();
		
		for(int i=0; i<userList.size(); i++) {
			if(id.equals(userList.get(i).getId()) && pw.equals(userList.get(i).getPw())){
				if(id.equals("admin")) {
					log = 100;
				}
				else {
					log = i;
				}
				break;
			}
		}
		if(log == -1) {
			System.out.println("=== 잘못된 id 혹은 pw 입니다. ===");
		} else {
			System.out.println("=== " + userList.get(log).getId() + "로그인 ===");
			return true;
		}
		return false;
	}
	
	public void logOut() {
		if(log != -1) {
			System.out.println("=== " + userList.get(log).getId() + "로그아웃 ===");
			log = -1;
		}
	}
	
	public void printuserList() {
		System.out.print(this.userList.size());
	}
	
}
