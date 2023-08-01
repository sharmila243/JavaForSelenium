package ExceptionHandling;

public class Browser {

	public static void main(String[] args) {

		
		String name = "edge";
		
		
		//If we're assigning chrome to string - fine
		//If we're assigning some other browser like edge - It becomes bug because, 
						//browser not found and 
						//enters the URL as well
		if(name.equals("chrome")) {
			System.out.println("Launch chrome");
		}
		else {
			System.out.println("Browser not found");
		}
		
		System.out.println("Enter the url");
		
		System.out.println("-------");
		//How to handle such scenarios - L12
		//Here custom exception has been threw and see we cannot enter the URL now with edge as the i/p
		
		if(name.equals("chrome")) {
			System.out.println("Launch chrome");
		}
		else {
			System.out.println("Browser not found");
			throw new FrameworkException("BroswerNotFoundException");//we can create our own common exception class
				//we use this custom exception in NEGATIVE Conditions like
				//else, default in switch case, data == null
		}
		System.out.println("Enter the url");
		
		
		
		
		
		
		
	}

}
