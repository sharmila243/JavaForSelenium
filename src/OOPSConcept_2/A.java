package OOPSConcept_2;

import OOPSConcept_1.Browser;

public class A {

	public static void main(String[] args) {
		
		System.out.println("A - main method");
		
		//can we call B class? - YES
		//how? since it's static void main()
		//Static methods are called using class name
		
		B.main(args);
		
		//can we call a class from a different package? - YES
		Browser.main(args);
		
		
		//Dis-advantage of static:
		//static driver = new chromeDriver;
		//Difficulty in Parallel execution - running multiple test cases at a time
		//If I have 10 test cases, I can only access static driver once at a time while running test cases
		
	}

}
