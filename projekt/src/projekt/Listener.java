package projekt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Listener implements ActionListener{
	int wind;
	double g;
	String planetName;
	JPanel pan;
	BufferedImage background;

	public Listener(String plName, int wi, double grav, JPanel p,BufferedImage backgru) {
		this.planetName=plName;
		this.wind=wi;
		this.g=grav;
		this.pan=p;
		this.background=backgru;
	}
    public void actionPerformed(ActionEvent e) {
    	Listener li=new Listener(planetName, wind, g, pan, background);
        li.setPan(pan);
        li.setPlanetName(planetName);
        li.setBackground(planetName);
        li.setG(g);
        li.setWind(wind);
        
        
    }	
	
	public JPanel getPan() {
		return pan;
	}
	public void setPan(JPanel pan) {
		this.pan = pan;
	}
	public int getWind() {
		return wind;
	}

	public void setWind(int wind) {
		this.wind = wind;
	}

	public double getG() {
		return g;
	}

	public void setG(double g) {
		this.g = g;
	}

	public String getPlanetName() {
		return planetName;
	}

	public void setPlanetName(String planetName) {
		this.planetName = planetName;
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
