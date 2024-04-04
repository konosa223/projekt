package projekt;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class BottomPanel extends JPanel {

	JPanel bottomPan=new JPanel();
	
	
	public BottomPanel() {
		setBackground(Color.red);
		setPreferredSize(new Dimension(50,100));
		
	}


	public JPanel getBottomPanel() {
		return bottomPan;
	}


	public void setBottomPanel(JPanel bottomPanel) {
		this.bottomPan = bottomPanel;
	}



}
