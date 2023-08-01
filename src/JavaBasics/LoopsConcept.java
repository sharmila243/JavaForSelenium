package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1. while: Print 1 to 10
		int d=1; 
		while(d<=10) {
			System.out.println(d);
			//d++; 
			//++d;
			//d += 1;
			d = d+2; //d=1; odd numbers //d=0; even numbers
		}
		
		int k=1;
		while(k<10) {
			if(k==5) {
				System.out.println("hiii");
				break; //1,2,3,4, hiii -- break out of the loop
			}
			System.out.println(k);
			k++;
			//break; - if break is here, o/p is only 1 
		}
		
		System.out.println("*****");
		
		while(true) { //(false) - below code is unreachable code 
			System.out.println("Bye");
			break;
		}
		
		System.out.println("*****");
		
		int count = 0; 
		while(count<=100) {
			System.out.println(count);
				if(count == 25) {
				System.out.println("25 runs");
				}
				if(count == 50) {
				System.out.println("Half century");
				}
				if(count == 100) {
				System.out.println("Century");
				}
			count++;
		}
		
		//Use cases of while loop:
		//when no. of iterations are not fixed
		//wait for the specific element on the page - it might be available after 2sec, 5sec, 10sec
		//wait for the page load - launch any application - keeps loading, it might up to few seconds
				//page loading time
		//Drop down values - country drop down etc
		//web table pagination - selectorshub page - 
		          //keep click on next next until we find a specific element on pages available
		//Calendar - booking app - search for particuar date - 
					//we don't have any idea of clicking the no. of times the next arrow button
		//carousel: searching for an element in ecommerce
		
		System.out.println("*****ForLoop*****");
		
		//2. For Loop: we use this generally when iterations are fixed
		//for loop: Print 1 to 10
		int i; 
		for (i = 1; i<=10; i++) {
			System.out.println(i);
			//i++;//1 3 5 7 9	
		}
		
		//infinite loop
		for(;;) {
			System.out.println("Bye");
			break;
		}
		
		for(int run=1; run<=100; run++) {
			System.out.println(run);
				if(run==0) {
					System.out.println("Duck Out");
					break;
				}
				if(run==25) {
					System.out.println("25 runs");
				}
				if(run==50) {
					System.out.println("half century");
				}
				if(run==100) {
					System.out.println("century");
				}
		}
		
		//Use Cases for For Loop
		//1. Iterations are fixed
		//2. to fetch the values from the array
		//3. drop down - month drop down (1 - 12), country drop down
		//4. Big basket - shop by category - fixed 
		//5. menu, sub menu categories
		//6. Movie tickets
		
	}

}
