package week2;

public class input_data_without_class {

	public static void main(String[] args) {
		
		int x, y, sum=0;
		x = Integer.parseInt(args[0]); // input is string. It must be converted to integer
		y = Integer.parseInt(args[1]);
		sum = x + y; // adds two integers
		System.out.println("Addition of "+ args[0]+" and "+args[1]+" = "+ sum);
		
	}

}
