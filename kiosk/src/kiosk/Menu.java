package kiosk;

import java.awt.Image;
import java.util.Vector;

import javax.swing.ImageIcon;

public class Menu {
	
	private int[] name;
	private int[] price;
	private int x,y,w,h,num;
	
	private ImageIcon image;
	
	private String fileName;

	public Menu(int num, int x, int y, int w, int h) {
		
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.num = num;
		
		this.fileName = String.format("images/coffee%d.png", this.num);
		this.image = new ImageIcon(new ImageIcon(fileName).getImage().getScaledInstance(w,h,Image.SCALE_SMOOTH));
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getW() {
		return w;
	}

	public int getH() {
		return h;
	}
	public ImageIcon getImage() {
		return image;
	}
	
	
}
