package OOPSConcept_3;

public class Employee { //MethodCallingConcept_1
	
	//Non-static Methods
	public void m1() {
		System.out.println("m1 Method");
		
		//Can we call m2() method inside m1() method? If yes, DO we need to create the object?
		//YES - both are non-static methods and can be called directly
		
		//As soon as we create an object, all the copy of non-static methods are given to the object
		//and can be called each other directly without creating an object once again here in the m1() method
		
		//But to call m1() method we need to create an object in the main method
		
		m2();
	}
	
	public void m2() {
		System.out.println("m2 Method");
		m3();
	}
	
	public void m3() {
		System.out.println("m3 Method");
	}
	
	//Static Methods
	public static void t1() {
		System.out.println("t1 Method");
		
		//Can I call t2() static method inside t1()? 
		//Yes, 
		//Since it is a static method we do not need any object creation
		//Best practice is to call by using CLASS NAME
		
		Employee.t2(); 
	}

	public static void t2() {
		System.out.println("t2 Method");
		Employee.t3();
	}

	public static void t3() {
		System.out.println("t3 Method");
		
		//Can I call non-static m1() method from static t3() method? 
		//YES
		//how?
		//we have to create a new object (replica of e1 object ref variable) and 
							//call by using the newly created Object ref Variable
		Employee e2 = new Employee(); //Again all the copy of non-static methods are given to e2
		e2.m1();
		
		}


	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.m1(); //Calling a non-static/ Instance method
		
		Employee.t1(); //Calling a Static method
		
		System.out.println("*****");
		
		//Can we call b2() method from Browser class here?
		//YES
		//Since it is non-static method
		Browser browser = new Browser();
		browser.b2();
		
		//can we call p1() Static method from Browser Class?
		//Yes
		//Since it is static method, using class name
		Browser.p1();
		
	}
	
		//Issue with the above CODE
		//In t3() method, every time we call t3() method, for example we have 100 test cases
			//for every case t3() is login or search method in framework
			//if we call it 100 times, 100 times the object will be created
	
		//To overcome this CALL BY REFERENCE has come into picture
	
		//In order to call m1() from t3(), One thing we need is reference (e2)
		//Why don't we use the reference which is already available (e1) and call the method m1() - to avoid memory leakage
		//That is why it is called CALL BY REFERENCE - Calling the method by passing the reference
}
