package OOPSConcept_4;

public class Person {

	
	String name;
	static String clgName; //Initializing here is different
	//abcd
	
	public Person(String name,  String clgName) {
		this.name = name;
		
//		this.clgName = clgName;// warning to access static variable in a static way
	}
	
	public Person(String name, int fee) {
		this.name = name;
		//what are we going to do with fee? it is not initialized anywhere
		//So it is not a better practice to initialize random values 
		
		//We always supply non-static class variables declared in the class in a constructor - that's all	
	} 
	
	
	
	
	
	
	
	
	
}
