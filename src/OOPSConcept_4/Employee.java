package OOPSConcept_4;

public class Employee { //Constructor

	String name;
	int age;
	String city;
	
	
	public static void main(String[] args) {
	
		Employee e1 = new Employee();
		e1.name = "Sharmila";
		e1.age = 26;
		e1.city = "Hyderabad";
		
		Employee e2 = new Employee();
		e2.name = "Bhargav";
		e2.age = 26;
		e2.city = "Montreal";
		
		Employee e3 = new Employee();
		e3.name = "DimSu";
		e3.age = 29;
		e3.city = "Khammam";
		
		//Issue in writing this code is
		//1.
		//it is quite lengthy
		//If I have 100 Employees, I need to create 100 Objects(which is not actually the issue)
						//Issue - we need to write e1.name, e1.age, e1.city then e2, then e3 Same 100 times
		
		//2. 
		//Issue
		//Anyone can create the object of this class - Why are you allowing to create these objects?
		Employee e4 = new Employee(); //object created inside heap memory but does not assign any value
		Employee e5 = new Employee();
		Employee e6 = new Employee();
		
		System.out.println(e4.name);
		System.out.println(e5.age);
		System.out.println(e6.city);
		
		//Constructor - restrict the unnecessary object creation
		//Construct the object
		//Constructor help me in order to construct the object
		
		//NEXT
		//Employee_1 

	}

}
