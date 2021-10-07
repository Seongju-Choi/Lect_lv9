package model;

public class User {
	
	private int userCode;
	private String id;
	private String pw;
	private String name;
	private int accCnt;
	
	public User(int userCode, String id, String pw, String name) {
		this.userCode = userCode;
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public String getId() {
		return this.id;
	}
	public String getPw() {
		return this.pw;
	}
	
}
