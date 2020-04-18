import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


public class musicStuff{
	
	void playMusic(String musicLocation)
	{
		try{
		File musicPath= new File (musicLocation);
		if (true) {
			AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInput);
			clip.start();
			clip.loop(Clip.LOOP_CONTINUOUSLY);
			
			JOptionPane.showMessageDialog(null, "hit OK to pouse");
			long clipTimePosition = clip.getMicrosecondPosition();
			clip.stop();
			
			JOptionPane.showMessageDialog(null, "hit OK to pouse");
			clip.setMicrosecondPosition(clipTimePosition);
			clip.start();
			
			JOptionPane.showMessageDialog(null, "Press OK aby zatrzymac");
			

			
		} else {
			System.out.println("Muzyka nie znaleziona");
		}
		}catch (Exception Ex) {
		Ex.printStackTrace();
	}
}
}
