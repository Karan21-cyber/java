package world;

import java.util.Scanner;
public class Grading {
	
	public static void main(String[] args) {
		
		int oop, fod, net;
		double grade;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks in OPP: ");
		oop = sc.nextInt();
		System.out.println("Enter marks in FOD: ");
		fod = sc.nextInt();
		System.out.println("Enter marks in NET: ");
		net = sc.nextInt();
		
		double avg = (oop+fod+net)/3;
		
		if (avg < 40) {
			grade = 'F';
			System.out.println("Grade = "+ grade);
		}
		else if ((avg >= 40) && (avg < 50 )) {
			grade = 'D';
			System.out.println("Grade = "+ grade);
		}
		else if ((avg >= 50) && (avg < 60 )) {
			grade = 'C';
			System.out.println("Grade = "+ grade);
		}
		
		else if ((avg >= 60) && (avg < 70 )) {
			grade = 'B';
			System.out.println("Grade = "+ grade);
		}
		else if ((avg >= 70) && (avg < 80 )) {
			grade = 'A';
			System.out.println("Grade = "+ grade);
		}
		else {
			grade = 'A';
			System.out.println("Grade = "+ grade + "+");
		}
		
	}

}
