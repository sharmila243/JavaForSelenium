package ExceptionHandling;

public class ThrowsKeyword {
	
	//Throws keyword does not handle exception
	//Only try catch handle the exception
	
	//Throws keyword supply the exception from one method to another method 
	
	public void m1() //throws ArithmeticException {
		{
		System.out.println("m1");
		m2();
	}
	
	public void m2() //throws ArithmeticException {
	{
		System.out.println("m2");
		
		try {
			m3();
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		}
	}
	
	public void m3() throws ArithmeticException{ //m3 says I'm throwing the exception
									//throws keyword is used after the method name 
									//m3 method is giving you the exception but throwing it not handling it
									//Now who will hold the exception? m2, because m3 is called internally inside m2
									//because of m2 method, m3 is getting called
		System.out.println("m3");
		
			int i = 9/0;
			System.out.println(i);
	}
	

	public static void main(String[] args) { 
				//main throws ArithmeticException
				//line says - JVM has to handle it 
				//Is it really handling? NO, if JVM handles the exception BYEEEE would have been printed
				//It is proved that throws keyword does not handle the exception but simply supply the exception
					//from one method to another
		
		
		ThrowsKeyword th = new ThrowsKeyword();
		
		//Let's say main method takes the responsibility and handle the exception
		
		th.m1();  //m1 --> m2 --> m3 -- exception found //approach/ data structure - stack - LIFO, 
						//that is why StachTraceInformation, e.printStackTrace();
		
		
		
		System.out.println("BYEEEEEEEEE");
		
		//Main method is caller method
		
			//Let,
			//m1 - login
			//m2 - search 
			//m3 - payment payment
			//if payment method is giving us the exception throws to search method and search throws to Login
				//Which is called by the main method, which is called by the user
			//Do we really need user to handle the exception??	
			//Why should user handle the exception??
			//It is not a good practice 
			//exception has to be handled within the methods, not by the main method
			
			//Can we handle the exception with try catch block inside main method?? 
			//Literally YES we can write the code but it is not a good practice
			//we should never do that
		
		
		//So m2 should handle it, if m3 is throwing it
		//But is it the right way?? 
		
		
		
		//use case:
		//User is trying to do payment is an application, let's say AXIS, ICICI
		//We don't have control over AXIS or ICICI bank server code - they are of 3rd party for me
		//If there is any issue, like server is down or Account not found, no balance, wrong otp entered etc as such
			//bank will give us the exception 
			//It is amazon application responsibility to handle the exception with try catch block
			//Amazon application has to handle the exception and should say/ print on the webPage to the user that
				//wait for 30min
				//try again later
				//wrong otp entered 
				//server is down
		//relate to above:
		//m3 - bank server
		//m2 - application ( if we are developer at m2, can we update the code at m3?? ) 
					//m2, m3 --> they are 2 different systems 
					//java provides the facility, if we are calling the method from 3rd party server OR 3rd party method/API
						//if that method is throwing the exception, since we don't have control over them 
						//we can handle it 
					//Ideally it has to be handled by m3, bank server but what if we cannot handle over there 
						//we have to do it in m2 and tell the user that exception is coming, try again after some time
			
		
		
		
		
	}

}
