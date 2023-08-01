package OOPSConcept_4;

public class LoginPage { //whenever you try to create the object of the loginPage
			//please give me the username, pwd
			//we'll supply them to the respective username, pwd in your object
	
	String username;
	String pwd;

	
	public LoginPage(String username, String pwd) {
		this.username = username;
		this.pwd = pwd;
	}
	
	
	public void doLogin() {
		System.out.println("Login to APP");
		
		//LoginPageTest - L7 - Object is created and username, pwd is passed in the arguments 
		//doLogin and forgotPwd methods are non-static and also a copy of them is given to the object
		//doLogin method can now login with the username and pwd present in the same object, 
				//because they are part of the same object and can access the username and pwd
				//no need to create an extra object to access the username and pwd variables
		System.out.println("Entering username " + username);
		System.out.println("Entering pwd " + pwd);
		
		System.out.println("User is logged in");
		
	}
	
	public void forgotPwd() {
		System.out.println("Reset my Pwd");
	}
	
	

}
