package OOPSConcept_6;

public class Car extends Vehicle { //If a class is declared final it cannot be a parent 
	
	//Parent --> child
		//Parent can have multiple child classes
		//Child class can have ONLY and ONLY one parent class
	//Vehicle --> Car --> BMW, Audi, Honda
		//Vehicle - Grand parent
		//Child classes can have all the properties of Parent class and 
					//also can have their own individual properties
		//Car cannot inherit anything from the child class(BMW, Audi, Honda)
		//Inheritance between siblings is NOT POSSIBLE
	
	//MultiLevel Inheritance:
	//Science --> Physics --> AeroDynamics --> Mechanical --> Automobile --> Vehicle --> Car --> BMW, Audi, Honda
	//JAVA supports MULTI-Level Inheritance.
	//Multiple Inheritance is not achieved here in the form of classes. BMW extends Car,Truck -> not allowed
	
	public void start() {
		System.out.println("Car -- Start");
	}
	
	public void stop() {
		System.out.println("Car -- Stop");
	}
	
	public void refuel() {
		System.out.println("Car -- refuel");
	}
	
	
	//can we override static methods?? No, Strictly not allowed in JAVA
	//Static methods are stored in CMA 
	//Object Oriented Programming concepts means doing the Polymorphism OR Overriding in the child class
				//always associated with the objects
				//static is never part of the object
	public static void billing() {
		System.out.println("Car -- billing");
	}
	
	//how private methods are accessed? - by creating another public method and calling the private method internally
		//and giving the access to the public method - called ENCAPSULATION
	
	//can private methods be overridden?? - NO, check using annotation
	private void testing() {
		System.out.println("Car -- testing");
	}
	
	public void carTest() {
		testing();
		test();
		System.out.println("Car -- carTest");
	}
	
	//Final method
	//If a method is declared final it cannot be overridden
	public final void power() {
		System.out.println("Car -- power");
	}
	//Use Case: There are different methods loginPage, homePage, registrationPage, displayLogo method
	//If displayLogo method is not declared final
	//that means we are giving an option to all the child classes to override/manipulate it 
	//they can change the logo of the application
	//Because throughout the application logo will remain the same 
	//Can I inherit the final method? --> BMW.power();
	
	//final:
	//1. constant values. final int i = 10;
	//2. to prevent the method overridding. displayLogo() method
	//3. to prevent Inheritance. If a class is declared final it cannot be the parent class.
	
	//Final & static method
	public final static void ABS() { //Since it is final/static cannot be overridden - no use case even
		System.out.println("Car -- ABS");
	}
	
	//can I have the same method in child class? private static?
	private static void test() {
		System.out.println("Car -- test");
	}
	
}
