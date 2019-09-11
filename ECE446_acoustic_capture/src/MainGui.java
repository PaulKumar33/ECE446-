import javax.swing.*;

public class MainGui {
	//class variables
	public static int xDimension;
	public static int yDimension;
	
	
	public MainGui(int xDim, int yDim) {
		//this is the class constrcutor
		this.xDimension = xDim;
		this.yDimension = yDim;
		
		InitGui();
	}
	
	public static void InitGui() {
		
		//init gui
		JFrame frame = new JFrame("Acoustics Acquistion Gui");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(xDimension, yDimension);
		frame.setVisible(true);
		
		//init gui elements
		//panel
		JPanel panel = new JPanel();
		frame.add(panel);
		
		//adding com drop down
		JLabel comLabel = new JLabel("Available COM instruments");
		comLabel.setVisible(true);
		panel.add(comLabel);
		
		String[] choices = {};			//init empty list of elements
				
		//buttons
		JButton button = new JButton("Press");
		frame.getContentPane().add(button);
		
		
		
	}

}
