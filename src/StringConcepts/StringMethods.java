package StringConcepts;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		//if we are doing lot of manipulations we can use StringBuilders instead of String class
		
		String s = "hi sharmila, this is my java code and i am so happy";
		
		System.out.println(s.length()); //length of String
		System.out.println(s.charAt(0)); //t
		System.out.println(s.charAt(10)); //space
		System.out.println(s.charAt(37)); //last
//		System.out.println(s.charAt(38)); //SIOB Exception - unchecked exception
//		System.out.println(s.charAt(-1)); //SIOB
		
		System.out.println(s.indexOf('j'));
		
		System.out.println("1st occuurrence: " + s.indexOf('i')); //1st occurrence of i
		System.out.println(s.indexOf('i')+1); //next character to 1st occurrence of i
		
		System.out.println("2st occuurrence: "+ s.indexOf("i", 3)); //disadvantage of this is, tomorrow if someone manipulates the string values might differ
		
		System.out.println("2st occuurrence: " + s.indexOf("i", s.indexOf('i')+1)); 
							//start counting from the next character from first occurrence of i
		
		System.out.println("3rd occuurrence: " + s.indexOf("i", s.indexOf("i", s.indexOf('i')+1)+1));
				//3rd occurrence of i, start looking from the next character of second occurrence of i
		
		System.out.println("4th occurrence: " + s.indexOf("i", s.indexOf("i", s.indexOf("i", s.indexOf('i')+1)+1)+1));
		
		
		
		System.out.println("----------");
		
		String s1 = "hi there, java gets interesting as days goes on";
		char ch = 'a';
		
		int index = s1.indexOf(ch);
		
		while(index != -1) {
			System.out.println(index);
			index = s1.indexOf(ch, index+1);
		}
	
		System.out.println("-----------");
		
		
		
		System.out.println("index of java: " +s.indexOf("java")); //index of j
		System.out.println("index of java: " +s.indexOf("jiva")); //word not found -- -1
		System.out.println("index of cypress: " + s.indexOf("cypress")); //word is not found -- -1
		
		
//		String msg = "welcome admin";
		String msg = "welcome null";
		if(msg.indexOf("admin")>0){
			System.out.println("Present");
		}
		else {
			System.out.println("FAIL");
		}
		
		//trim
		String test = "		Selenium	 ";
		String test1 = " 	Selenium Automation		";
		System.out.println(test.trim());
		System.out.println(test1.trim());
		
		
		//replace 
		String dob = "24-03-1997";
		System.out.println(dob);
		dob = dob.replace("-", "/"); //this reassigned value will be stored in heap
		dob.intern();

		System.out.println(dob); //Any action performed on literals will be stored in heap not in SCP
		
		String dob1 = "24/03/1997"; //SCP

		System.out.println(dob == dob1); //so false //this changes to true after dob.intern();
		System.out.println(dob.equals(dob1));
		
		//
		String t = "	Selenium Automation		";
		t = t.trim();
		t = t.replace(" ", "");
		System.out.println(t);
		
		
		//
		String ts = "Java code";
		System.out.println(ts.toUpperCase());
		System.out.println(ts.toLowerCase());
		
		
		//subString:
		String un = "your username is sharmila";
		System.out.println(un.substring(5)); //fetch a part of a string using index
		System.out.println(un.substring(0, 5)); // 0 to 5-1
		System.out.println(un.substring(un.indexOf("is")+3, un.length()));
		System.out.println(un.substring(un.indexOf("sharmila"), un.length()));
		
		
		//contains:
		String str = "your username is sharmila";
		boolean b = str.contains("s");
		System.out.println(b);
		
		//if we get any success message or error message from a webPage, if it is containing "____"(something) test is passed if not fail
		if(str.contains("sharmila")) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		
		//equals:
		String pop = "Hello Selenium";
		String top = "    hello selenium    ";
		System.out.println(pop.equals(top)); //false
		System.out.println(pop.equalsIgnoreCase(top)); //false
		System.out.println(pop.equalsIgnoreCase(top.trim())); //true
				
		
		//split: return type of split is String Array
		String lang = "JAVA_PYTHON_RUBY_JAVASCRIPT";
		String lg[] = lang.split("_");
		System.out.println(lg[0]);
		System.out.println(Arrays.toString(lg));
		
		
		String p = "xXtestingXxXSeleniumXXxAutomationxXXCypress";
		String p1[] = p.split("xX");
		System.out.println(p1[0]); //Blank not even space - how to see if it's blank or space - find length if it's O It is blank because even length of space is even
		System.out.println(p1[0].length());
			//we're not getting anything here, because if we start splitting xX,
				//index 0, xX, index 1, xX, index 2 ... goes on
				//Beginning before xX we have nothing, so nothing is printed on the console - now added C
		System.out.println(p1[1]);
//		System.out.println(p1[5]); //AIOB
		System.out.println(Arrays.toString(p1));
		
		
		String z = "My name is Sharmila";
		String z1 = z.split("is")[0].trim();
		String z2 = z.split("is")[1].trim();
		System.out.println(z1);
		System.out.println(z2);
		
		
		//
		String empData = "Bhargav;Koka;Hyderabad;India;123456;SDET;12.45";
		String emp[] = empData.split(";");
		for(String e: emp) {
			System.out.println(e);
		}
		
		//
		//pipe has the special value, we cannot split the string with "|" alone
		String empData1 = "Bhargav|Koka|Hyderabad|India|123456|SDET|12.45";
		String emp1[] = empData1.split("\\|"); //In order to make pipe a regular expression, 
														//add double black slash
		System.out.println(emp1[0]);
		for(String e: emp1) {
			System.out.println(e);
		}
		
		//In order to print a word in double quotes, we cannot just simply add " " around, 
					//instead we have to add a single black slash before a double quote and it works
					//escape the character with one back slash
		String d1 = "I love \"Java\" and i am so happy";
		System.out.println(d1);
		
		
		//
		StringMethods.createXpath("Surya");  
		
		
		
	}
	
	public static void createXpath(String empName) {
		String xpath = "//a[text() = 'Sharmila']";
		System.out.println(xpath);
		
		//If i want to append the same name as I pass in the arguments - will the below code append?? NO
		String xpath1 = "//a[text() = 'empName']";
		System.out.println(xpath1);

		//
		String xpath2 = "//a[text() = '"+empName+"']"; // +"empName"+
		System.out.println(xpath2);

		
	}
	

}
