package models;

public class User {
	
	private String Id;
	private String Pw;
	private String name;
	private int UserCode;
	
	public User(int usercode, String id, String pw, String name) {
		this.UserCode = usercode;
		this.Id = id;
		this.Pw = pw;
		this.name = name;
	}
	
	public String getId() {
		return this.Id;
	}
	
	public String getPw() {
		return this.Pw;
	}
	
	public String getName() {
		return this.name;
	}
	public int getUserCode() {
		return this.UserCode;
	}
	
	
}
