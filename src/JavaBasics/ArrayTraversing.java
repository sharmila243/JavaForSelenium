package JavaBasics;

import java.util.Arrays;

public class ArrayTraversing {

	public static void main(String[] args) {
		
		int k[] = new int[4];
		k[0] = 10; 
		k[1] = 20; 
		k[2] = 30; 
		k[3] = 40; 
		
		System.out.println(Arrays.toString(k)); //gives all the values of array in [ ] 
		
		//to iterate the array - for loop
		for(int i = 0; i<k.length; i++) { //i <= k.length, till k[4]; AIOB(ArrayIndexOutofBoundException)
			System.out.println(k[i]);
				if(k[i]==30) {
					System.out.println("hii");
				}
				
		}
		
		System.out.println("*****");
		
		//For each loop - without index - initialize e and we say go for each k and print that value
		for(int e : k) {
			System.out.println(e);
				if(e == 20) {
					System.out.println("Bye");
					break;
				}
		}
		
		System.out.println("*****");
		
		short s[] = new short[5];
		s[0] = 100; 
		s[1] = 200; 
		s[2] = 300; 
		s[3] = 400; 
		s[4] = 500; 
		
		for(int e : s) {
			System.out.println(e);
		}

		System.out.println("*****");
		
		String browsers[] = new String[4];
		browsers[0] = "chrome";
		browsers[1] = "firefox";
		browsers[2] = "Safari";
		browsers[3] = "Edge";
		
		for(String e : browsers) {
			System.out.println(e);
				if(e.equals("Safari")) {
					System.out.println("launch Safari");
				}
		}
		
		System.out.println("*****");
		
		//Object - super class of all the class 
		//Can store multiple data type values
		
		Object ob[] = new Object[6];
		ob[0] = "Sharmila"; 	//0 - count
		ob[1] = 25;				//1
		ob[2] = 'F';			//2
		ob[3] = "24/03/1997";	//3
		ob[4] = 12.33;			//4
		ob[5] = "India";		//5
		
		System.out.println(Arrays.toString(ob));
		
		int count = 0;

		for(Object e : ob) {
			System.out.println(count +" = "+ e);
			count++;
		}
		
		System.out.println("*****");
		
		//reverse order with index loop // f = ob.length - 1 --> length ; length>=0; decrease 
		for(int f = ob.length-1; f>=0 ; f--) {
			System.out.println(ob[f]);
		}
		
		//reverse order with for each loop 
		
		//ArrayUtils.reverse(ob);
		for(Object e: ob) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
	}

}
