package week2;
import java.util.Scanner;
import java.util.Random;
public class rock_paper_sissor {

	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("This is the game of Rock, Paper, Scissor");
		
		String user_input;
		user_input = ab.next();
		String[] computer = {"Rock","Paper","Scissor"};
		
		System.out.println("Thank for providing the input to the user."+ user_input);	
	}
}
