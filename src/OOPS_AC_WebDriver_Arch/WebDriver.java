package OOPS_AC_WebDriver_Arch;

public interface WebDriver {
	
	//with the help of Automation tool
			//I really want to perform something on the browser .click() .sendkeys() .findTheElement() on the basis of X-path
			//actions like close the browser .close() .quit() etc on different browsers
		
		
		//can webDriver take a decision how exactly click method works?
		//click on chrome browser will be different, ff will be different, safari will be different
		//So webDriver cannot take any decision, 
		 
		public void click();
		public void sendkeys();
		public void quit(); 
		public void findElement(String element);
		
		
		

}
