package projekt;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class Frame extends JFrame {

	JFrame frame=new JFrame();
	
	public Frame() throws HeadlessException {
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MenuBar menu=new MenuBar();
		setJMenuBar(menu.getMenuBar());
		setVisible(true);
		add(new BottomPanel(),BorderLayout.SOUTH);
		add(new CenterPanel(),BorderLayout.CENTER);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}



}
