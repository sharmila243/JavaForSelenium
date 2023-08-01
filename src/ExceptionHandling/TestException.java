package ExceptionHandling;

//import java.io.FileInputStream;

public class TestException {

	public static void main(String[] args) {

		
		int i[] = new int[2];
		i[2] = 10; //ArrayIndexOutOfboundException - Runtime Exception - Unchecked Exception
		
		
		
		//Uncomment and see 
//		FileInputStream ip = new FileInputStream(" ");
			//compiler is immediately giving the exception - unhandled exception
			//Compile time / Checked exception
		
		
		//Uncomment and see
//		Thread.sleep(2000); //Interrupted Exception - Checked exception
		
		
		
	}

}
