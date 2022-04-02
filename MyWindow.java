package swingPackage;
import javax.swing.*;
public class MyWindow {
	
	/*
	 * Constructor are the special type of methods that has no return type 
	 * and its name is same aas the class name.
	 * 
	 * It is of two types
	 * 1. default constructor - no parameters
	 * 						  - It is automatically provided by the compiler
	 * 						  - if it is not declared in the class.
	 * 
	 * 2. parameterized constructor - it has some parameters.
	 */
	JFrame f;
	MyWindow() // constructor : created all the components in the constructor
	{
		f = new JFrame("My Login Window");
		f.setSize(300,150);
		//f.setLocation(400,200);	// creates the frame at the specified position
		f.setLocationRelativeTo(null);  // creates the frame at the center 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to terminate the window frame
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new MyWindow(); // call the constructor
		
		
	}

}
