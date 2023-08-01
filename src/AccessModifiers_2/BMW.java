package AccessModifiers_2;

import AccessModifiers_1.Car;

public class BMW extends Car{

	public static void main(String[] args) {
		
		//different package, sub-class
		BMW b = new BMW();
		
		System.out.println(b.name); //public 
		System.out.println(b.price); //protected
		
		
		//default and private - not accessible
	
		
	}

}
