package kiosk;

import java.awt.event.ActionEvent;
import java.awt.*;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class Order extends Util{
	
	private JButton[] tbuttons = new JButton[2];
	private JButton[] bbuttons = new JButton[2];
	private final int IMAGESIZE = 100;
	private Menu[][] menuImages = new Menu[4][4];
	private int inum = 1;
	
	private Vector<Vector<String>> menu = new Vector<>();
	private Rect[] rects = new Rect[4];
	private JTable table = null;
	private Vector<String> colName = null;
	
	public Order() {
		setLayout(null);
		setBounds(0, 0, 450, 800);
		
		setButtons();
		setTable();
		setRect();
		setImage();
	}
	
	private void setImage() {
		int x = 25;
		int y = 55;
		
		for(int i=0; i<this.menuImages.length; i++) {
			for(int j=0; j<this.menuImages[i].length; j++) {
				this.menuImages[i][j] = new Menu(this.inum,x,y,this.IMAGESIZE,this.IMAGESIZE);
				this.inum ++;
				x += 100;
			}
			y += 100;
			x = 25;
		}
	}
	
	private void setRect() {
		int x = 25;
		int y = 650;
		
		for(int i=0; i<rects.length; i++) {
			rects[i] = new Rect(x,y,125,45);
			y += 45 +5;
			if(i == 1) {
				x += 125 + 13;
				y = 650;
			}
		}
	}
	
	private void setTable() {
		this.colName = new Vector();
		this.colName.add("제품명");
		this.colName.add("단품 가격");
		this.colName.add("갯수");
		this.colName.add("total");
		
		table = new JTable(menu, colName);
		table.setBounds(15, 460, 415, 170);
		
		table.setBorder(new LineBorder(Color.black));
		table.setGridColor(Color.black);
		
		add(this.table);
	}
	
	private void setButtons() {
		String[] m = {"결제하기","초기화"};
		int x = 170;
		int y = 650;
		
		for(int i=0; i<this.tbuttons.length; i++) {
			this.tbuttons[i] = new JButton();
			this.tbuttons[i].setBounds(x,20,50,30);
			this.tbuttons[i].addActionListener(this);
			
			add(this.tbuttons[i]);
			x += 50 + 5;
		}
		
		for(int i=0; i<this.bbuttons.length; i++) {
			this.bbuttons[i] = new JButton();
			this.bbuttons[i].setBounds(300,y,125,45);
			this.bbuttons[i].setBackground(Color.black);
			this.bbuttons[i].setText(m[i]);
			this.bbuttons[i].addActionListener(this);
			
			add(this.bbuttons[i]);
			y += 45 + 5;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		String[] s = {"주문수량","주문총액"};
		
		for(int i=0; i<this.rects.length; i++) {
			if(i < 2) g.setColor(Color.black);
			else {
				if(i == 2) {
//					g.setFont(String.format("%d잔", s),Font.BOLd,Color.white);
				}
				g.setColor(Color.lightGray);
			}
			g.fillRect(this.rects[i].getX(),this.rects[i].getY(),this.rects[i].getW(),this.rects[i].getH());
		}
		
		for(int i=0; i<this.menuImages.length; i++) {
			for(int j=0; j<this.menuImages[i].length; j++) {
				Menu m = this.menuImages[i][j];
				g.drawImage(m.getImage().getImage(),m.getX(),m.getY(),null);
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.bbuttons) {
			
		}
	}
	
}
