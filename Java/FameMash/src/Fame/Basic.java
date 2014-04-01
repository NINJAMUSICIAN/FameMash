package Fame;

//49 is the best

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JApplet;

public class Basic extends JApplet {

	private int NUMBER_OF_PICS = 173;
	
	public int x = 100, y = 200;
	
	
	public Card card1, card2;
	
	public void Main(String[] args){
		init();
	
		
	}

	public void init() {
		setSize(800, 500);
		card1 =makeCard();
		card2 =makeCard();
		
		card2.setPosition(500, 100);
		
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
	
	}
	
	public void paint (Graphics g){
		paintBackground(g);
		update();
		
		card1.draw(g);
		card2.draw(g);
	}

}

