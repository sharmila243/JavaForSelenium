package OOPSConcept_2;

public class B {

	public static void main(String[] args) {
		
		System.out.println("B - main method");
		
		//can we call A Class? 
		//Static methods are called using Class name 
		
		
		//what happens, Calling B class in A && A class in B?
		//Answer
		//this creates an infinite calling and we get STACKOVERFLOW Error
		//A is calling B 
		//B is calling A 
		//After infinite calling, it terminates at a point as there'll not be any space left in the Stack Memory
		
//		A.main(args);
		
	}

}
