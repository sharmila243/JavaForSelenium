package OOPSConcept_2;

public class Employee { //Static & non-static methods _ 1 --> Car.java
	
	//Class Static variable - static keyword
	//Object will never hold static methods/ variables
	
	String name; //instance variable
	static int age; //static variable
	
	
	public void getEmail() {
		System.out.println("get email method");
	}
	
	public static void sendEmail() {
		System.out.println("Send email method");
	}
	

	
	
	public static void main(String[] args) {

		Employee e = new Employee();
				
		//how to access non-static variables - Object	
		e.name = "Sharmila";
		System.out.println(e.name);
		
		//how to access static variables - using class name - yes / directly also - yes /using object?
		Employee.age = 25; //suggestible
//		age = 30;
//		e.age = 34; //warning to access the static variables in static way
		System.out.println(age);
		
		//
		e.getEmail(); //non-static methods should be accessed using object
		
		Employee.sendEmail(); //static methods are accessible using class name/ directly
//		sendEmail();
//		e.sendEmail(); //warning to access in a static way
		
	}

}
