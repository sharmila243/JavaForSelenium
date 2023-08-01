package ExceptionHandling;

public class Employee {
	
	String name;


	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		

		
		//try alone cannot be written
		//catch block is used for reporting purpose
		try {
			int i = 9/0; //Arithmetic exception
			System.out.println(i);
			System.out.println("Hello"); //If there is an exception found then this line of code will not be executed	
										 //so in framework if there's something important code written
										 //It is not suggestible to write any important code here, write outside catch block
		}
		catch(ArithmeticException e){ //(Exception name(if we know) e(some reference variable))
			System.out.println("AE is coming");
			e.printStackTrace(); //to print the details
		}
		
		
		//Instead of Arithmetic Exception if we NPE?
		//after line 45, it checks if there is any catch block with AE
			//we have catch block with NPE
			//catch block with NPE will be executed when NPE is found 
			//So this is not exception handling
//		try {
//			int i = 9/0;
//			System.out.println(i);
//			System.out.println("Hello");
//		}
//		catch(NullPointerException e) {
//			System.out.println("AE is coming");
//			e.printStackTrace();
//	 	}
				
		
		//If we don't know what exception is coming, we can write just Exception
				//EXCEPTION is the parent class of all the exception classes(CCE, AE, NPE etc)
		try {
			int i = 9/0;
			System.out.println(i);
			System.out.println("Hello");
		}
		catch(Exception e) {
			System.out.println("Some Exception is coming");
			e.printStackTrace();
		}
		
		
		
		//NULLPOINTEREXCEPTION
		try {
			Employee e = new Employee();
//			e = null;
			System.out.println(e.name);
		}
		catch(NullPointerException ex){
			System.out.println("NPE is coming");
			ex.printStackTrace();
		}
		
		
		//If there is a possibility of 2 exceptions
			//1st - NPE, checks for catch block with NPE, handled
			//It does not go to L81
			//here I can have another catch block with AE
			//One try with 2 catch blocks
			//OR
			//Instead of mentioning NPE or AE, mention Exception
		//comment and uncomment one exception after the other
		//Better to use two catch blocks
		try {
			Employee e = new Employee();
//			e = null;
			System.out.println(e.name);
			
			int i = 9/0;
			System.out.println(i);
			System.out.println("Hello");
		}
		catch(NullPointerException ex){
			System.out.println("NPE is coming");
			ex.printStackTrace();
		}
		catch(ArithmeticException ex) {
			System.out.println("AE is coming");
			ex.printStackTrace();
		}
		
		
		//If someone is reading this code, it is not readable, they don't know which exception is coming
			//we have written super class of exception
		//NOT A GOOD PRACTICE
		try {
			Employee e = new Employee();
//			e = null;
			System.out.println(e.name);
			
			int i = 9/0;
			System.out.println(i);
			System.out.println("Hello");
		}
		catch(Exception ex) {
			System.out.println("Some exception is coming");
			ex.printStackTrace();
		}
		
		
		//PARENT of EXCEPTION CLASS is THROWABLE CLASS  
			//Throwable is already present in java
			//Exception is handled with Throwable also
		
		try {
			Employee e = new Employee();
//			e = null;
			System.out.println(e.name);
			
			int i = 9/0;
			System.out.println(i);
			System.out.println("Hello");
		}
		catch(Throwable ex) {
			System.out.println("Some exception is coming");
			ex.printStackTrace();
		}
		
		
		//Parent of Throwable class is Object
			//But CATCH block is not designed for Object
		
		//*In catch block we can write throwable, exception or mention specific exception but not object
		
		//Error class is the child of throwable class, check by substituting throwable in the above code
				//to check if the exception is handled, NO, BYE statement is not printed 
		//Error - syntax error, StackOverFlow Error 
				//Error is more prone to system failures, memory issues which is more of a Hardware issue or environment issue
		
		
		//Exception - is because of code that we've written
		//Error - is because of the environment(infrastructure, RAM, Hardware issues)
		//m1() --> m2() --> m3() --> m1() - syntax wise it is okay but we get stackOverFlow error
		//In this Exception handling, Error is not the right word to use 
		//Is Exception word correct? Issue here is we have no idea which exception is coming and it is handled
		//Can this Exception word handles both simultaneously? No,Only one exception at a time
		//As soon as an exception is found it jumps to the catch block, it does go check the other lines of try block
		//I can have 2 catch blocks for one try block
		
		
		//Java supports both with the help of Throwable, we can have Error & Exception
		//try catch block is used for exception handling and error handling also
		
		//If the above exception is not handled properly then the below code will not be executed
			//It gets terminated
		System.out.println("Bye");
		
		
		
		
		//to which catch block it goes in this case, we deliberately mentioned AE so it goes to catch(AE e)
			//it immediately found the respective exception
		
//		try{
//			int i = 9/0;
//		}
//		catch(AE e) {
//			
//		}
//		catch(NPE e) {
//			
//		}
//		catch(Exception e) {
//			
//		}
		
		// catch(AE e) 
//		try{
//			int i = 9/0;
//		}
//		catch(AE e) {
//			
//		}
//		catch(NPE e) {
//			
//		}
//		catch(Throwable e) {
//			
//		}
		
		
		
		//last 2 catch blocks become dead code
//		try{
//			int i = 9/0;
//		}
//		catch(Throwable e) {
//			
//		}
//		catch(AE e) {
//			
//		}
//		catch(NPE e) {
//			
//		}
//		
		
			
	
		
	}

}
