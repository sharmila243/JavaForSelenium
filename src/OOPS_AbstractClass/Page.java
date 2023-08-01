package OOPS_AbstractClass; //gives the abstract features in the form of classes not in the form of Interfaces

public abstract class Page { //this Page has to be abstract in nature, so add an abstract keyword
	//this is not a normal class but an abstract class 
	
	//I cannot create the object of abstract class - there are few methods where there is no implementation logic
	//Can I create the constructor of abstract class? - YES
	
	
	//Can I define constructor, As we cannot create the object of abstract class?? YES
	//When or how to call the constructor?
	//Page class constructor will be called when we create the object of the child class object. 
	public Page() {
		this(10);
		System.out.println("Page -- Default constructor");
	}
	
	public Page(int a) {
		System.out.println("Page -- 1 Parameterized constructor: " + a);
	}
	
	//
	int loading_time = 5;

	
	
	public abstract void title(); 
	//method without method body is called abstract method
	//but in abstract class we explicitly have to mention abstract keyword while defining the method
		//whenever we are using an abstract method inside abstract class we have to use abstract keyword
		//we don't do this in Interface. Interface methods are by default abstract in nature.
	
	public abstract void url();
	
	//non-abstract methods
	public void defaultTimeOut() {
		System.out.println("Page -- TimeOut -- 20Sec");
	}
	
	public static void displayFooters() { //displayFooters is a common method
					//for every web application or web page, every page has the same footers 
					//it should not overridden, if it is non-static in nature that means
					//we are giving chance to child classes to manipulate it 
					//In order to avoid this, we can do it static in nature - so that this method cannot be overridden
		System.out.println("Page -- displayFooters");
	}
	
	public final void displayLogo() { //logo should be same in all the pages, so declare it final, 
											//so that child class cannot override it
		System.out.println("Page -- displayLogo");
	}
	
	
	//Is it mandatory to have the abstract methods? NO
	
	//no abstract methods - 0% Abstraction
	//all abstract methods - 100% Abstraction
	//Combination - Partial Abstraction (0 - 100%)
	
	 
	
	//Constructor
	//In general constructor will be called by creating the object,
			//but here we cannot the object of abstract class then how to call the constructor of page class
	//Page class constructor will be called by creating the object of child class object
	
	//Execution goes this way: 
	//As soon as we create the object of child class
			//Execution starts from child class
			//Java checks if there are any constructors in the class 
			//If yes, Java checks if the class is extending any parent class
			//If yes, instead of going inside child class constructor it goes to the parent class and check if there are any constructors 
			//If there are any constructor, default constructor will be called first and then 
			//preference will always be given to the parent class's default constructor
			//execution goes back to the child class's constructor and then child class constructor be called
	
	
	//If there is a parameterized constructor and no default constructor in parent class:
	//java will not create a hidden constructor for parent class here
	//we explicitly have to create a default constructor in Parent class 
		//If not it gives error in child class's constructor saying 
		//that we have to create the default constructor in parent class
	
	
	//Can abstract page class implement an interface - YES 
		//whether it can be class or abstract class it can implement Interface 
		//Child class's responsibility to implement all the abstract methods of Interface
	
	
}
