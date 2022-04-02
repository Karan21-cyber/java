package week2;

public class Employee {
	
	// Declaration of instance variables
	private int eid;
	private String name;
	private String dept;
	private int salary;
	
	public void display() {
		
		System.out.println("Employee ID : "+eid);
		System.out.println("Name : "+name);
		System.out.println("Department : "+dept);
		System.out.println("Salary : "+salary);
	}
	
	// constructor
	public Employee(int id, String n, String d, int s) {
		eid = id;
		name = n;
		dept = d;
		salary = s;
	}
	public static void main(String[] args) {
		
		Employee emp = new Employee(101,"Karan","IT",35000);  // creating an object 
		emp.display();  // calling the method
		
	}

}
