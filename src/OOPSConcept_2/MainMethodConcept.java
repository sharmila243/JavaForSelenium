package OOPSConcept_2;

public class MainMethodConcept { ////Static & non-static methods _ 3 --> A.java & B.java

	
	//JVM always checks for PSVM - String[] - Array parameter
	public static void main(String[] args) { //Static methods are part of class 
					//Main method is always stored in METASPACE
					//Why main method is static?
					//JVM calls the main method
		
			//If let's say main method is non-static, how to call it?
			//JVM has to create an object and then call the main method 
			//Which is unnecessary, objects has to be created by us but not by JAVA
			//so main method is maintained static in nature by JAVA by default
		
			//Why main method is void? - It never return anything
			//We don't write business logic in main method
			//what we do is we create an object and call the methods
			//It is used for calling the methods and never returns anything
		
			//Can main method overloaded?
			//YES, see below
			
		System.out.println("Main method");
		
		MainMethodConcept.main(10);
		MainMethodConcept.main(26, "Sharmila");
		
	}
	
	//Including main method: static main method is now overloaded
	//Can static methods overload? - Yes
	//Do we use overloaded main method practically? - NO
	
	public static void main(int a) {
		System.out.println("hiii");
		System.out.println(a);
	}
	
	public static void main(int a, String b) {
		System.out.println("bye");
		System.out.println(a +" "+ b);
	}
		
}
