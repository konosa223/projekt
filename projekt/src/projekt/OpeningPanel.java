package projekt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class OpeningPanel extends JPanel {
	
	ImageIcon water = new ImageIcon("cow.jpg");

	JButton moon=new JButton(/*"Księżyc",*/new ImageIcon("ksiezyc ikona.jpg"));
	JButton saturn=new JButton(/*"Saturn",*/new ImageIcon("saturn ikona.jpg"));
	JButton neptun=new JButton(/*"Neptun",*/new ImageIcon("neptun ikona.jpg"));
	JButton mars=new JButton(/*"Mars",*/new ImageIcon("mars ikona.jpg"));
	JButton pluto=new JButton(/*"Pluton",*/new ImageIcon("pluton ikona.jpg"));
	JLabel pus=new JLabel(" ");
	JLabel lab=new JLabel("Wybierz planetę");
	public OpeningPanel() {
		Border emptyBorder = BorderFactory.createEmptyBorder();
		moon.setBorder(emptyBorder);
		saturn.setBorder(emptyBorder);
		neptun.setBorder(emptyBorder);
		mars.setBorder(emptyBorder);
		pluto.setBorder(emptyBorder);
		//moon.setHorizontalAlignment(SwingConstants.BOTTOM);
		JPanel pan=new JPanel();
		setBackground(Color.cyan);
		lab.setHorizontalAlignment(JLabel.CENTER);
		lab.setFont(new Font("Helvetica Bold",Font.PLAIN,40));
		add(lab,BorderLayout.NORTH);
		add(Box.createRigidArea(new Dimension(70, 0)));
		pan.setLayout(new FlowLayout());
		//setLayout(new GridBagLayout());
		pan.add(mars);
		add(Box.createRigidArea(new Dimension(10, 200)));
		pan.add(moon);
		//add(Box.createRigidArea(new Dimension(70, 0)));
		pan.add(neptun);
		//add(Box.createRigidArea(new Dimension(70, 0)));
		pan.add(pluto);
		//add(Box.createRigidArea(new Dimension(70, 0)));
		pan.add(saturn);
		add(pan,BorderLayout.CENTER);
	}

}
