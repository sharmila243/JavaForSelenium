package OOPSConcept_4;

public class LoginPageTest {

	public static void main(String[] args) { //Runner/Caller class
		
		LoginPage lp = new LoginPage("sai@gmail.com", "Sai@123");
		lp.doLogin();
		
		LoginPage lp1 = new LoginPage("bhargav@gmail.com", "Bhargav@123");
		lp1.doLogin();
		
		//if we have multiple Users, create multiple objects
				//I need not change a single thing in LoginPage.java
		

	}

}
