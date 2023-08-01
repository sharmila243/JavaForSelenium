package OOPSConcept_2;

public class Car { //Static & non-static methods _ 2 --> MainMethodConcept.java 
	
	String carName;
	String engineNumber;
	String chasisNumber;
	double price;
	final static int wheels = 4; //since it's common in all the objects created we can declare it static 
	
	//Utils/Generic functions
	public static void displayLogo() { // Logo will be same for all the pages in amazon
		
	}
	
	public void getURL() {
		
	}
	
	//Examples: Static methods:
	//1. for amazon - Logo in all the pages will be same/common
	//2. footer of amazon page will be common in all the pages 
	//3. Search engine is available/ common in all the pages 
	
	

	public static void main(String[] args) {
		
//		static int i = 10; //local variable -- cannot be static but can be final
		final int i = 10;
		System.out.println(i);
		
		Car c1 = new Car();
		c1.carName = "Lamborghini";
		c1.chasisNumber = "AEBNWB121212";
//		c1.wheels = 4;
		
		Car c2 = new Car();
		c2.carName = "Audi";
		c2.chasisNumber = "AUDIUNKH1112";
//		c2.wheels = 4;

		Car c3 = new Car();
		c3.carName = "BMW";
		c3.chasisNumber = "BMWAJVT22345";
// 		c3.wheels = 4;
		
//		Car.wheels = 5; //Error --> no manipulation can be done now as it is declared final in class variables
		
		System.out.println(c3.carName +" "+ c3.engineNumber +" "+ c3.chasisNumber +" "+ Car.wheels);
		
		
		
		
		//All the static variables and methods are stored in METASPACE
		//Common Memory Allocation CMA/ Permanent Generation/ METASPACE 
		//Permanent Generation - Up to 1.7 JDK - Static memory
		//METASPACE - 1.8 JDk - Dynamic Memory
		
		
		}

}
