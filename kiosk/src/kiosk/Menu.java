package kiosk;

import java.awt.Image;
import java.util.Vector;

import javax.swing.ImageIcon;

public class Menu {
	
	private String[] name1 = {"아메리카노","스페셜아메리카노","헤이즐넛아메리카노","유자아메리카노",
							"카푸치노","카페라떼","바닐라라떼","크리미라떼","헤이즐넛크리미라떼",
							"카페모카","카라멜마끼아또","에스프레소","더치커피","더치시나몬라떼","더치코코넛라떼"};
	
	private int[] price1 = {1500,1500,2000,2500,
							2500,2500,3000,3000,
							3000,3500,3500,3500,
							1500,2500,3000,3000};
	private String[] name2 = {"허니레몬티","허니유자티","허니자몽티","얼그레이","국화차",
							"민트초코티","케모마일","페퍼민트","청포도에이드","보이차","루이보스",
							"로즈힙","히비스커스","복숭아아이스티","블루레몬에이드","자몽에이드"};
	
	private int[] price2 = {3500,3500,3500,2500,
							2500,2500,2500,2500,
							3500,2500,2500,2500,
							2500,3000,3500,3500};
	
	private int x,y,w,h,num;
	private String mode;
	private ImageIcon image;
	private String fileName;
	
	public Menu(int num, int x, int y, int w, int h, String mode) {
		
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.num = num;
		this.mode = mode;
		
		this.fileName = String.format("images/%s%d.png",this.mode, this.num);
		this.image = new ImageIcon(new ImageIcon(fileName).getImage().getScaledInstance(w,h,Image.SCALE_SMOOTH));
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
	public ImageIcon getImage() {
		return image;
	}
	public String[] getName() {
		return name1;
	}
	public int[] getPrice() {
		return price1;
	}
	
}
