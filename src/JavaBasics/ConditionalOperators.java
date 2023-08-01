package JavaBasics;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		System.out.println(10==20); //comparing if both are equal]
		System.out.println((int)'a' == 98);
		
		int x = 10; 
		int y = 20;
		if(x==y) {
			System.out.println("x = y");
		}
		else {
			System.out.println("x != y");
		}
		
		System.out.println("*****");
		if(x>=y) {
			System.out.println("X is equal to or greater than y");
		}
		else {
			System.out.println("X is not equal to or greater than y");
		}
		
		//<, >, >=, <=, ==, !=

		System.out.println("*****");
		if(x!=y) {
			System.out.println("PASS");
			
		}
		else {
			System.out.println("FAIL");
		}
		
		//This is not a good practice - so create a boolean variable
		if(true) {
			System.out.println("Hiiii");
		}
//		else { //DEAD CODE - Unreachable code, because we've deliberately written "true"
//			System.out.println("BYE");
//		}
		
		boolean flag = false; //if/else is dependent on the flag variable 
		if(flag) {
			System.out.println("hiii");
		}
		else {
			System.out.println("BYE");
		}
		
		//
		double d1 = 12.33; 
		double d2 = 12.34; 
		if(d1==d2) {		//Comparison Operator is applicable for all primitive data types
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
		
		//
		char c1 = 'a';
		char c2 = 'b'; 
		if(c1 == c2) {
			System.out.println("c1 c2 are equal");
		}
		else {
			System.out.println("c1 c2 not equal");
		}
		
		//we can also check if(c1 == 97)
		//since we're not performing any arithmetic operations, 
				//it takes the ascii value of 97 and compare with c1 variable 
	
		System.out.println("*****Nested IfElse*****");
		int marks = 80; 
		if(marks <= 100) {
			if(marks >= 90) {
				System.out.println("A Grade");
				if(marks>=95) {
					System.out.println("Eligible for Scholarship");
				}
				else {
					System.out.println("Not Eligible for Scholarship");
				}
			}
			else {
				System.out.println("B Grade");
				if(marks > 75) {
					System.out.println("you got 20% discount");
				}
			}
		}
		else {
			System.out.println("Incorrect marks");
		}
	
		System.out.println("*****if - if- if- if*****");
		String browser = "edge"; 
		if(browser.equals("chrome")){
			System.out.println("Launch Chrome");
		}
		if(browser.equals("firefox")){
			System.out.println("Launch Firefox");
		}
		if(browser.equals("Safari")) {
			System.out.println("Launch Safari");
		}
		if(browser.equals("edge")) {
			System.out.println("Launch Edge");
		}
		else { //this else also gets executed all the time
			System.out.println("Please pass the right browser.. "+ browser);
		}
		//issues with the above code
		//1. it will go check all the if conditions, doesn't matter it goes inside the condition
		//the last else statement is attached with the last if condition
		//if we pass chrome - check all the if conditions 
			//it comes to egde if condition and since if condition is not satisfied 
				//it will go check the else part, this else part is attached to the edge if condition 
					//and print whatsoever is in else condition
		//if we pass edge in the browser 
			//it will check all the if conditions and go to the edge if condition
				//if condition is satisfied and it comes out of the loop
					//else is not checked because the if part is satisfied
		
		//2. Unnecessary checking all the if conditions
		
		
		System.out.println("*****if elseIf****");
		String browser1 = "firefox";
		if(browser1.equals("chrome")) {
			System.out.println("launch chrome");
		}
		else if(browser1.equals("firefox")) {
			System.out.println("launch firefox");
		}
		else if(browser1.equals("safari")) {
			System.out.println("launch safari");
		}
		else if(browser1.equals("edge")) {
			System.out.println("launch edge");
		}
		else {
			System.out.println("Please pass the right browser1.. "+ browser1);
		}
		
		//if we are passing edge in browser1 - 
				//it has to check unnecessarily all the above if and else if conditions
		//slightly better than previous 
		//to overcome this we create switch statements
	}
}	
		
		
		
