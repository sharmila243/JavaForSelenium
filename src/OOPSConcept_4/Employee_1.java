package OOPSConcept_4;

public class Employee_1 {

	String name;
	int age;
	String city;
	
	//Constructor - Source - create constructor with specific fields
	//1. Same name as Class name 
	//2. Does not return anything, no void also
	//3. If the constructor name is exactly matching with the class name, then it is called as Constructor not METHOD
	//4. can pass parameters to the constructor - overloading is possible - Polymorphism(many forms of Constructor)
	//5. COnstructor is independent of each other so cannot be created inside a Method
	
	public Employee_1() { //Default/ 0 parameter constructor
		System.out.println("default Constructor");
	}
	
	public Employee_1(int a) { //1 param
		System.out.println(a);
	}

	public Employee_1(int a, int b) { //2 param
		System.out.println(a+b);
	}
	
	public Employee_1(String a, int b) { //2 param
		System.out.println(a+b);
	}
	
	public Employee_1(int a, String b) { //2 param
		System.out.println(a+b);
	}
	


	public static void main(String[] args) {

		//How to call a Constructor
		Employee_1 e1 = new Employee_1(26,"Sharmila");
		
		e1.name = "Sai";
		System.out.println(e1.name);
		
		
		
	}

}
