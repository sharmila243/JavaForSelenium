package OOPSConcept_5;

public class LoginPageTest {

	public static void main(String[] args) {
		
		//User1
		LoginPage lp = new LoginPage();
		lp.setUsername("admin@gmail.com");
		lp.setPwd("admin@123");
		
		lp.doLogin();
		
		//User2
		LoginPage lp1 = new LoginPage();
		lp1.doLogin();//since we did not set anything it take default values 
		
		lp1.setUsername("cust@gmail.com");
		lp1.setPwd("cust@123");
		
		lp1.doLogin();
		
		
		
		
		
		
	}

}
