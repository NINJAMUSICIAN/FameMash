package Fame;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Card {
	
	private static final int IMG_WIDTH = 225;
	private static final int IMG_HEIGHT = 258;
	
	private Rectangle collision;
	
	public BufferedImage rawPic;
	public BufferedImage pic;
	public int x = 100, y = 100;
	private String rawVotes = "", rawViews = "";
	private int votes = 0, views = 0;

	
	
	public Card(int num){
		String path = "/pic(" + num + ").jpg";
		System.out.println(path);
		try{
			pic = ImageIO.read(getClass().getResourceAsStream(path));
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void init(){
		collision = new Rectangle(x, y, IMG_WIDTH, IMG_HEIGHT);
	}
	
	public Rectangle getRect(){
		return collision;
	}
	
	public void setPosition(int x1, int y1){
		x = x1;
		y = y1;
	}
	
	public void draw(Graphics g){
		g.drawImage(pic, x, y, IMG_WIDTH, IMG_HEIGHT, null);
		
	}
	
}
