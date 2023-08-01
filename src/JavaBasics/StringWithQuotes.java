package JavaBasics;

public class StringWithQuotes {

	public static void main(String[] args) {
		
		String str = "I Love \"Java\" & it's concept"; //i cannot write "Java" in the statement - gives error
						//instead we can write \"java\"
						// it will not print \
		System.out.println(str);
		
		String st = "This is my \"java\" & \"Selenium\" Code"; 
		System.out.println(st);
		
		String username = "admin"; 
		String password = "admin@123"; 
		
		//I need to append username and password in the url itself
		
		String url = "https://"+username+":"+password+"@abc.com/login.html"; 
		System.out.println(url);
		
		
		//we can do the same thing in Xpath
		//a[text()='sharmila'] - ''
		//a[text()="sharmila"] - \"+_______+\"
		
		String userName = "Selenium";
		String xpath = "a[text()=\""+userName+"\"]"; //concatenate - let the single quotes remain same 
									//how to concatenate - "+__________+"
									//maintaining it Dynamically
		System.out.println(xpath);
		
	}

}
