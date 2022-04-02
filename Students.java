package week2;

public class Students {
	
	int rollno;
	String name;
	String address;
	int age;
	
	public void display()
	{
		System.out.println("Roll no : "+ rollno);
		System.out.println("Name : "+ name);
		System.out.println("Address : "+ address);
		System.out.println("Age : "+ age);
	}
	
	Students (int roll, String names, String add, int ages)
	{
	rollno = roll;
	name = names ;
	address = add;
	age = ages;
	}

	public static void main(String[] args) {
		
		// creating an instancee of class students
		Students ram = new Students(100,"Ram","POkhara",21);
		ram.display();  // calling the behavior of the object Ram
		
	}

}
