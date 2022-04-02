package week2;

import java.util.Scanner;

// sum of two number with the user input
public class sum_of_two_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // creating object of the Scanner class
		System.out.println("Sum of two number with the user input");
		System.out.println("Enter first number: ");
		int num1,num2,sum; // declaring the variable data types
		num1 = sc.nextInt();  // storing the input variables
		System.out.println("Enter second number: ");
		num2 = sc.nextInt();  // storing the input variables
		sum = num1 + num2;
		System.out.println("The value of two number is : "+ sum );
	}
}
