package SuperKeyword;

public class Z {
	
	//SuperKeyword Concept
	//1. Car
	//2. BMW
	//3. TestCar
	//4. Vehicle
	
	//5. USMedical
	//6. FH
	//7. TestHospital
	
	//super keyword is used:
		//1. Inside a method
		//2. Inside a constructor
		//3. inside setter and getter methods 
	
	//In a constructor if we are using super keyword, it should be used as the first statement
	//Same applies to the this keyword
	
	//So we cannot have super and this inside a constructor
		//It is our decision to use the keyword we need in the constructor
	
	
	//If min_speed is not present in car and BMW but in GP vehicle we have min_speed
		//and if we call super.min_speed - will it inherit? YES, we can inherit the property from GP
		//But if immediate parent car class has min_speed variable, preference is given to immediate parent class
				//not GP 
	
	
	
	//Vehicle - default 										//Car - constructor (i)
																
	//Car extends Vehicle										//BMW extends Car 
	//Car - default													//BMW - default 
		//- Constructor (internally called)								//- Constructor(i) - internally called
			
	//BMW extends Vehicle										//No default constructors in 
	//BMW - default														//Car class	
		//-Constructor (internally called)								//vehicle class	
		
	//create the object of the class BMW						//Create the object of the class BMW
		//BMW b = new BMW();										//BMW b = new BMW();
	
	//execution:												//Execution - error
		//Vehicle													//We explicitly have to create a default 
		//Car - constructor											//constructor in parent class
		//Car - default constructor									//L50
		//BMW - constructor
		//BMW - default constructor
	
	
	//If there is a parameterized constructor and no default constructor in parent class:
		//java will not create a hidden constructor for parent class here
		//we explicitly have to create a default constructor in Parent class 
			//If not it gives error in child class's constructor saying 
			//that we have to create the default constructor in parent class
		
	
	
	//Difference between super and this keyword
	//Super - super keyword is used to call the methods, variables and constructors of parent class
	//this - this keyword is used to call the methods, variables and constructors of it's own class 

}
