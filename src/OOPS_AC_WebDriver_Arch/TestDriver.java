package OOPS_AC_WebDriver_Arch;

public class TestDriver {

	public static void main(String[] args) {
		
//		ChromeDriver driver = new ChromeDriver();//constructor will be called in chromeDriver class
//		FirefoxDriver driver = new FirefoxDriver();
//		SafariDriver driver = new SafariDriver();
		
		//Instead of creating another object for firefox 
		//and another object for safari
		//we can comment and uncomment suing the same object reference variable name
			//we can avoid creating too many objects 
		
		//Instead of the above case, we can initialize browserName and webDriver 
			//using switch case, we can perform the same - Top casting
		
		String browserName = "safari";
		WebDriver driver = null;
		
		switch (browserName.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver(); //TopCasting will also help to achieve the parallel execution
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			break;
		
		case "safari":
			driver = new SafariDriver();
			break;


		default:
			System.out.println("Please pass the right browser: " + browserName); //NullPointerException
			break;
		}
		
		driver.findElement("emailID");
		driver.sendkeys();
		driver.click();
		driver.quit();
		
		//100% Abstraction - Above code 
		
		//Limitation of the above code:
		//1. cannot call the individual methods of child classes 
		//2. parallel execution is not possible - parallel execution is possible by creating threads and all 
				//RightNow in the above code it is not possible
		
		
		
	}

}
