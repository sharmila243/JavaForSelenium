package Z_Selenium_Basics;

public class Basics {
	
	/*
	 * Selenium - Selenium is not for testing purposes - we cannot test anything with Selenium
	 * 			- Selenium will just perform something on the browser
	 * 			- find something like buttons, check boxes, images, any link, it will interact with your favorite browser
	 * 				- and perform some action on it, that's it 
	 * 			- Selenium cannot tell if login is successfully done or not
	 * 			- Selenium cannot verify if the pricing information on the page is correct or not
	 * 			- Selenium cannot verify anything, 
	 * 				- it will tell you this is what happening in the page and this is the value and 
	 * 				- we have to validate that
	 * 			- Selenium is an AUTOMATION LIBRARY never say it's an TEST AUTOMATION TOOL
	 * 				- we can say automation tool in a high level term. 
	 * 			- Selenium automates browser, that's it
	 * 
	 * 
	 * Official website - selenium.dev
	 * 
	 * 
	 * Pros and Cons if Selenium
	 * 
	 * Pros:
	 * 1. Open Source/Free tool
	 * 		- open source and free tool both are same?? 
	 * 		- NO, open source - source code of selenium we can see, we can also customize it
	 * 		- Source code - I can even create Sharmila Selenium, I'm using Selenium internally on top of that I can create my own tool
	 * 			- eg. webDriver, IO, APM
	 * 		- Can I see source code for eclipse, catalog? NO, they're limited
	 * 		- Free tool - free, no need to purchase the license
	 * 			- QTP, UFT, TestComplete - paid tools 
	 * 		- SaopUI - I cannot see the source code and I've to pay if I really want to use the advance feature
	 * 		- Every free tool is open source?? 
	 * 			- NO, tools are freely available in the market but we cannot check their source code developed by DevTeam
	 * 		- Selenium is open source and free tool - we don't need to pay any license 
	 * 2. Supports all the major browser 
	 * 		- chrome, safari, FF, edge, IE, Opera
	 * 3. Supports various Programming Languages 
	 * 		- Java, Python, ruby, PHP, C#, C++, JS, Go, .net, JavaScript
	 * 4. Supports different OS - perform test cases on different platforms 
	 * 		- windows, MacOS, Linux (Unix is not supported)
	 * 5. W3C webDriver protocol - Standards for the browsers for webApplication
	 * 		- If webApplications are following W3C standards it means the Application is not up to the mark
	 * 		- we might not get good clients if application is not W3C certified
	 * 		- Selenium and all the browsers in the market are following W3C rules and policies 
	 * 		- So don't we think that the communication between browser and webDriver Selenium Script both are compatible
	 * 		- Let say web Application is also W3C certified the communication between all the 3 components will be good to go
	 * 6. Community support 
	 * 		- Struck anywhere, you can find solution anywhere, Google, YouTube, StackOverFlow
	 * 7. Selenium family - It's absolutely good to go with these tools as they are using selenium internally
	 * 		- Appium (using Selenium internally), webdriverIO(Selenium webDriver internally), Selenide, Protractor(deprecated JS)
	 * 
	 * Cons: 
	 * 1. Only for Web not for Mobile Applications, Desktop, API
	 * 2. NOT a testing tool - I cannot check how many test cases have got PASS/FAIL/generate any test report - html
	 * 3. NO Test Data Management	- TDM 
	 * 4. Cannot automate hardware testing, IOT's, block chain
	 * 5. automate Bar code, QR Code, Captcha
	 * 6. Interact with Gmail, Email - fetch OTP from that - NOOO - they may block because of the automation activity - we can use Gmail API's for that
	 * 7. Selenium is not made for - Performance testing 
	 * 8. Security Testing - NO with selenium 
	 * 9. Can we automate PDFs/Word/Files - NO only webPage
	 * 10. for Excel we use - Apache POI
	 * 11. Accessibility testing - only with Selenium NOOO
	 * 12. Parallel execution with Selenium - NOO (Parallel execution is done by TESTNG)
	 * 13. Image Processing	- NO 
	 * 		- Cannot validate the content on the image 
	 * 
	 * 
	 * How many Components we have for Selenium? 
	 * 1. Selenium IDE - Record and Play, Plugin on chrome/ firefox
	 * 2. Selenium RC - Selenium 1 - Remote Control - deprecated 
	 * 3. Selenium WebDriver - webDriver(different tool) + RC(Selenium_1) - Selenium_2 [7 8 years back we were using selenium maven version, 2.x version - Latest Selenium version- Selenium_4]
	 * 		- after Selenium_2 --> Selenium_3(3.141.59 - not w3c certified) --> selenium_4 (w3c certified)
	 * 4. Selenium Grid 4.x - create Hub + Nodes - if I want to run my test cases on Remote/Cloud/AWS/Server, I can use Selenium Grid - parallel 
	 * 
	 * 
	 * How exactly selenium is working?
	 * 
	 * Selenium Script (java, JS, Ruby, Python) - Client
	 * Browser - chrome, safari, firefox, edge
	 * I cannot interact with the browser directly - they are called Browser Drivers (browser specific drivers) available in the form of .exe file
	 * 		- chrome -  [(chromedriver.exe)/ binary file/driver]
	 * 		- edge - edgedriver.exe 
	 * 		- firefox - geckodriver.exe
	 * With the help of these drivers, we can interact with the browsers
	 * 
	 * Now who will release the browser? 
	 * 
	 * Browser WebApp
	 * chrome - Google 
	 * edge - microsoft
	 * firefox - mozilla
	 * safari - apple
	 * 
	 * SeleniumScript - who's giving selenium to us - Selenium DEV Team
	 * 
	 * who's writing the code - SDET - script we are writing with the help of selenium version - 4.x given by selenium Dev team 
	 * 
	 * who will develop the exe files?
	 * 		- Till Selenium_2 --> dev team developed exe files - dev team used to provide the exe files 
	 * 		- but the vendors like google, microsoft used to update the new versions for every 15 20 days 
	 * 		- we cannot ask them not to release their new versions 
	 * 		- and also we cannot release the updated verison of exe file for every 15 20 days and we're not sure about the update as well 
	 * 		- In this case, we directly asked the vendors also to release the .exe files to us along with the browser
	 * 		- As we don't know what's the update/ release and
	 * 			- on the basis of that we have to develop chromedriver.exe and 
	 * 			- we don't have any expertise in the browser, we don't exactly know how chrome is working
	 * 		- This is the major change that happened from Selenium_2 --> Selenium_3
	 * 			- Now the driver.exe responsibility is taken by the respective vendor only
	 * 	
	 * We'll supply the code we wrote to the chromedriver.exe and with the help of that exe file we open the application in the browser
	 * 		- for chrome we need to use chromedriver.exe
	 * 		- can I interact with firefox and edge or any other browser with chromedriver.exe - NO
	 * 
	 * I've to interact with the browser with exe file.
	 * 
	 * 
	 * Selenium_3 --> Selenium_4 
	 * Selenium_3 --> Interaction with your script and Driver is like server and 
	 * 		- interaction is happening with https request
	 * 		- we're sending and getting the response with the help of JSON wire protocol
	 * 		
	 * 		- Whenever we are sending request or interact with login button on browser we have to send some information
	 * 		- information like this is the xpath of the login button, .click() method - we've to pass this information from our side --> Driver
	 * 		- Let's say we're writing the java code, Does browser understand the Java? - NO, browser understands JavaScript - browser does not understand Ruby, python etc code
	 * 		- SeleniumScript and browser should interact with Driver
	 * 		- What exactly we say is, we pass the information(JSON API, xpath, click) to browser driver which read it from there and perform those on the browser with the information passed.
	 * 		- This is what happened till Selenium_3
	 * 
	 * 		- API are developed by Selenium DEV team
	 * 		- driver.get, driver.click, findElement, sendKeys - API's 
	 * 		- these API's are not standard up to Selenium_3 --> so they spoke to W3C and W3C was released in the market and we follow all the regulations on how to interact with Browser
	 * 		- In selenium_2 and 3 - there were issues like exceptions, flaky test cases, not able to use the xpath properly, script is fine in one browser and had an issue on another browser	
	 * 		- So it was a total mess till Selenium_3 as we don't know how to handle these browsers properly & how to interact & what kind of language and code browser can understand 
	 * 		- We really want a common understanding between the browser and script that we're writing, So
	 * 		- released Selenium_4 with W3C Standard's - instead of JSON wire protocol API they moved to Selenium_4 with W3C webDriver API
	 * 		- Now, we can say that the interactions happening with browsers are happening with the W3C webDriver API
	*/

}
