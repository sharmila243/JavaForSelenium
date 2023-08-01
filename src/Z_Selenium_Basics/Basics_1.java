package Z_Selenium_Basics;

public class Basics_1 {
	
	
	/*
	 * In Selenium there is an Interface name "searchContext"
	 * "searchContext"
	 * 		- findElement
	 * 		- findElements
	 * No method body because it's an interface
	 * 
	 * 
	 * Child Interface of "searchContext" --> "webDriver" --> webDriver extends searchContext (interface extends interface)
	 * Can we override searchContext methods in webDriver - Yes, does it have method body? - NO
	 * also we can have methods like, 
	 * 		- getUrl();
	 * 		- getTitle();
	 * 		- close();
	 * 		- quit();	
	 * 
	 * Class which is child of webDriver Interface --> "RemoteWebDriver" implements "webDriver" Interface
	 * 		- all the methods from webDriver and searchContext Interfaces should be implemented over here with methodBody
	 * 	
	 * 
	 * Relation between RemoteWebDriver and other browserDriver class - Has to be defined 
	 * Below are the child of "RemoteWebDriver" Class
	 * The below classes are not directly extending "RemoteWebDriver" class, there's a class in between called "chromiumDriver" Class 
	 * "ChromiumDriver" --> browserTechnology to develop the browser
	 * 					--> they've given certain protocols here, chromium features here
	 * Now if I want to launch NaveenBrowser I can use a feature from Chromium
	 * Like Edge, although edge is coming from Microsoft and chrome from Google - both are based out of Chromium 
	 * the below are the child of ChromiumDriver and ChromiumDriver is the child of "RemoteWebDriver"
	 *
	 * ChromeDriver Class extends ChromiumDriver extends "RemoteWebDriver"
	 * EdgeDriver Class extends ChromiumDriver extends "RemoteWebDriver"
	 * 
	 * 
	 * Safari and Firefox are having their own libraries and features like mozilla so they directly extend "RemoteWebDriver" Class
	 * SafariDriver Class extends "RemoteWebDriver"
	 * FirefoxDriver Class extends "RemoteWebDriver"
	 * 
	 * 
	 * If I really want to launch ChromeBrowser - Maven Project - Selenium_Sessions
	 * 
	 */

}
