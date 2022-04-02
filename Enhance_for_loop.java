package world;
/**Enhanced for loop
 * 
 * Enhanced for is introduced in java.
 * It is used for retrieving data from the collections or arrays.
 * It is a short form of for loop.
 *
 */
public class Enhance_for_loop {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5};
		
		/*for(int i = 0; i<5 ; i++) 
		{
			System.out.println(num[i]);
		}*/
		
		for(int x: num) 
		{
			System.out.println(x);	
		}
	}
}
