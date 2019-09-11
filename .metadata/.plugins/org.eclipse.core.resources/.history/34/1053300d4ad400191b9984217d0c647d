
//imports needed for java sound api
import javax.sound.sampled.*;
import java.io.*;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;



public class microphone_access_java {
	
	public void SetupMicrophone() {
		AudioFormat format = new AudioFormat(8000.0f, 16, 1, true, true);
		try {
			TargetDataLine microphone = AudioSystem.getTargetDataLine(format);
		}
		catch(Exception e){
			System.out.println("There was an error");
		}
	}

}
