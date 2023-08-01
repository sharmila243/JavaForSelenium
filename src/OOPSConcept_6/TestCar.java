 package OOPSConcept_6;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		
		b.start(); //Overridden - Priority is given to the child class start method
		b.stop(); //Inherited
		b.refuel(); //Inherited
		b.autoParking(); //Individual
		b.engine();//Inherited from GP - Vehicle		
		b.supplyChainOfVehicles();//Inherited from GGP - Automobile
		b.automobiles();//Inherited from GGGP - Engineering 
		b.engineering();//Inherited from GGGGP - Physics
		
		//Static methods
		BMW.billing();	//Let's say BMW billing method is commented and we still try BMW.billing 
						//since BMW class is Child of Car Class, it inherits parent class's billing method 
						//BMW.billing --> car -- Billing
						//If BMW has it's own billing method, BMW.billing --> BMW -- billing
		Car.billing();
		
		//private methods
		b.BMWTest();
		b.carTest();
		
		//Final method declared in parent class, Can we inherit it??
		b.power();
		
		System.out.println("*****Siblings methods*****");
		
		//Siblings - Audi methods - I cannot access these Audi class methods with BMW object
		Audi au = new Audi();
		au.start();
		au.stop();
		au.refuel();
		au.threadSafety();
		Audi.billing();
		au.carTest();
		au.power();
		au.engine();
		au.supplyChainOfVehicles();
		au.automobiles();
		au.engineering();
		Audi.ABS();
		
		System.out.println("*****Parent class Object*****");
		
		Car c = new Car();
		
		c.start(); 
		c.stop();
		c.refuel();
		c.engine();
		c.supplyChainOfVehicles();
		c.automobiles();
		c.engineering();
		c.power();
		
		
//		c.autoParking();//Error - Parent class do not inherit any properties from child class
								//autoParking is BMW's individual method 
		
		System.out.println("*****TOP CASTING*****");
		
		//Top-Casting 
		//Child class object is referred by parent class reference variable - Is this possible? YES, Top Casting
		Car c1 = new BMW(); //All BMW's are CARS
		
		//JUST THE COMMON METHODS BETWEEN PARENT AND CHILD ARE ONLY ACCESSIBLE
		c1.start(); //Inherited- BMW start method, why not Car start? - 
						/*(Object created is of child class and 
					 		* has all the methods of BMW class and car class 
					 		* & is referred by parent class reference variable, 
					 		* if there is an overridden method and we call that method, 
					 		* preference is given to the child class method)*/
		c1.stop(); 
		c1.refuel();
		c1.engine();
		c1.supplyChainOfVehicles();
		c1.automobiles();
		c1.engineering();
		c1.power();
//		c1.autoParking(); //FAILs THE "REFERENCE TYPE CHECK"
		//is not accessible, since it is individual method does not has any connection with Car	
		
	
		
		System.out.println("*****DOWN CASTING*****");
		
		//Is Down Casting possible?
		//parent class object referred by child class reference variable
//		BMW b1 = (BMW) new Car(); //ALL CARS are not BMW
									//Forcefully Car converted to BMW will not be the same as BMW 
									//Nano --> BMW != BMW
		//Down casting is allowed at compile time but not at runtime
		//Gives error during Run-time - CLASS CAST EXCEPTION
		//And so called as Run-time Polymorphism
//		b1.autoParking(); 
/*		b1.start();
		b1.stop();
		b1.refuel();
		b1.autoParking();
*/		
		System.out.println("*****TOP CASTING with GP*****");
		//Child class object referred by GP reference variable 
		Vehicle v = new BMW();
		v.engine(); 
		//Vehicle class is inherited in BMW Class, and engine method is vehicle class method, as they are connected reference type check is passed
		
		//I cannot access v.start(), v.stop(), v.refuel() as these are Car class (Child class of Vehicle) methods
				//As parent, Vehicle cannot inherit properties of child class, Car
				//Reference type check is FAILED
		
		System.out.println("*****DOWN CASTING with GP*****");
//		BMW b2 = (BMW) new Vehicle(); //CCE
//		b2.start();
		
		System.out.println("*****TOP CASTING with GGP*****");
		Automobile a = new BMW();
		a.automobiles(); //Engineering.java
		a.engineering(); //Physics.java
		a.supplyChainOfVehicles(); //Automobile.java
		
		
		//Limitations of Top Casting 
		//We cannot access the individual methods of child class 
		//c1.autoParking(); - FAILS REFERENCE TYPE CHECK
		
		

		
		
		
	}

}
