package StringConcepts;

import ExceptionHandling.FrameworkException;

public class StringReverse {
	
	public static String reverseString(String str) {
		
		//check for null - this should be written first to avoid NPE
		if(str.equals(null)) {
				System.out.println("no null values are allowe");
				throw new FrameworkException("NullValuesAreNotAllowed");
			}
				
		//Blank check - str.isBlank() can also be used
		if(str.isEmpty()) {
			System.out.println("no blank values are allowed");
			throw new FrameworkException("BlankValuesAreNotAllowed");
		}
		
		
		
		
		int length = str.length();
		System.out.println(str +" length is: "+ length);
		
		//check for 0 length string
		if(length == 0) {
			//we can ask the interviewer what do we have to return when the length is 0
			System.out.println("String length is 0");
			return "-1"; // return -1 we cannot write because, return type this method is String
//			return "String length is Zero";
			//we can also throw our custom exception
		}
		
		//check 1
		if(length == 1) {
			return str;
		}
		
		//last check
		String rev = "";
		
		for(int i = length-1; i>=0; i-- ) {
			rev = rev + str.charAt(i);
		}
		return rev;
		
		
	}

	public static void main(String[] args) {

		//Supply Selenium/any word and reverse it 
		//Selenium --> muineleS
		//T --> T
		//te --> et
		//123 --> 321
		//null -- ?? NPE
		
//		System.out.println(StringReverse.reverseString("")); //length = 0 - return of nothing is nothing but why do we have to go inside if
//		System.out.println(StringReverse.reverseString(" ")); //length =1 ; reverse of blank space is reverse OR we can also place a check
		
		System.out.println(StringReverse.reverseString("Selenium"));
		System.out.println(StringReverse.reverseString("Sharmila Bhargav"));
		System.out.println(StringReverse.reverseString("T"));// for this do we really want to get into if condition
		System.out.println(StringReverse.reverseString("123"));
//		System.out.println(StringReverse.reverseString(null)); //NPE
		
		System.out.println(StringReverse.reverseString("Testing Selenium Cypress"));
		


		
		
		
		
	}

}
