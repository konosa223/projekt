package projekt;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class BottomPanel extends JPanel {

	JPanel bottomPan=new JPanel();

	
	public BottomPanel() {
		setPreferredSize(new Dimension(50,100));
		JLabel forceLabel=new JLabel("prędkość wylotowa:");
		JSlider forceSlider=new JSlider(JSlider.HORIZONTAL,0,30,10);
		JTextField forceTextField=new JTextField() ;
		forceTextField.setPreferredSize(new Dimension(100,20));
		JLabel angleLabel=new JLabel("kąt rzutu:");
		JSlider angleSlider=new JSlider(JSlider.HORIZONTAL,0,90,10);
		JTextField angleTextField=new JTextField() ;
		angleTextField.setPreferredSize(new Dimension(100,20));
		JButton strzal=new JButton("Strzał");
		add(forceLabel);
		add(forceSlider);
		add(forceTextField);
		add(Box.createHorizontalStrut(40));
		add(angleLabel);
		add(angleSlider);
		add(angleTextField);
		add(Box.createHorizontalStrut(40));
		add(strzal);
		forceSlider.addChangeListener(new ChangeListener() {
			

			@Override
			public void stateChanged(ChangeEvent ce) {
	            forceTextField.setText(Integer.toString(((JSlider) ce.getSource()).getValue()));
	
			}
		});
		angleSlider.addChangeListener(new ChangeListener() {
			

			@Override
			public void stateChanged(ChangeEvent ce) {
	            angleTextField.setText(Integer.toString(((JSlider) ce.getSource()).getValue()));
	
			}
		});
	}


	public JPanel getBottomPanel() {
		return bottomPan;
	}


	public void setBottomPanel(JPanel bottomPanel) {
		this.bottomPan = bottomPanel;
	}



}
