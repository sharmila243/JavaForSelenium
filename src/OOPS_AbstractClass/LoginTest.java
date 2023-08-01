package OOPS_AbstractClass;

public class LoginTest {

	public static void main(String[] args) {
		
		
//		LoginPage lp = new LoginPage();
		LoginPage lp = new LoginPage(10); //LP L18 --> P L13 --> P L18 --> LP L19
		
		lp.title();
		lp.url();
		lp.displayLogo();
		lp.defaultTimeOut(); //Overridden, preference is given to the child class overridden method - RunTime P
		lp.doLogin();
		Page.displayFooters();//static method
		
		System.out.println("minimum time: " + lp.loading_time); //inherited from parent class - can be accessed with child class object ref variable
		lp.loading_time = 3; //min_time declared in parent class is not static not final so can be manipulated/ Inherited
		System.out.println(lp.loading_time); //
		
		System.out.println("*****TOP CASTING*****");
		
		Page p = new LoginPage();
		p.title();
		p.url();
		p.defaultTimeOut(); //Preference to Child class method since the object is of child classes object
		p.displayLogo();
		Page.displayFooters();
		
		
		System.out.println("*****DOWN CASTING*****"); //NA
//		LoginPage lp1 = new Page(); //Cannot create the object of abstract class so DOWN CASTING is not possible
		
		
	}

}
