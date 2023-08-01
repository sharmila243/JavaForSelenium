package OOPSConcept_1;

public class Employee { //Class&Objects_1 --> Student.java
	
	//Class variables/ Global variables
	String name; 
	int age; 
	String city; 
	double salary;

	public static void main(String[] args) {
		
		//Class - is an entity where we define properties in the form of 
						//methods & variables (M & V are characteristics of class)
				//OR group of objects that have common properties
				//OR Template/Blue print which object's are created
		//Object - is an instance of a class 
		
		//Object is created with new keyword
		
		Employee obj = new Employee();
		//Employee - class name 
		//obj - Object reference variable 
		//new Employee() - Object
		
		System.out.println(obj.name); //since we have not declared anything - 
											//default values will be printed on the console
													//Default value of String ---> null
		System.out.println(obj.age); //0
		System.out.println(obj.city); //null
		System.out.println(obj.salary); //0.0
		
		obj.name = "Sharmila"; 
		obj.age = 25; 
		obj.city = "Hyderabad"; 
		obj.salary = 12.33;
		
		System.out.println(obj.name +" "+ obj.age +" "+ obj.city +" "+ obj.salary);
		
		//we can create multiple objects with different object reference variable names
		//whenever an object is created a copy of all the class variables is given to the object
				//so that it can have it's own values
		
		Employee obj1 = new Employee();
		obj1.name = "Bhargav"; 
		obj1.age = 26; 
		obj1.city = "Mtl"; 
		obj1.salary = 13.65; 
		
		System.out.println(obj1.name +" "+ obj1.age +" "+ obj1.city +" "+ obj1.salary);
		
		//System.out.println(obj1); //wrong way of printing the object
		
		//
		new Employee(); //null reference object
		new Employee().name = "Veda"; //This is not a good practice
		
		//
		Employee obj2;
		obj2 = new Employee(); 
		obj2.name = "Surya";
		obj2.age = 29;
		obj2.city = "Hyderabad";
		obj2.salary = 12.77;
		
		System.out.println(obj2.name +" "+ obj2.age +" "+ obj2.city +" "+ obj2.salary);
		
		//
		Employee obj3 = new Employee();
		obj3 = null; 
		
//		obj3.name = "Dimple"; //after obj3 is declared null it gives NULL POINTER Exception
//		System.out.println(obj3.name);
		
		System.out.println(obj3);
		
	}

}
