package projekt;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class music extends Thread {
	String filepath;
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	public music(String fp) {
		setFilepath(fp);
	}
	@Override
	public void run() {

		AudioInputStream audioStream = null;
		try {
		    File file = new File(filepath);
		    audioStream = AudioSystem.getAudioInputStream(file);
		    Clip clip = AudioSystem.getClip();
		    clip.open(audioStream);    
		    clip.start();
    		clip.loop(Clip.LOOP_CONTINUOUSLY);

		}
		catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
		    System.err.println(ex);
		}
		finally {
		    try {
		        if (audioStream != null) {
		            audioStream.close();
		        }
		    }
		    catch (IOException ex) {
		        System.err.println(ex);
		    }
		}
		
	
		super.run();
	}

}
