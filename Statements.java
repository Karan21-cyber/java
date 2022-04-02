package world;

public class Statements {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int max;
		
		if (a > b) {
			System.out.println("A is greater than B");
			max = a;
		}
		else {
			System.out.println("B is greater than A");
			max = b;
		}
		max = (a > b)? a:b;  // ternary operator
	}

}
