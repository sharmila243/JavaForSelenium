package OOPSConcept_4;

public class Customer {
	
	String name;
	int customerId;
	String city;
	long phoneNumber;
	
	
	
	//Initialize the objects and passing the values to the class variables 
	
	public Customer(String name, int customerId, String city, long phoneNumber) {
		this.name = name;
		this.customerId = customerId;
		this.city = city;
		this.phoneNumber = phoneNumber;
		
		//we cannot return anything even if we write any business logic here
	}
	
	
	//Business logic, feature logic, implementation logic - should be written inside method
	
	public int getSalary(int totalCTC, int bonus) {
		return totalCTC+bonus;
	}
	
	

}
