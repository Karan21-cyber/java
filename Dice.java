package week2;
import java.util.Scanner;
import java.util.Random;
public class Dice {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		Random rand = new Random();
		
		int y = rand.nextInt(7);
		System.out.println("Rolling Dice \nHow many players do you want to play: ");
		int x = name.nextInt();
		
		if (x == 1) {
			System.out.println("You choose 1. \n You are playing alone.");
			System.out.println("You got "+y);
		}
		else if (x == 2) {
			System.out.println("Your choose 2 \nYou are playing with computer");
			int a = rand.nextInt(7);
			int b = rand.nextInt(7);
			System.out.println("You got "+ a);
		    System.out.println("Computer got "+ b);
		    if (a == b) {
		    	System.out.println("Both got same. Tie.");
		    }
		    else if(a > b) {
		    	System.out.println("You Wins");
		    	System.out.println("Computer lose");
		    }
		    else {
		    	System.out.println("Computer wins");
		    	System.out.println("YOu lose.");
		    
		    }
					
		}
		
		
	}

}
