package world;

public class Hi {

	public static void main(String[] args) {
		String name = "karan";  // String is non primitive type. It is a class.
								// So in this we are atually declaring an object
								// of String type.
		String address = "ktm";
		String email = "karan@gmail.com";
		
		String num = "10";  // object : String values cannot be changed - [immutable]
							// String are immuatable
		num.concat("40");   // the reference is the new memory location
		
		int x = 10;			// variable
		 x= 20;
		 
		System.out.println("Name: "+ name);
		System.out.println("Address: "+ address);
		System.out.println("Email: "+ email);
		
		System.out.println("Number: "+num);
		System.out.println("Number: "+x);
	}

}
