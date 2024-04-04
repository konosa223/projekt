package projekt;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.geom.AffineTransform;

public class BackgroundImage extends JPanel{
	Image pic;
	String nameOfPlanet;
	public BackgroundImage() {
		ImageIcon obj=new ImageIcon(getNameOfPlanet());
		pic=obj.getImage();
		
	}
	public BackgroundImage(String name) {
		ImageIcon obj = new ImageIcon(name);
		pic=obj.getImage();
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(pic, 0, 0, null);
	}
	public String getNameOfPlanet() {
		return nameOfPlanet;
	}
	public void setNameOfPlanet(String nameOfPlanet) {
		this.nameOfPlanet = nameOfPlanet;
	}
	
	
}
