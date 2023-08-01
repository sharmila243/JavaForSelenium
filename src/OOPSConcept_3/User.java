package OOPSConcept_3;

public class User {
	
	
	public void sendEmail() { //non-static
		 System.out.println("Sending Email");
	}
	
	public static void getEmail(User u) { //u = u1
		System.out.println("Getting Email");
		
		//In order to get Email, Send Email first
//		User u = new User();
//		u.sendEmail();
		
		u.sendEmail(); //Calling sendEmail method with the reference u
		
		User.readEmail(u); //Calling the static method also with the reference  u
		
		u.test(20); //calling non-static method from static method is done by the reference u
	}
	
	public static void readEmail(User u) {
		System.out.println("Reading Email");
		
		//to call sendEmail method (non-static)
		u.sendEmail();
	}
	
	public void test(int i) {
		System.out.println(i);
		
//		User.readEmail(null);// I don't have the reference. Pass the extra parameter (int i, User u) then call it
	}
	

	
	public static void main(String[] args) {
		
		User u1 = new User();
		
		//getEmail is Static method
		//Scope of u1 is limited to this main method only
		User.getEmail(u1); //passing the reference here - CALL BY REFERENCE
		
		u1.test(10); //Passing the value - CALL BY VALUE
		
		
	}

}
