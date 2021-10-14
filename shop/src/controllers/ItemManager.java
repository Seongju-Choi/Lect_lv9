package controllers;

import java.util.ArrayList;
import models.Item;
import models.Cart;

public class ItemManager {
	
	public static ItemManager instance = new ItemManager();
	ArrayList<String> catagory = new ArrayList<String>();
	ArrayList<Item> itemList = new ArrayList<>();
	ArrayList<Cart> jangList = new ArrayList<Cart>(); // 전체 장바구니
	
	public void addItem() {
		System.out.print("name : ");
		String name = ShopManager.sc.next();
		System.out.print("price : ");
		int price = ShopManager.sc.nextInt();
		System.out.println("category : ");
		String category = ShopManager.sc.next();
		
		Item newitem = new Item(name, price, category);
		itemList.add(newitem);
	}
	public void delItem() {
		System.out.print("name : ");
		String name = ShopManager.sc.next();
		System.out.print("category : ");
		String category = ShopManager.sc.next();
		
		boolean check = true;
		for(int i=0; i<itemList.size(); i++) {
			if(name.equals(itemList.get(i).getName()) && category.equals(itemList.get(i).getCategory())) {
				itemList.remove(i);
			}
		}
	}
	public void addCategory() {
		
	}
	
	public void delCatgory() {
		
	}
	
}
