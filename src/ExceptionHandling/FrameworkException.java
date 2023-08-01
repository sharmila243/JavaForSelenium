package ExceptionHandling;

public class FrameworkException extends RuntimeException { //GlobalException - whatever name 
		
	//extends RuntimeException
	//Runtime Exception is comming from Java 
	//Runtime exception is class, so we're extending it
	
	//we'll just create the constructor of FrameworkException
	
	private static final long serialVersionUID = 1L;

	public FrameworkException(String msg) { //give me the message what you really want to supply to us 
		//message like (default)
			//divide by zero - AE
			//null cannot be resolved to a type - NPE
		//so every exception we have a message
		
		//we're saying throw the FrameworkException with particular message 
		
		super(msg);//to call the constructor of the parent class typically constrictor of Runtime Exception
		
	}
	
	
	

}
