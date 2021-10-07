package model;

public class UserManager {
	
	public static UserManager instance = new UserManager(); 
	private ArrayList<User> um = new ArrayList<>();
	
	private void joinUser() {
		System.out.print("id :");
		String id = Bank.sc.next();
		System.out.print("pw : ");
		String pw = Bank.sc.next();
		System.out.print("name : ");
		String name = Bank.sc.next();
		
		
	}
	
}
