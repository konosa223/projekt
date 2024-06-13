package projekt;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class frame extends JFrame {
	
	FlyPanel flypanel = new FlyPanel("saturn.jpg");
	BottomPanel bottomPanel=new BottomPanel();
	OpeningPanel opening=new OpeningPanel();
	MenuBar menu=new MenuBar();
	double g=9; //wstawić wartość bazową
	double wi=-400; //wstawić wartość bazową
	
	public frame(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1280,640);
		//this.menu.Mars.addActionListener(new Listener("mars.jpg", -300, 11, flypanel, null));
		this.menu.Moon.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				flypanel.setBackground("ksiezyc.jpg");
				flypanel.setWind(0);
				setWi(0);
				setG(1.622);
			}
		});
		this.menu.Neptune.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				flypanel.tcow=new Cow(-100,-100,0,0,0,flypanel.getWind());

				flypanel.setBackground("neptun.jpg");
				flypanel.setWind(400);

				setWi(400);
				setG(11);
			}
		});
		this.menu.Mars.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				flypanel.setBackground("mars.jpg");
				flypanel.setWind(-200);
				flypanel.tcow=new Cow(-100,-100,0,0,0,flypanel.getWind());

				setWi(-200);
				setG(3.7);
			}
		});
		this.menu.Pluto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				flypanel.setBackground("pluto.jpg");
				flypanel.setWind(10);
				flypanel.tcow=new Cow(-100,-100,0,0,0,flypanel.getWind());

				setWi(10);
				setG(0.62);
			}
		});
		this.menu.Saturn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				flypanel.setBackground("saturn.jpg");
				flypanel.setWind(-200);
				flypanel.tcow=new Cow(-100,-100,0,0,0,flypanel.getWind());

				setWi(-200);
				setG(9);
			}
		});
		this.opening.moon.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				flypanel.setBackground("ksiezyc.jpg");
				flypanel.setWind(0);

				setWi(0);
				setG(1.622);
				opening.setVisible(false);
				add(flypanel,BorderLayout.CENTER);
			}
		});
		this.opening.neptun.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				flypanel.setBackground("neptun.jpg");
				flypanel.setWind(400);
				flypanel.tcow=new Cow(-100,-100,0,0,0,flypanel.getWind());

				setWi(400);
				setG(11);
				opening.setVisible(false);
				add(flypanel,BorderLayout.CENTER);
			}
		});
		this.opening.mars.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				flypanel.setBackground("mars.jpg");
				flypanel.setWind(-200);
				flypanel.tcow=new Cow(-100,-100,0,0,0,flypanel.getWind());

				setWi(-200);
				setG(3.7);
				opening.setVisible(false);
				add(flypanel,BorderLayout.CENTER);
			}
		});
		this.opening.pluto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				flypanel.setBackground("pluto.jpg");
				flypanel.setWind(10);
				flypanel.tcow=new Cow(-100,-100,0,0,0,flypanel.getWind());

				setWi(10);
				setG(0.62);
				opening.setVisible(false);
				add(flypanel,BorderLayout.CENTER);
			}
		});
		this.opening.saturn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				flypanel.setBackground("saturn.jpg");
				flypanel.setWind(-200);
				flypanel.tcow=new Cow(-100,-100,0,0,0,flypanel.getWind());

				setWi(-200);
				setG(9);
				opening.setVisible(false);
				add(flypanel,BorderLayout.CENTER);
			}
		});
		this.setJMenuBar(menu.getMenuBar());
		this.add(opening,BorderLayout.CENTER);
		//this.add(flypanel,BorderLayout.CENTER);
		this.add(bottomPanel,BorderLayout.SOUTH);
		this.setVisible(true);
//		try {
//			InputStream test = new FileInputStream("muzyka-projekt.wav");
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}

		//playMusic("muzyka-projekt.wav");
		music m=new music("muzyka-projekt.wav");
		m.start();
		setResizable(false);
	}
	
	void addtime() {
		flypanel.addtime();
		
	}
	void newCow(Cow cow) {
		flypanel.newCow(cow);
	}
	void trybackground() {
		flypanel.setBackground("mars.jpg");
	}

	public double getG() {
		return g;
	}

	public void setG(double g) {
		this.g = g;
	}

	public double getWi() {
		return wi;
	}

	public void setWi(double wi) {
		this.wi = wi;
	}
//	public static void playMusic(String filepath) {
//		AudioInputStream audioStream = null;
//		try {
//		    File file = new File(filepath);
//		    audioStream = AudioSystem.getAudioInputStream(file);
//		    Clip clip = AudioSystem.getClip();
//		        
//		    clip.open(audioStream);
//		    clip.start();
//		    //String response = sc.next(); // I don't understand why you are using Scanner!
//		}
//		catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
//		    System.err.println(ex);
//		}
//		finally {
//		    try {
//		        if (audioStream != null) {
//		            audioStream.close();
//		        }
//		    }
//		    catch (IOException ex) {
//		        System.err.println(ex);
//		    }
//		}
//		
//	}
}
