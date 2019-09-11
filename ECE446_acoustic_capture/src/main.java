//import MainGui;


public class main{
	public static void main(String[] args) {
		System.out.println("this is the main method");
		/*
		MainGui guiFrame = new MainGui(500, 400);
		guiFrame.InitGui();*/
		
		AccessComPorts COM = new AccessComPorts();
		COM.ListCOMPorts();
	}
}