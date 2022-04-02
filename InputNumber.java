package week2;
// To ask the user to input a number

// In java import statements are used
import java.util.Scanner; // Scanner class is used to input data
public class InputNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // creating object of the Scanner class
		// System.in : represent the keyboard
		System.out.println("Input a number: ");
		int num;
		num = sc.nextInt(); // stores the Input values in the variables
		
		System.out.println("The value input by the user is "+ num);
		num++;
		System.out.println("THe incremented value is "+ num);
	}
}
