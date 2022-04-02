package swingPackage;

import javax.swing.*; // 1. import the swing package
public class MyLogin {
	JButton ok,exit,reset;	// 2. declare the required object references instances
	JPanel p;	
	JFrame f;
	MyLogin()	// default constructor
	{
		// 3. Instantiating the different components
		f = new JFrame("My Login");
		f.setSize(300,150);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		
		ok = new JButton("OK"); // creating the button
		exit = new JButton("EXIT");
		reset = new JButton("RESET");
		// Never put the components into the frame directly
		
		p.add(ok); // adding components to the panel
		p.add(exit);
		p.add(reset);
		
		f.add(p);	// adding the panel in frame
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new MyLogin();
	}

}
