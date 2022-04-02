package world;

public class strings {

	public static void main(String[] args) {
		
		int x = 10; // local variable : created in the stack area
		
		strings obj; // reference variable : created in the stack area
		obj = new strings(); // object part [new Strings] is created in the dynamic area
		
		String name; // stack
		name = "TBC";  // TBC is created in the heap area
		System.out.printf(name);
		System.out.printf("%d",x);
		var address = "Pokhara";
	}

}
