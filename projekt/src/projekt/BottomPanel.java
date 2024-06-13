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
	double v;
	double angle;
	
	

	JLabel forceLabel=new JLabel("prędkość wylotowa:");
	JSlider forceSlider=new JSlider(JSlider.HORIZONTAL,0,1000,10);
	JTextField forceTextField=new JTextField() ;
	JLabel angleLabel=new JLabel("kąt rzutu:");
	JSlider angleSlider=new JSlider(JSlider.HORIZONTAL,-10,90,10);		
	JTextField angleTextField=new JTextField() ;
	JButton strzal=new JButton("Strzał");

	public BottomPanel() {
		setPreferredSize(new Dimension(50,100));

		forceTextField.setPreferredSize(new Dimension(100,20));

		angleTextField.setPreferredSize(new Dimension(100,20));
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
	            setV(((JSlider) ce.getSource()).getValue());
	            //System.out.println(getV());

			}
		});
		angleSlider.addChangeListener(new ChangeListener() {
			

			@Override
			public void stateChanged(ChangeEvent ce) {
	            angleTextField.setText(Integer.toString(((JSlider) ce.getSource()).getValue()));
	            setAngle(((JSlider) ce.getSource()).getValue());
	            //System.out.println(getAngle());
			}
		});
		//forceTextField.add
	}
	

	public JPanel getBottomPanel() {
		return bottomPan;
	}


	public void setBottomPanel(JPanel bottomPanel) {
		this.bottomPan = bottomPanel;
	}
	public double getV() {
		return v;
	}


	public void setV(double v) {
		this.v = v;
	}


	public double getAngle() {
		return angle;
	}


	public void setAngle(double angle) {
		this.angle = angle;
	}


}
