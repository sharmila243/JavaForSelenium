package JavaBasics;

public class LoopsConcept_1 {

	public static void main(String[] args) {
		
		//10 - 1
		int i = 10; 
		while(i>=1) {
			System.out.println(i);
			i--;
		}
		
		System.out.println("*****");
		
		//10 to 1
		for(int d = 10;d>=1;d--) {
			System.out.println(d);
		}
		
		System.out.println("*****");
		
		//do-while - executed at least once
		//1 to 10
		int l=1;
		do {
			l++; // 2 to 11
			System.out.println(l);
			//l++;//1 to 10
			//l++; // if both the l++ is there then 2 4 6 8 10
		} while (l<=10);
		
		//Use Cases for do-while loop:
		//1. Element is already present on the page -- no need to come inside the loop
		//2. drop down -- default value(admin) - roles - 0 sec, 2 sec, 5 sec, 10 sec
		
		System.out.println("*****");
		
		int s = 1; 
		do {
			System.out.println(s);
				if(s==5) {
					System.out.println("hi");
					break;
				}
			s++;
		} while (s <= 10);
 		
		System.out.println("*****");
		
		for(int f = 0; f<=10; f=f+2) {
			System.out.println(f); // or we say f++ in the loop and print 2*f
		}
		
		System.out.println("*****");
		
		//1 to 20 and print hii if the number is divisible by 5
		for(int h = 1; h<=20; h++) {
			System.out.println(h);
				if(h%5 == 0) {
					System.out.println("hiii");
				}
		}
		
		System.out.println("*****even & odd numbers from 1 - 20*****");
		
		for(int y=0; y<=10; y++) {
				if(y%2 == 0) {
					System.out.println("even numbers: "+ y);
				}
		}
		
		System.out.println("*****");
		
		for(int x=0; x<=10; x++) {
				if(x%2 == 1) {
					System.out.println("Odd numbers: "+ x);
				}
		}
		
		System.out.println("*****");
		
		//double with the loops
		for(double d1=1.0; d1<=10.0; d1++) {
			System.out.println(d1);
		}
		
		System.out.println("*****");
		
		//Characters with loops 
		for(char ch='a'; ch<='z'; ch++) {
			System.out.println(ch +" ASCII value "+ (int)ch);
		}
		
		System.out.println(" ");
		
		for(char ch1='A'; ch1<='Z'; ch1++) {
			System.out.println(ch1 +" ASCILL value  "+ (int)ch1);
		}
		
		System.out.println(" ");
		
		for(char ch2='0'; ch2<='9'; ch2++) {
			System.out.println(ch2 +" ASCII value "+ (int)ch2);
		}
		
		System.out.println("*****");
		
		for(char ch='a'; ch<='z'; ch++) {
			System.out.println(ch);
				if(ch == 'y') {
					System.out.println("Execute my testcases");
					break;
				}
		}
		
		System.out.println("*****");
		
		int count=0;
		for(;;) {
			System.out.println(count +" "+"Bye");
				if(count == 5) {
					count++;
					break;
				}
				count++;
		}
		
		System.out.println("*****");
		
		int pointer = 0;
		while(true) {
			System.out.println("Checking the elements");
				if(pointer == 10) {
					System.out.println("Element is displayed");
					break;
				}
				pointer++;
		}
		
	}

}
