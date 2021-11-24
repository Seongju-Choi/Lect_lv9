package kiosk;

import java.awt.Image;
import java.util.Vector;

import javax.swing.ImageIcon;

public class Menu {
	
	private String[] name1 = {"�Ƹ޸�ī��","����ȾƸ޸�ī��","������ӾƸ޸�ī��","���ھƸ޸�ī��",
								"īǪġ��","ī���","�����񷵶�","ũ���̶�",
								"ũ���̶�","�������ũ���̶�","ī���ī","ī��Ḷ���ƶ�",
								"����������","��ġĿ��","��ġ�ó����","��ġ���ڳӶ�"};
	
	private int[] price1 = {1500,1500,2000,2500,
							2500,2500,3000,3000,
							3000,3500,3500,3500,
							1500,2500,3000,3000};
	private String[] name2 = {"��Ϸ���Ƽ","�������Ƽ","����ڸ�Ƽ","��׷���",
								"��ȭ��","��Ʈ����Ƽ","�ɸ���","���۹�Ʈ",
								"û�������̵�","������","���̺���","������",
								"����Ŀ��","�����ƾ��̽�Ƽ","��緹���̵�","�ڸ����̵�"};
	
	private int[] price2 = {3500,3500,3500,2500,
							2500,2500,2500,2500,
							3500,2500,2500,2500,
							2500,3000,3500,3500};
	
	private int x,y,w,h,num;
	private String mode;
	
	
	public Menu(int num, int x, int y, int w, int h, String mode) {
		
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.num = num;
		this.mode = mode;
		
	}
	public Menu() {
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
//	public ImageIcon getImage() {
//		return image;
//	}
	public String[] getName() {
		return name1;
	}
	
	public int getPrice1(int x) {
		int price = this.price1[x];
		return price;
	}
	public int[] getPrice1() {
		return price1;
	}
	
}
