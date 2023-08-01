package AccessModifiers_2;

import AccessModifiers_1.Car;

public class Bike{

	public static void main(String[] args) {
		
		//different package, non sub-class
		Car c = new Car();
		
		System.out.println(c.name);
		
		//protected, default, private - not accessible
		 
		
		
	}

}
