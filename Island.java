package week2;
import java.util.Scanner;
import java.util.Random;
public class Island {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		Random rand = new Random();
	
		int count = 0;
		System.out.println("Here is the 5 island. And the Gold travels every night.\nFind the Gold.");
		while (true) {
		count++;	
		System.out.println("Where is the Gold. Select the island:  ");
		int x = obj.nextInt();
		int y = rand.nextInt(6);
		if (x == y) {
			System.out.println("Congratulation you found the Gold. Gold is in Island "+y);
			System.out.println((count)+" Attempts taken.");
			break;
		}
		else {
			System.out.println("Try again!!");
		}
		}
	}
}
