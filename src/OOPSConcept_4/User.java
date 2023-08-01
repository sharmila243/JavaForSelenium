package OOPSConcept_4;

public class User {
	
	//PURPOSE:
	//Always helping me to create the object of the respective class
	//Constructor is helping me to avoid creating unnecessary object creation 
			//for eg. Amazon website, without knowing any detail of the user, if I could create the account 
			//that will lead to creation of unnecessary fake accounts
	//Constructor also helping me to initialize class variables using THIS keyword
	
	//PO - Business Requirement - Acceptance criteria
	//Create the User - constructor - based on the requirement
	//1. name, age
	//2. name, ag, city etc etc
	
	
	String name;
	int age;
	String city;
	double salary;
	char gender; 
	boolean isActive;
	
//	public User() { //Scenario: I have only this Constructor
		//I can create multiple objects, every time I run the program default constructor will be called
		//what if I don't define a default constructor?
//	}
	
	//what is user Says give me the user's name and age
	public User(String name, int age) {
		this.name = name;
		this.age = age;
		
		//this.class variable = Local variable
	}
		
	
	public User(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	
    }
	
	
	public User(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	public User(String name, String city, boolean isActive) {
		this.name = name;
		this.city = city;
		this.isActive = isActive;
	}


	public User(String name, int age, String city, double salary, char gender, boolean isActive) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.salary = salary;
		this.gender = gender;
		this.isActive = isActive;
	}


	public static void main(String[] args) {

//		User u1 = new User(); - it should give the error
		//Since I don't have default constructor defined,
					//Java is not allowing me to create an Object with empty arguments - restricting the unnecessary object creation
		
		//We have given restriction - only one constructor is allowed so far
			//only if the user has name and age, then only we can create an object and call the constructor
		
		User u1 = new User("Tom", 30);
		System.out.println(u1.name +" "+ u1.age	);
		
		User u2 = new User("Linda", 34, "LA");
		System.out.println(u2.name +" "+ u2.age +" "+ u2.city);
		
		//whatever is required, we supply it in the constructor and constructor will help me to initialize the value
		User u3 = new User("Sai", 26, "Mtl", 13.66, 'M', true);
		System.out.println(u3.name +" "+ u3.salary +" "+ u3.isActive);
		
//		Testing t1 = new Testing(); - Error because of private Constructor creation
		
		//can we create Employee class constructor
		Employee_1 emp = new Employee_1();
		System.out.println(emp.name);
		
		//How to call Testing class methods
		Testing.getApp();
		Testing.getAppNumber();
		Testing.getBrowserVersion();

//		Testing.main(args); //???
		
	}

}
