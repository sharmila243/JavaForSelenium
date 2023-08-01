package OOPSConcept_1;

public class Customer { //MethodsInJava_1 --> EmployeeTest.java
	
	//Data members of the class 
	//1. Class Variables 
	//2. Methods/Functions in class - are used for Business logic/ Implementation of specific feature
	
	//1.
	String name; 
	int age;
	
	//all the methods created are non-static in nature
	//methods cannot hold static methods
	
	//Cannot create a method inside a method 
	//But can call a method from another method
	//methods are independent OR parallel to each other
	
	//Types of methods --> 3
	
	//1. No o/p , No i/p
	//does not return anything
	public void test() {
		System.out.println("test method");
		int i = 10;
		System.out.println(i);
	}
	
	//2. Some o/p , No i/p
	public int sum() {
		System.out.println("Sum method");
		int a = 10; 
		int b = 20; 
		int c = a+b;
		
		return c; //Since it is returning c (an integer), change public void --> public int
	}
	
	public String getMyName() {
		System.out.println("getMyName method");
		String name = "Sharmila"; 
//		int a = 100; //if i want to return a, it has to be public int not public String
		
		return name;
//		return a; //I cannot return 2 values
	}
	
	public int getNumber() {
		System.out.println("getNumber method");
		
		return 100;
	}
	
	//3. Some i/p , Some o/p
	//pass the i/p parameters x, y 
	public double div(int x, int y) {
		System.out.println("Division method");
		double z = x/y; 
		
		return z;
	}
	
	public int multiply(int a, int b) {
		System.out.println("multiple method");
		int mul = a*b;
		
		return mul;
	}
	
	public int getBillAmount(int baseFare, int cgst, int sgst) {
		System.out.println("Calculation bill amount");
		int finalAmount = baseFare + cgst + sgst;
		
		return finalAmount;
	}
	
	//void, return
	public void getURL() {
		System.out.println("get URL method");
		
		return;//blank return/no return --> void
	}

	public static void main(String[] args) {
		
		Customer c1 = new Customer(); 
		
		//accessing global variables
		c1.name = "Bhargav"; 
		c1.age = 26; 
		System.out.println(c1.name +" "+ c1.age);
		
		//1. accessing methods
		c1.test(); //--> test() method --> print the statement --> print i
						//I can call a method n no.of times
		//System.out.println(test()); //compilation problem
		
		//2.
		//a. can we write c1.sum() in the print statement?
		System.out.println(c1.sum()); //Yes, but if want to add some thing to it, I cannot do anything 
		//for example, c is the final marks of a student and I want to give extra marks for handwriting, 
					//I cannot do this in the current print statement
		
		//b.
		int i = c1.sum(); //--> since it returns a value, declare it to some int variable and print it
		System.out.println(i+5-10); //I can add or subtract anything here now
		
		//c. 
		String s = c1.getMyName();
		System.out.println(s + " w/o Bhargav"); 
		if(s.equals("Sharmila")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		System.out.println(c1.getNumber()+5); //If i want to add 10 again, I need to call the method again 
		System.out.println(c1.getNumber()+10);
		int ll = c1.getNumber(); 
		System.out.println(ll+5+9-10); //I can manipulate it now as I need
		
		
		//3.
		double d = c1.div(30, 7); //x, y values should be passed here 
											//(30, 7) --> i/p arguments
		System.out.println(d);
		
		double d1 = c1.div(48, 6); 
		System.out.println(d1);
		
		int mul = c1.multiply(12, 9);
		System.out.println(mul);
		
		int bill = c1.getBillAmount(450, 25, 25);
		System.out.println(bill);
		
		//
		c1.getURL();
		
		}

}
