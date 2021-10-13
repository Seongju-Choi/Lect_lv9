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
	
	void print() {
		System.out.println("[" + name + "]" + "[" + price + "]" + "[" + category + "]");
	}
}
