package JavaBasics;

public class FinalKeyword {

	public static void main(String[] args) {
		
		int a = 10; 
		a = 40; 
		a = 30; 
		System.out.println(a);
		
		final int days = 7;
		//days = 10; // trying to manipulate so in order to prevent it, declare final
		int totalAmount = 100 * days; 
		System.out.println(totalAmount);
		
		final String title = "Login Page"; 
		System.out.println(title);
		
		final double basePrice = 11.11; 
		System.out.println(basePrice);
		
		//gender, RBI Interest rate, Designation
			
	}

}
