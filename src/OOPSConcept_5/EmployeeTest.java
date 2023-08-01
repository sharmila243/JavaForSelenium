package OOPSConcept_5;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		
		e1.setName("Sharmila");
		e1.setAge(26);
		e1.setSalary(12.33);	
		
		System.out.println(e1.getName() +" "+ e1.getAge() +" "+ e1.getSalary());
		
		Employee e2 = new Employee();
		System.out.println(e2.getName() +" "+ e2.getAge() +" "+ e2.getSalary());
		
		//I cannot set the amount because the variable amount is initialized private 
			//but I can get the amount - we have a public method getAmount() which returns amount 
		//How to get the amount without setting it??
		//It is possible to have another method which might use amount variable - caluclateShareAmount() method
		System.out.println("e1 Amount: " + e1.getAmount(30));
		System.out.println("e2 Amount: " + e2.getAmount(100));

	}

}
