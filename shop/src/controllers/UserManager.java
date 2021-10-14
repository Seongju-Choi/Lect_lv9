package controllers;

import java.util.ArrayList;
import models.User;

public class UserManager {
	
	public static UserManager instance = new UserManager();
	private ArrayList<User> userList = new ArrayList<>();
	int log = -1;
	
	private UserManager() {}
	
	public void setAdmin() {
		User admin = new User("admin", "0000", "������");
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
			System.out.println("=== ������� ���̵�� �Դϴ�. ==-");
		}
		else if(check == false) {
			User newuser = new User(id, pw, name);
			userList.add(newuser);
			System.out.println("=== ���� �Ϸ� ===");
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
			System.out.println("=== �߸��� id Ȥ�� pw �Դϴ�. ===");
		} else {
			System.out.println("=== " + userList.get(log).getId() + "�α��� ===");
			return true;
		}
		return false;
	}
	
	public void logOut() {
		if(log != -1) {
			System.out.println("=== " + userList.get(log).getId() + "�α׾ƿ� ===");
			log = -1;
		}
	}
	
	public void printuserList() {
		System.out.print(this.userList.size());
	}
	
}
