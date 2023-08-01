package OOPSConcept_7;

public interface USMedical extends WHO, UN{ //an interface can extend multiple interfaces
											//Single interface can be the child of multiple interfaces
											//FortisHospital must implement UN method also
	
	
	//No method body is allowed in Interface.
	//Only method declaration/ prototype
	//No business logic
	//abstract methods
	
	//ABSTRACTION - Hiding the implementation
	
	//It is by default abstract in nature, there is no need of mentioning it as abstract
	public abstract void physioServices(); 
	
	public void cardioServices();
	
	public void ENTServices();
	
	public void emergencyServices(); //common method
	
	
	
	//these method's are also possible. Implement it in FH and ApolloHospital
	//It is not mandatory that abstract methods are void and zero parameterized, it can also be as below
	
//	public void test(int a);
//	public String get(int a);
//	public String get(int a, int b); // abstract methods can be overloaded - Interfaces can be overloaded 
	
	
	//Variables - Static and final by default
	int min_fee = 10;
	
	
	//can we create static abstract methods? NO 
	//if we create static methods - we cannot override that method
	//But in an interface all the methods should be overridden
	
	
	//FROM JDK 1.8 - 2 important things got added
	//1. Can have static method with method body - ONLY STATIC 
	//these are not abstract methods. L38
	public static void USMedPharmacy() {
		System.out.println("US -- MedPharmacy");
	}
	//Can above method be overridden in FortisHospital, 
		//If we have the same method in child class, it is called MethodHididng but not overridden
	
	//2. Can have a default method(non-static) with method body
	//default methods are only and only possible for Interfaces
	default void billing() {
		System.out.println("US -- billing");
	}
	
	//The above 2 things are included in Java because 
	//people are claiming that Interface now cannot take any decision.
	
	
	//If we look at the interface
	//UPTO JDK 1.7 - 100% ABSTRACTION is possible - we always go with this
	//NOW with 1.8 - Partial ABSTRACTION


}
