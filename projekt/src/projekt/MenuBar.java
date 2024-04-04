package projekt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenuBar extends JMenuBar {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu=new JMenu("Menu");
		JMenuItem planetSubMenu = new JMenu("Wybierz planetę");
		JMenuItem phisicistSubMenu = new JMenu("Wybierz fizyka");
		JMenuItem cowSubMenu = new JMenu("Wybierz krowę");
		JMenuItem Moon = new JMenuItem("Księżyc");
		JMenuItem Mars = new JMenuItem("Mars");
		JMenuItem Neptune = new JMenuItem("Neptun");
		JMenuItem Pluto = new JMenuItem("Pluton");
		JMenuItem Saturn = new JMenuItem("Saturn");
		String nameOfPlanet="Moon";
	public JMenuBar getMenuBar() {
		return menuBar;
	}
	public void setMenuBar(JMenuBar menuBar) {
		this.menuBar = menuBar;
	}
	
	public MenuBar() {

		menu.add(planetSubMenu);

//		cowSubMenu.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});

		menu.add(cowSubMenu);
		menu.add(phisicistSubMenu);
		planetSubMenu.add(Moon);
		planetSubMenu.add(Mars);
		planetSubMenu.add(Neptune);
		planetSubMenu.add(Pluto);
		planetSubMenu.add(Saturn);

		menuBar.add(menu);
	}

	public String getNameOfPlanet() {
		return nameOfPlanet;
	}
	public void setNameOfPlanet(String nameOfPlanet) {
		this.nameOfPlanet = nameOfPlanet;
	}
}
