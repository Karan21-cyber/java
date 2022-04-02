package variables;

public class variables {
	int x; // instance variable
	/*
	 * 1. It is declared inside a class but outside of any block or method.
	 * 2. We need an instance/ object to access it.
	 * 3. It gets the default value if it is not initialized.
	 * 4. It is an attributes or property of object.
	 * 5. Objects are always created in the dynamic memory area of RAM.
	 *    Hence instance variables are also created in the dynamic memory
	 *    area. Dynamic memory area is also known as Help area.
	 */
	
	
	static int y; //static variable
	/*
	 * 1. It is declared inside a class but outside of any block or method.
	 * 2. We need an instance/ object to access it.
	 * 3. It gets the default value if it is not initialized.
	 * 4. It belongs to the class itself.
	 */ 
	public static void main(String[] args) {
		
		int m; // we can declare
		int z= 10; // local variable
		/*
		 * 1. It is declared inside any block or method.
		 * 2. We do not require an instance / object to access it.
		 * 3. It does not gets the default value if it is not initialized.
		 * 4. It must be initialized to access it.
		 */ 
		
		
		variables v; // reference variable - user defined type
		
		v = new variables();
		// Object is an instance of a class
		//
		System.out.println("Value of x = "+ v.x);    // calling the variable x
													// through the instance	
		System.out.println("Value of y = "+ y);    // calling the variable y
		
		System.out.println("Value of z = "+ z);
	}
	
}