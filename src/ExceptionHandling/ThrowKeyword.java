package ExceptionHandling;

public class ThrowKeyword {
	
	//Can create it's own exception
	//deliberately want to throw your own exception
	//Java cannot give us each and every exception, because we don't know what kind of data we are writing	
		//1. some excel data is not available, we really want to throw excelDataNotFound Exception
		//2. in our framework browser name is not available, then we say browserNotFound exception
	//Java cannot always gives us inbuilt exception, so we can generate our own exceptions
	

	public static void main(String[] args) {
		
		String browser = null; //we are reading the browser from excel file or xml file
		
		
		//writing if statement alone is not handling the exception, we are simply throwing the exception

//		if(browser == null) {
//			throw new Exception("NOBROWSEREXCEPTION");
//		}
		
		if(browser == null) {
			try {
			throw new Exception("NOBROWSEREXCEPTION"); //throwing my own custom exceptionx`
			}
			catch(Exception e) {
				System.out.println("browser not found. Pass the right browser");
				e.printStackTrace();
			}
		}
		
		System.out.println("BYEEE");
		
		
	}

}
