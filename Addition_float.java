package week2;

public class Addition_float {

	public static void main(String[] args) {
		
		double x, y, sum=0;
		x = Double.parseDouble(args[0]); // input is string. It must be converted to double
		y = Double.parseDouble(args[1]);
		sum = x + y; // adds two integers
		System.out.println("Addition of "+ args[0]+" and "+args[1]+" = "+ sum);
		
	}
}
