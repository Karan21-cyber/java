package week2;

public class values {
	public static void main(String[] args) {
		
		int x = 10; // local variable
		final int y = 45; // constant
		
		System.out.println("x = "+ x); // 10
		System.out.println("y = "+ y);
		
		x = 20;
		System.out.println("X  = "+x); // 20
		
		// y = 100; // You cannot change the value of a constant
		 x = 010; //octal
		 System.out.println("x= "+x); // 8 - decimal output
		 
		 x =  0xface; // hexa-decimal
		 System.out.println("X = "+ x); // -decimal output
		 
		 x = 0b0010; // assigning a binary number
		 System.out.println("X= "+ x); // equivalent decimal number
	}

}
