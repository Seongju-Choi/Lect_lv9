package basic;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Rect3 {
	private int x,y,w,h;
	
	public Rect3(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getH() {
		return h;
	}
}

// 클릭하면 박스를 생성 미리 생성하지 않음
// 역방향으로 갈땐 좌표값이 움직임?
// 좌표값의 이동값과 길이 증가값이 같으면될듯?

class PaintPanel extends JPanel implements KeyListener, MouseListener, MouseMotionListener{
	
	private Rect3 Box = new Rect3(0,0,0,0);
	private Rect3 checkbox = new Rect3(0,0,1,1);
	private int px,py;
	private int dx,dy;
	private boolean sort;
	
	public PaintPanel() {
		setLayout(null);
		setBounds(0,0,700,700);
		
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.black);
		g.drawRect(this.Box.getX(),this.Box.getY(),this.Box.getW(),this.Box.getH());
		g.setColor(Color.red);
		g.fillRect(this.checkbox.getX(),this.checkbox.getY(),this.checkbox.getW(),this.checkbox.getH());
		repaint();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		this.dx = e.getX();
		this.dy = e.getY();
		
		if(!sort) {
			if(e.getX() <= this.px) { // e.getX()가 센터보다 작거나 같으면
				this.Box.setX(e.getX()); // X가 드레그의 좌표에 따라 값이 바뀜
				this.Box.setW((e.getX() - this.px) * -1); // W도 X가 이동한 값 만큼 바뀜
			}
			
			if(e.getY() <= this.py) {
				this.Box.setY(e.getY());
				this.Box.setH((e.getY() - this.py) * -1);
			}
			
			if(e.getX() >= this.px) {
				this.Box.setW(e.getX() - this.px);
			}
			
			if(e.getY() >= this.py) {
				this.Box.setH(e.getY() - this.py);
			}
		}
		
		if(sort) {
			if(this.dx <= this.px) {
				
			}
		}
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		this.checkbox.setX(e.getX());
		this.checkbox.setY(e.getY());
		
		this.px = e.getX();
		this.py = e.getY();
		
		this.Box.setX(e.getX());
		this.Box.setY(e.getY());
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == e.VK_SHIFT) {
			sort = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		sort = false;
	}
	
}


public class D1112_PaintTool extends JFrame {
	
	public D1112_PaintTool() {
		super("Painter");
		setLayout(null);
		setBounds(0,0,700,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new PaintPanel());
		setVisible(true);
		revalidate();
		
	}
	
	public static void main(String[] args) {
		D1112_PaintTool paint = new D1112_PaintTool();
	}

}
