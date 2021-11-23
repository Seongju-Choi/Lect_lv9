package kiosk;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.*;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

// 아이콘

class charge extends JFrame {
	public charge() {
		setLayout(null);
		setBounds(0,0,400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		revalidate();
	}
}

public class Order extends Util{
	
	private final int COFFEE = 0;
	private final int TEA = 1;
	private final int IMAGESIZE = 100;
	
	private JButton[] tbuttons = new JButton[2];
	private JButton[] bbuttons = new JButton[2];
	private Menu[][] menuImages = new Menu[4][4];
	private Menu menu = new Menu();
	private int inum = 1;
	private int cnt;
	private int total;
	private int mode;
	
	private Rect[] rects = new Rect[4];
	private JTable table = null;
	private Vector<String> header = null;
	private Vector<Vector<String>> cart = new Vector<>();
	private JScrollPane js;
	
	// 클릭하면 카트에 추가 -> 테이블에 등록
	
	public Order() {
		setLayout(null);
		setBounds(0, 0, 450, 800);
		
		setButtons();
		setTable();
		setRect();
		setImage();
		setCart();
		
		addMouseListener(this);
	}
	
	private void setCart() {
		String[] n = this.menu.getName();
		int[] p = this.menu.getPrice();
			
		for(int i=0; i<n.length; i++) {
			Vector<String> s = new Vector<>();
			s.add(n[i]);
			s.add(p[i] + "원");
			s.add(cnt + "개");
			s.add(total + "원");
			this.cart.add(s);
		}
	}
	
	private void setImage() {
		int x = 25;
		int y = 55;
		String[] mode = {"coffee","tea"};
		
		for(int i=0; i<this.menuImages.length; i++) {
			for(int j=0; j<this.menuImages[i].length; j++) {
				this.menuImages[i][j] = new Menu(this.inum,x,y,this.IMAGESIZE,this.IMAGESIZE,mode[this.mode]);
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
		
		this.header = new Vector<>();
		this.header.add("제품명");
		this.header.add("단품 가격");
		this.header.add("갯수");
		this.header.add("total");
		
		table = new JTable(cart,header);
		table.setBounds(15, 460, 415, 170);
		
		table.setBorder(new LineBorder(Color.black));
		table.setGridColor(Color.black);
		
//		add(this.table);
		
		js = new JScrollPane(table);
		js.setBounds(15, 460, 415, 170);
		js.setAutoscrolls(true);
		add(js);
		
	}
	
	private void setButtons() {
		String[] m = {"결제하기","초기화"};
		String[] c = {"커피","티&에이드"};
		int x = 150;
		int y = 650;
		
		for(int i=0; i<this.tbuttons.length; i++) {
			this.tbuttons[i] = new JButton();
			this.tbuttons[i].setFont(new Font("",Font.BOLD,9));
			this.tbuttons[i].setBounds(x,20,80,25);
			this.tbuttons[i].setText(c[i]);
			this.tbuttons[i].addActionListener(this);
			
			add(this.tbuttons[i]);
			x += 80 + 5;
		}
		
		for(int i=0; i<this.bbuttons.length; i++) {
			this.bbuttons[i] = new JButton();
			this.bbuttons[i].setBounds(300,y,125,45);
			this.bbuttons[i].setBackground(Color.black);
			this.bbuttons[i].setFont(new Font("",Font.BOLD,15));
			this.bbuttons[i].setForeground(Color.white);
			this.bbuttons[i].setText(m[i]);
			this.bbuttons[i].addActionListener(this);
			
			add(this.bbuttons[i]);
			y += 45 + 5;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		
		for(int i=0; i<this.rects.length; i++) {
			
			// Box
			if(i < 2) g.setColor(Color.black);
			else {
				g.setColor(Color.gray);
			}
			g.fillRect(this.rects[i].getX(),this.rects[i].getY(),this.rects[i].getW(),this.rects[i].getH());
			
			// Text
			if(i == 0) {
				g.setColor(Color.white);
				g.setFont(new Font("",Font.BOLD,15));
				g.drawString("주문수량",55,678);
			}
			else if(i == 1) {
				g.setColor(Color.white);
				g.setFont(new Font("",Font.BOLD,15));
				g.drawString("주문총액",55,728);
			}
			
			else if(i == 2) {
				g.setColor(Color.white);
				g.setFont(new Font("",Font.BOLD,15));
				g.drawString(String.format("%d잔", this.cnt),215,678);
				
			}
			else if(i == 3) {
				g.setColor(Color.white);
				g.setFont(new Font("",Font.BOLD,15));
				g.drawString(String.format("%d원", this.total),215,728);
			}
		}
		
		// image
		
		for(int i=0; i<this.menuImages.length; i++) {
			for(int j=0; j<this.menuImages[i].length; j++) {
				Menu m = this.menuImages[i][j];
				g.drawImage(m.getImage().getImage(),m.getX(),m.getY(),null);
			}
		}
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼으로 변경?
		if(e.getSource() == this.bbuttons[0]) 
			new charge();
		
		else if(e.getSource() == this.bbuttons[1]) {
			setReset();
		}
		else if(e.getSource() == this.tbuttons[0]) {
			this.mode = COFFEE;
		}
		
		else if(e.getSource() == this.tbuttons[1]) {
			this.mode = TEA;
		}
		
	}

	private void setReset() {
		this.cart = new Vector<>();
		this.cnt = 0;
		this.total = 0;
	}
}
