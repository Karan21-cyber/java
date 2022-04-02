package world;

import java.util.Scanner;

public class Days_switch {

	public static void main(String[] args) {
		
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number(1-7): ");
		num = sc.nextInt();
		/**
		 *  In c/ C++ , condition in a switch must be an integer or a character or 
		 *  an expression that results an integer or character.
		 *  also case must be an integer or character
		 *  case in java we can use string also
		 */
		
		switch(num)
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
			
		/**
		 * Default statement can be run
		 */
		default:
			System.out.println("Please enter numbers betweent 1 to 7 only");
			break;
		}
	}

}
