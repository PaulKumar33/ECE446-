
//imports needed for java sound api
import javax.sound.sampled.*;
import java.io.*;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;



public class microphone_access_java {
	
	private String FormatError(String e) {
		String errorString = null;
		errorString = String.format("Error thrown: %s", e);
		return errorString;
	}
	
	public void SetupMicrophone() {
		/*this method is to aid with audio connection*/
		String errorString;		
		
		AudioFormat format = new AudioFormat(8000.0f, 16, 1, true, true);
		try {
			TargetDataLine microphone = AudioSystem.getTargetDataLine(format);
		}
		catch(Exception e){
			errorString = FormatError(e.toString());
			System.out.println("There was an error");
			System.out.println(errorString);
		}
		
		Mixer.Info[] mixerInfos = AudioSystem.getMixerInfo();
		for (Mixer.Info info: mixerInfos)
		{
			Mixer m = AudioSystem.getMixer(info);
			Line.Info[] lineInfos = m.getSourceLineInfo();
			for (Line.Info lineInfo:lineInfos)
			{
				System.out.println (info.getName()+"---"+lineInfo);
				try {
					Line line = m.getLine(lineInfo);
					System.out.println("\t-----"+line);
				}
				catch(Exception e){
					errorString = FormatError(e.toString());
					System.out.println("There was an error");
					System.out.println(errorString);
				}
			}
			 lineInfos = m.getTargetLineInfo();
			 for (Line.Info lineInfo:lineInfos)
			 {
				 System.out.println (m+"---"+lineInfo);
				 try {
					 Line line = m.getLine(lineInfo);
					 System.out.println("\t-----"+line);
				 }
				 catch(Exception e) {
					 errorString = FormatError(e.toString());
						System.out.println("There was an error");
						System.out.println(errorString);
				 }
			 }
		 }
	}

}
