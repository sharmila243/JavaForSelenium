package SuperKeyword;

public class BMW extends Car{
	
	
	//Is this variable overriding?
	//No, there is no concept called variable overriding, method will be overridden not variables
	//BMW having it's own variable and car has it's own variable
	
	int min_speed = 200;
	
	
	public BMW() {
//		this(10); //Calling another BMW Constructor
//		super();
		super(20);
		System.out.println("BMW -- default Constructor");
	}
	
	public BMW(int i) {
		System.out.println("BMW -- Constructor: " +i);
	}
	
	
	
	public void displaySpeed() {
		System.out.println(min_speed);
		
		//now I want to access min_speed of Car class variable, that means variable of parent class
		//user super keyword
		System.out.println(super.min_speed);
		
		//Advantage of super keyword is
			//I can access parent class variables and methods without creating the object 
		
		//If there is no concept called super then in order to call parent class methods/variables
			//I need to create the object of parent class then using reference variable, i could access them
			//here by using SUPER keyword I can access parent class variables and methods
		
	}
	
	public void speed() {
		System.out.println("BMW -- speed");
		super.speed(); //speed method of car class
		System.out.println(super.min_speed); //100 of Car class
		
		//static
		super.ABS();//static methods can be called using keyword but it is the best practice to call it 
							//using class name
		Car.ABS();

	}
	


	

}
