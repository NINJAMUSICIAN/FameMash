package Fame;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;
import java.util.Random;

public class Basic extends JApplet {

	public int x = 100, y = 200;
	
	public void Main(String[] args){
		init();
	}

	public void init() {
		setSize(800, 500);
	}

	public void paintBackground(Graphics g){
		Dimension d = getSize();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, d.width, d.height);
		g.setColor(Color.black);
	}

	public void update(){
		x++;
	}
	
	public void paint (Graphics g){
		paintBackground(g);
		update();
		
		
		
		repaint();
	}

}

