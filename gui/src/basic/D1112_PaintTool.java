package basic;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class Rect3 {
	private int x,y,w,h;
	private Color c;
	
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
	public int getH() {
		return h;
	}
	public Color getC() {
		return c;
	}
	
}

class PaintPanel extends JPanel implements MouseListener, MouseMotionListener{
	
	public PaintPanel() {
		setLayout(null);
		setBounds(0,0,700,700);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
