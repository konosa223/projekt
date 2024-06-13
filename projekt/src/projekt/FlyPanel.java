package projekt;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FlyPanel extends JPanel {
	int time = 0;
	Graphics g;
	Cow tcow;
	BufferedImage background;
	BufferedImage image;
	BufferedImage physicist ;
	int wind;

	public int getWind() {
		return wind;
	}

	public void setWind(int wind) {
		this.wind = wind;
	}

	void newCow(Cow cow) {
		tcow = cow; 
	}
	
public FlyPanel(String Background){

	File inputFile = new File(Background);
	try {
		background = ImageIO.read(inputFile);
	} catch(IOException ex) {
		System.out.println(ex.getMessage());
	}
	try {
		physicist=ImageIO.read(new File("physisicst.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
		tcow = new Cow(-100,-100,0,0,0,getWind());				
	}
	
	public void paint(Graphics g) {		
		Graphics2D g2D = (Graphics2D)g;
		g2D.drawImage(background,0,0,this);	

		 g2D.drawImage(physicist,0,196,200,200,this);

		 Image image = new ImageIcon("cow.jpg").getImage(); 
		 Image image2 = new ImageIcon("kosz.png").getImage();
		 Image image3 = new ImageIcon("horągiwekaL.png").getImage();
		 Image image4 = new ImageIcon("horągiwekaP.png").getImage();
		 g2D.clip(new Ellipse2D.Double((int)tcow.getX(), this.getHeight()-50 - (int)tcow.getY(), 50, 50));
		 g2D.drawImage(image,(int)tcow.getX(), this.getHeight()-50 - (int)tcow.getY(), null);
		 g2D.setClip(new Ellipse2D.Double(950, 300, 500, 500));
		 g2D.drawImage(image2,1000, 400, null);
		 g2D.setClip(new Ellipse2D.Double(950, 50, 500, 500));
		 if(tcow.getV_w()<0) {
			 g2D.drawImage(image3,1000, 150,100,50, null);
		 }
		 if(tcow.getV_w()>0) {
			 g2D.drawImage(image4,1000, 150,100,50, null);
		 }
	}
	void addtime() {
		tcow.timeflow();
		repaint();
		if((int)tcow.getX()<1100 && (int)tcow.getY()<50 && (int)tcow.getX()>970 && (int)tcow.getY()>10) {
			tcow = new Cow(-100,-100,0,0,0,0);
			musicEfect m=new musicEfect("mixkit-achievement-bell-600.wav");
			m.start();
			JOptionPane.showMessageDialog(this, "Gratulacje");


		}
		if((int)tcow.getY()>1&&(int)tcow.getY()<10) {
			tcow=new Cow(-100,-100,0,0,0,getWind());
			musicEfect m=new musicEfect("mixkit-lose-life-falling-2029.wav");
			m.start();
			JOptionPane.showMessageDialog(this, "Spróbuj ponownie");
			tcow=new Cow(-100,-100,0,0,0,getWind());

		}
	}
	
	void setBackground(String Background) {
		File inputFile = new File(Background);
		try {
			background = ImageIO.read(inputFile);
		} catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
}

