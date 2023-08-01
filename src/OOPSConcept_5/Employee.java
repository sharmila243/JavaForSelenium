package OOPSConcept_5;

public class Employee {
	
	/* Let's say there's a class with public methods and private variables/methods 
	 		As a User I cannot have access to to private variables and methods
	 		but I can access public methods as they are publicly available 
	 		
	 		Can they both public and private methods have access to each other, as they are in the same class
	 		YES 
	 		As we have access to public methods
	 		we can indirectly gain the access to the private methods 
	 		
	 		We cannot maintain all the methods publicly might be because of the security purposes 
	 		But we can gain the access indirectly where public methods can internally call private methods/variables
	 		
	 		public methods call the --> private variables/methods 
	 		User can call -->public methods, indirectly we have access to private variables/methods 
	 		
	 		eg. Encapsulation - Laptop, ATM
	 */
	
	private String name;
	private int age;
	private double salary;
	
	private int amount; //If this is not initialized private there might be 
							//loop hole that every person can add any amount they need 
	
	//getter and setter - public always
	//is it mandatory to create getter and setter? NO
	//check private int variable amount
	
	private void calculateShareAmount(int fee) { //This can be private/public - 
												//If I don't want to give access to this method to everyone
												//I can define it privately, 
												//Share amount might differ from person to person
		int i = 10;
//		int fee = 20;
		amount = i + fee; // this is assigned to the global variable
	}
	
	public int getAmount(int fee) {
		calculateShareAmount(fee); //I'm calling it internally
		return amount;
	}

	//set the name and get the name
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	

}
