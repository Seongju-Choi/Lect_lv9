package models;

public class Item {
	private String name;
	private int price;
	private String category; // 카테고리 // 육류, 과자, 어류, 과일 등등
	
	public Item(String name, int price, String category){
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public String getCategory() {
		return this.category;
	}
	
}
