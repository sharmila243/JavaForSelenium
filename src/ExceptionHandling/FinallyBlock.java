package ExceptionHandling;

public class FinallyBlock {
	
	//Exception is coming or not, Finally is executed - Irrespective of exception
	//Finally block is always written with try catch block

	public static void main(String[] args) {
		
		//1.
		System.out.println("hello");
		
		try {
			int i = 9/0;
			System.out.println(i);
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace(); 
		}
		
		finally {
			System.out.println("Finally -- BYEE");
		}
		System.out.println("--------");
		
		//2.
		try {
			int i = 9/3;
			System.out.println(i);
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace(); 
		}
		
		finally {
			System.out.println("Finally -- BYEE");
		}
		System.out.println("--------");
		
		//3. 
		//Is it true try can be used without catch with finally?? YES
		//Exception is coming but it is not handled, but finally block is executed
			//1. try block without catch with finally - possible
			//2. Catch block without try and with finally - NO
			//3. Only finally without try catch block - syntax error
			//4. finally inside finally - possible 
			//5. finally inside catch block - syntax error 
		try {
			int i = 9/0;
			System.out.println(i);
		}
//		catch(ArithmeticException e) {
//			System.out.println("AE is coming");
//			e.printStackTrace(); 
//		}
//		
		finally {
			System.out.println("Finally -- BYEE");
		}
		System.out.println("--------");
				
	}

}
