package models;

public class Cart {
	private String userId;
	private String itemName;
	
	public Cart(String userId, String itemName){
		this.userId = userId;
		this.itemName = itemName;
	}
	
	public String getuserId() {
		return this.userId;
	}
	public String getitemName() {
		return this.itemName;
	}
	
}
