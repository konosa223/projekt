package projekt;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class CenterPanel extends JPanel {

	JPanel centerPan=new JPanel();
	
	public CenterPanel() {
		setBackground(Color.blue);
		setPreferredSize(new Dimension(600,400));

	}

	public JPanel getCenterPan() {
		return centerPan;
	}

	public void setCenterPan(JPanel centerPan) {
		this.centerPan = centerPan;
	}
	public void changeBackgroud(String name) {

	}
}
