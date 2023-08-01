package OOPSConcept_6;

public class BMW extends Car{ //Can I extend truck class also separated by comma?? NO, a class can extend only one parent class
	//To create the relationship between parent class and child class --> user keyword -> extends
	//BMW is the Child of Car
	//BMW is sub class of Car
	//Car is the parent class of BMW
	//Car is the super class of BMW
	
	
	//METHOD OVERRIDING - RUN-Time / Dynamic Polymorphism
	//when we have a method in parent class and same method in child class
	//1. same name 
	//2. same no. of parameters
	//3. same order/sequence of the parameters (int i), (int a, String x) - order should be same in both classes
	//4. Return type also should be same
	
	
	
	@Override
	public void start() {
		System.out.println("BMW -- Start"); //this-BMW's Auto Start method - updated from Car class start method	
													//Method Overriding
	}
	
	//Individual method
	public void autoParking() {
		System.out.println("BMW -- autoParking");
	}
	
	
	
	//METHOD HIDING - When you try to have the same parent class STATIC method in the child class is called MH
	//MH is ONLY & ONLY for STATIC METHODS
	
//	@Override 
	//to prove if static method can be overridden or not use the annotation
	//After the annotation it gives the error means - we cannot override the static method
	//If we remove the annotation @Override it becomes BMW's own individual billing method 
	//How to access Static methods? using class name --> TestCar
	public static void billing() {
		System.out.println("BMW -- billing");
	}
	
//	@Override
	//private methods cannot be overridden
	//to prove if private method can be overridden or not use the annotation
	//If we remove the annotation @Override it becomes BMW's own individual testing method 
	private void testing() {
		System.out.println("BMW -- testing");
	}
	
	public void BMWTest() {
		testing();
		test();
		System.out.println("BMW - BMWTest");
	}
	
	//without any annotation shows the error that final method cannot be overridden
//	public final void power() {
//		System.out.println("Car -- power");
//	}
	
	//private static? YES, this is not Overriding but this is Method Hiding
	private static void test() {
		System.out.println("BMW -- test");
	}
	
	
	
	

}
