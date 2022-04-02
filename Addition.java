package week2;  // package statement - It must be the first line
// To ask the user to input two integers and print the sum of them.

// 1. to import the Scanner class
import java.util.Scanner;  // import statement

public class Addition {  

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		double x, y, sum = 0;
		
	  	System.out.print("Enter a number: ");
		x = obj.nextDouble();
		System.out.print("Enter another number: ");
		y = obj.nextDouble();
		sum = x+y;
		System.out.println("Addition of two numbers is "+ sum);
	}

}

class A  // default type classes
{
	
}
class B  // default type classes
{
	
}
