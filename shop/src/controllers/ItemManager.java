package controllers;

import java.util.ArrayList;
import models.Item;
import models.Cart;

public class ItemManager {
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
		
		
	}
	
}
