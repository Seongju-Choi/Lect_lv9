package models;

public class Item {
	private String name;
	private int price;
	private String category; // ī�װ� // ����, ����, ���, ���� ���
	
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
