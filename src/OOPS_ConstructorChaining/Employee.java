package OOPS_ConstructorChaining;

public class Employee {

	String name;
	int age;
	double salary;
	
	
	public Employee() {
		this("Sharmila", 26); //Constructor calling should be the first statement of the constructor
		//Constructor with 2 parameters is called here
	}
	
	public Employee(String name, int age) {
		this(name, age, 12.33); //go to constructor with 3 parameters L21, 22, 23, 24
		this.name = "SharmilaBhargav"; //then comes back here and update the name and age here
		this.age = 27;
	}
	
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	public static void main(String args[]) {
		
		Employee obj = new Employee(); //call the default constructor
		//inside default constructor, another constructor with 2 parameters is called.
		//2 parameterized constructor is called and the variables are initialized accordingly
		
		System.out.println("Name: " + obj.name);
		System.out.println("Age: " + obj.age);
		System.out.println("Salary: " + obj.salary);
		
	}
	
	//this keyword
	//1. Builder patters
	//2. Constructor to initialize variables 
	//3. getter & setter - Encapsulation
	//4. Constructor chaining/ calling
	
	
	
}
