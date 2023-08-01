package OOPSConcept_4;

public class Testing {
	
	//No one can create the object of this class - Outside of this class
	//how
	//Constructor with private keyword - no one can create the object of this class, outside of this class - User.java
	//then what is the significance of this getApp() method if we cannot create object, 
			//as it is non-static method, in order to call it, we need to create the object within or outside of the class
	
	//Then what type of method has to defined here when there is a private constructor? STATIC method
					//Which can be called using class name
	
	private Testing() { //within the class public, private does not matter
		System.out.println("Testing Constructor");
	}
	
// 	public void getApp() { //Method
//		System.out.println("get App");
//	}
	
	public static void getApp() {
		
	}
	
	public static void getAppNumber() {
		
	}
	
	public static void getBrowserVersion() {
		
	}
	
	
	
	
	public static void main(String[] args) {
		
//		Testing t1 = new Testing();
//		t1.getApp();
		
		//Which class is having private Constructor in JAVA
		//System Class - Everything in system class is static in nature
		
//		System sys = new System(); // Error
		System.gc();
		
		
		
	}


}
