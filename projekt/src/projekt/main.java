package projekt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

//Cow(double x,double y, double v_x, double v_y, double gravity, double wind){


	public class main {
		static boolean always = true;
		public static void main(String[] args) throws InterruptedException {
			
			frame f = new frame();
			f.bottomPanel.strzal.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					   if (e.getActionCommand().equals("Strzał"))
					   {
							Cow cow = new Cow(150,150,f.bottomPanel.getV()*Math.cos(Math.toRadians(f.bottomPanel.getAngle())),f.bottomPanel.getV()*Math.sin(Math.toRadians(f.bottomPanel.getAngle())),f.getG(),f.getWi());
							f.newCow(cow);					   }					
				}
			});
			//f.bottomPanel.getAngle()
			while(always) {
			f.addtime();
			TimeUnit.MILLISECONDS.sleep(1);
			//f.playMusic(null);
			
			
			
			}
		}
	}


