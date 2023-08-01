package JavaBasics;

public class Assignment {

	public static void main(String[] args) {
		
		//FInd out the greatest number out of three different given numbers 
		//25, 78, 87
		int a = 25; 
		int b = 78; 
		int c = 87; 
		if(a>b && a>c) {
			System.out.println("A is greater");
		}
		else if(b>c && b>a) {
			System.out.println("B is greater");
		}
		else {
			System.out.println("C is greater");
	
		}
		
		System.out.println("*****");
		
		//Greatest of 4 numbers
		//25, 78, 87, 97
		int p = 25; 
		int q = 78; 
		int r = 87; 
		int s = 97; 
		if(p>q && p>r && p>s) {
			System.out.println("P is Greater");
		}
		else if(q>p && q>r && q>s) {
			System.out.println("Q is Greater");
		}
		else if(r>p && r>q && r>s) {
			System.out.println("R is greater");
		}
		else {
			System.out.println("S is greater");
		}
		
		System.out.println("*****");
		
		//test if number is positive or negative
		int i = -11; 
		if(i>0) {
			System.out.println("Positive number");
		}
		else {
			System.out.println("Negative number");
		}
		
		System.out.println("*****");
		
		//Odd/even using if else 
		int i1 = 19; 
		if(i1%2 == 0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}
		
		System.out.println("*****");
		
		//10 to 1 using do-while
		int d = 10; 
		do {
			System.out.println(d);
			d--;
		} while (d>=1);
		
		System.out.println("*****");
		
		//Multiplication of 5 from 1 to 100 - for, while, do-while
		for(int x = 1; x<=100; x++) {
				if(x%5 == 0) {
					System.out.println(x);
				}
		}
		
		int y = 1; 
		while(y<=100) {
			if(y%5 == 0) {
			System.out.println(y);
			}
			y++;
		}
		
		int z = 1; 
		do {
			if(z%5 == 0)
			System.out.println(z);
			z++;
		} while (z<=100);
		
		System.out.println("*****");
				
		//o/p of the loop??
		int h = 1; 
		while(h<=1) {
			System.out.println("hi");
			break; //added here because it's an infinite loop 
		}
		
		System.out.println("*****");
		//Hello world 10 times using while loop 
		int w = 1; 
		while(w<=10) {
			System.out.println("Hello world.."+ w);
			w++;
		}
		
		int t = 1; 
		do {
			System.out.println("Hello world.."+ t);
			t++;
		} while (t<=10);
		
		for(int e = 1; e<=10; e++) {
			System.out.println("Hello world.."+ e);
		}
		
		System.out.println("*****");
		
		//print 1 - 10; break once you see multiplication of 7 and print bye
		for(int u = 1; u<=10; u++) {
			System.out.println(u);
			if(u%7 == 0) {
				System.out.println("bye");
				break;
			}
		}
		
		int v = 1;
		while(v<=10) {
			System.out.println(v);
			if(v%7 == 0) {
				System.out.println("Bye");
				break;
			}
			v++;
		}
		
			
	}
	

}
