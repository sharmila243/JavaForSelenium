package OOPSConcept_3;

public class Browser {
	
	public void b1() {
		System.out.println("b1 Method");
		b2();
	}
	
	public void b2() {
		System.out.println("b2 Method");
		
		//Can I call m1() method from Employee class here?
		//YES
		//how?
		//Since it is a non-static method, create an object
		
		Employee emp = new Employee(); //all the non-static methods of employee class is available here
		emp.m1();
		
		//Can I call t1() static method from Employee class?
		//YES
		//how?
		//Using class name, since we are going to call static method
		
		Employee.t1(); 
		
	}
	
	public static void p1() {
		System.out.println("p1 Method");
	}
	

	public static void main(String[] args) {

		Browser browser = new Browser();
		
		browser.b1();
		
	}

}
