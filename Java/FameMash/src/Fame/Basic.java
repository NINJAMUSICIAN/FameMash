package Fame;

//49 is the best

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JApplet;

public class Basic extends JApplet implements MouseListener, MouseMotionListener {

	private int NUMBER_OF_PICS = 173;
	
	public int x = 100, y = 200;
	public int mx, my;
	
	public Card card1, card2;
	public Rectangle mouseRec; 
	
	public void Main(String[] args){
		init();
	
		
	}

	public void init() {
		setSize(800, 500);
		 addMouseListener( this );
	      addMouseMotionListener( this );
	      mouseRec = new Rectangle(mx-20, my-20, 40, 40);
	      
		
		card1 = makeCard();
		card1.init();
		card2 = makeCard();
		card2.setPosition(500, 100);
		card2.init();
		
	}

	public void restart(){
		card1 = makeCard();
		card1.init();
		card2 = makeCard();
		card2.setPosition(500, 100);
		card2.init();
		
	}
	
	public Card makeCard(){
		Random r = new Random();
		int sel = r.nextInt(NUMBER_OF_PICS + 1);
		Card newCard = new Card(sel);
		return newCard;
	}
	
	public void paintBackground(Graphics g){
		Dimension d = getSize();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, d.width, d.height);
		g.setColor(Color.black);
		Font font = new Font("Arial", Font.BOLD, 32);
		g.setFont(font);
		g.drawString("OR", 400, 250);
	}

	public void update(){
		  mouseRec = new Rectangle(mx-20, my-20, 40, 40);
	}
	
	public void paint (Graphics g){
		paintBackground(g);
		update();
		
		card1.draw(g);
		card2.draw(g);
		
	
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		mx = e.getX();
		my = e.getY();
		
		if(card1.getRect().contains(mouseRec) || card2.getRect().contains(mouseRec)){
			restart();
		}
		
		repaint();
		e.consume();
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

	public void mouseMoved (MouseEvent e){
		
	}
}

