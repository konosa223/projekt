package projekt;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SuccesFrame extends JFrame {
	
	JLabel label = new JLabel("Gratulacje ! :)");
	
	SuccesFrame(){
		this.setSize(300,300);
		this.add(label);
		
		this.setVisible(true);
	}
}
