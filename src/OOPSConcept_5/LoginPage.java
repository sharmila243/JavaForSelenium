package OOPSConcept_5;

public class LoginPage {
	
	//Don't you think it should be privately defined?? - username & pwd will be different from one another
		//and should be privately defined for security purposes
	private String username;
	private String pwd;
	
	
	
	
	public void setUsername(String username) { //Can we set the value without setter? NO
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void doLogin() {
		System.out.println("Logged in with:" + username +" : "+ pwd);
	}
	
	

}
