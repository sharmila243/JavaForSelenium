package OOPS_AbstractClass;

public class Z {
	
	
	//Abstract Class 
	//1. Page
	//2. LoginPage
	//3. LoginTest
	
	
	
	//Difference between Abstract class and Interface 
	//1. There is no concept called constructor in Interface
			//where as in abstract class, YES
	//2. For 100% abstraction we always use an interface excluding static and default methods from JDK 1.8 - WebDriver.java
			//Partial abstraction --> use abstract class
	//3. Variables defined in Interface are Static and Final in nature 
			//where as in abstract NO, variables declared are not final in nature.
	//4. cannot create the object of Interface
			//cannot create the object of abstract class but constructor can be called by creating the object of child class
	//5. Multiple Inheritance is possible in Interface 
			//Multiple Inheritance, creating a diamond problem from class to class is not possible in Abstract class 
	//6. Default methods are only possible in Interfaces
			//No default methods in abstract class

}
