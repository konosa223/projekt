package projekt;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JFrame;


public class Frame extends JFrame {


		JFrame frame=new JFrame();
		BottomPanel botPan=new BottomPanel();
		BackgroundImage pic=new BackgroundImage("src/projekt/images/ksiezyc.jpg");
		MenuBar menu=new MenuBar();
		BackgroundImage pic2=new BackgroundImage("src/projekt/images/mars.jpg");
		BackgroundImage pic3=new BackgroundImage("src/projekt/images/neptun.jpg");
		BackgroundImage pic4=new BackgroundImage("src/projekt/images/pluto.jpg");
		BackgroundImage pic5=new BackgroundImage("src/projekt/images/saturn.jpg");
	public Frame() throws HeadlessException, IOException {
		frame.setSize(1350,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setJMenuBar(menu.getMenuBar());
		frame.add(pic);
		frame.add(botPan,BorderLayout.SOUTH);
		menu.Moon.addActionListener(new ActionListener() {
			//changing background for moon
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.remove(pic);
				//BackgroundImage pic2 = new BackgroundImage("src/projekt/images/ksiezyc.jpg");
				frame.add(pic);
				//frame.pack();
				frame.invalidate();
				frame.validate();
				frame.repaint();			
		}});
		menu.Mars.addActionListener(new ActionListener() {
			//changing background for mars
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.remove(pic);
				frame.add(pic2);	
				//frame.pack();
				frame.invalidate();
				frame.validate();
				frame.repaint();			
			}});
		menu.Neptune.addActionListener(new ActionListener() {
			//changing background for neptune
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.remove(pic);
				//BackgroundImage pic2=new BackgroundImage("src/projekt/images/neptun.jpg");
				frame.add(pic3);
				//frame.pack();
				frame.invalidate();
				frame.validate();
				frame.repaint();			
				}});
		menu.Pluto.addActionListener(new ActionListener() {
			//changing background for neptune
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.remove(pic);
				//BackgroundImage pic2=new BackgroundImage("src/projekt/images/neptun.jpg");
				frame.add(pic4);
				//frame.pack();
				frame.invalidate();
				frame.validate();
				frame.repaint();			
				}});
		menu.Saturn.addActionListener(new ActionListener() {
			//changing background for neptune
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.remove(pic);
				//BackgroundImage pic2=new BackgroundImage("src/projekt/images/neptun.jpg");
				frame.add(pic5);
				//frame.pack();
				frame.invalidate();
				frame.validate();
				frame.repaint();			
				}});

		frame.setVisible(true);
		
		//add(new CenterPanel(),BorderLayout.CENTER);

//		try {
//			  this.setContentPane(
//			    new JLabel(new ImageIcon(ImageIO.read(new File("ksiezyc.jpg")))));
//			} catch (IOException e) {};
//		JLabel background = new JLabel(new ImageIcon(ImageIO.read(new File("src/projekt/images/ksiezyc.jpg"))));
//		setContentPane(background);
//		
//		background.setPreferredSize(new Dimension(50,50));
//		background.setVisible(true);

	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}


	public BackgroundImage getPic() {
		return pic;
	}

	public void setPic(BackgroundImage pic) {
		this.pic = pic;
	}
}
