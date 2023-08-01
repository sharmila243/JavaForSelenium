package OOPS_AbstractClass;

public class LoginPage extends Page{ //LoginPage is the child class of Page class
	//Why error because, we have abstract methods in the Page Abstract class
	//So we have to override those methods
	//It's child class responsibility to implement those abstract methods 
	
	//Page cannot decide if it is going to be LoginPage title/ homePage title and the url, so let the page decide
	//Every page class should have url and the title,
		//the moment we try to be child of the page class we have to implement those methods
	
	//Constructor
	public LoginPage() {
		System.out.println("LP -- Default constructor");
	}
	
	//can we overload the constructor? YES
	public LoginPage(int a) {
		System.out.println("LP -- 1 Parameterized constructor: " + a);
	}
	
	
//	int min_time = 3;

	
	
	
	@Override
	public void title() {
		System.out.println("LP -- title");
	}

	@Override
	public void url() {
		System.out.println("LP -- url");
	}  
	
	//Can I override non-abstract methods?
	@Override
	public void defaultTimeOut() {
		System.out.println("Page -- TimeOut -- 5 Sec");
	}
	
	//Own individual method
	public void doLogin() {
		System.out.println("LP -- Logged in to app");
	}

}
