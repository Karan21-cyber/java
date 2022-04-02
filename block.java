package classs;

public class block {
	// instance initializer block
	{
		System.out.println("Hi from IIB block");
	}
	
	
	
	public static void main(String[] args) {
		
		new block(); // creating an object
		System.out.println("HI from main block");
		
	}
	// static initializer block(SIB)   // It has main priority then main block
		static{
			System.out.println("Hi from static block");
		}

}
