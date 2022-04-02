package practise;
import java.util.Scanner;
public class vote {

	public static void main(String[] args) {
		Scanner  obj = new Scanner(System.in);
		int age;
		String name;
		System.out.println("This is the system to check weather you can vote or not");
		System.out.println("What is your name: ");
		name = obj.next();
		System.out.println("Enter your age: ");
		age = obj.nextInt();
		
		if (age >= 18) {
			System.out.println("You are eligible for vote");
		}
		else {
			System.out.println("You are not eligible for vote");
		}
			
		
	}

}
