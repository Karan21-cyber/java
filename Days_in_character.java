package world;

import java.util.Scanner;

public class Days_in_character {

	public static void main(String[] args) {
		String s;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name of the week : ");
		s = sc.next();
		/**
		 *  In c/ C++ , condition in a switch must be an integer or a character or 
		 *  an expression that results an integer or character.
		 *  also case must be an integer or character
		 *  case in java we can use string also
		 */
		
		switch(s)
		{
		case "Sunday":
		case "Saturday":
			System.out.println("No class today");
			break;
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":	
		case "Friday":
			System.out.println("Classes today");
			break;
			
			
		/**
		 * Default statement can be written anywhere inside the switch
		 * Default statement 
		 */
		default:
			System.out.println("Please enter vaild days only");
			break;
	}

}
}
