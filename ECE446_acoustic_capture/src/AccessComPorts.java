import java.io.*;
import java.util.*;
//import javax.comm.*;
import gnu.io.CommPortIdentifier;


public class AccessComPorts {
	
	//just a silly reminder. constructors dont need types (class type)
	public AccessComPorts(){
		///class cosntructor
	}

	public void ListCOMPorts() {
		Enumeration ports = CommPortIdentifier.getPortIdentifiers();
		while(ports.hasMoreElements()) {
			System.out.println(((CommPortIdentifier)ports.nextElement()).getName());
		}
	}
	
}
