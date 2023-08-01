package JavaBasics;

import java.util.Arrays;

public class ArrayLiteralsConcept {

	public static void main(String[] args) {
		
		//Both are Static Array - way of declaring is different
		
		//if Have only 2 values I can store 2 values now and initialize the other 2 later
			//but in array literals we declare it only we know fixed amount of data
		int i[] = new int[4]; // Disadvantages - new keyword 
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(Arrays.toString(i));
		
		//ArrayLiterals - If we know fixed data - Static Array
		
		int p[] = {1, 2, 3, 4, 5};
		//Lower Index = 0
		//Higher index = length - 1 = 5-1 = 4
		int l = p.length; 
		System.out.println(l);
		
		//
		int k[] = new int[10];
		k[0] = 100; 
		k[1] = 200; //rest all are empty
		//what if we try to print k[2]
		//default value for primitive data type is 
			//int - 0
			//double - 0.0 
			//char - " "(space)
			//String - null (It is a non-primitive data type)
			//object - null (It is a non-primitive data type)
		
		//can I store k[5] ignoring 2 3 4 indexes - Yes
		k[5] = 100;
		System.out.println(k[5]);
			
		System.out.println(Arrays.toString(k));
		
		//
		double d[] = new double[4]; 
		d[0] = 24.03; 
		d[1] = 17.08; 
		System.out.println(Arrays.toString(d));
		
		//
		char ch[] = new char[6]; 
		ch[0] = 'b';
		ch[1] = 's';
		
		//what if I try to declare ch[6] & print the value deliberately knowing the actual length is 5
		//ch[6] = 'z'; 
		//System.out.println(ch[6]);
		//There will not be any compilation error but run time error as it deals with memory 
				//54 lines shows error it does not even go to 55 line during error - AIOB Exception
		
		
		System.out.println(Arrays.toString(ch));
		
		//boolean
		boolean flag[] = new boolean[4]; 
		flag[0] = true; 
		System.out.println(Arrays.toString(flag));
			//default values of boolean is false
		
		//
		String str[] = new String[7]; 
		str[0] = "Sharmila"; 
		str[1] = "Bhargav"; 
		str[2] = "Sai";
		System.out.println(Arrays.toString(str));
		
		//Double literal Array 
		double d1[] = {17.14, 16.12, 3.04}; 
		System.out.println(Arrays.toString(d1));
		
		//char literals 
		char ch1[] = {'a', 'b', 'c', 'd'}; 
		System.out.println(Arrays.toString(ch1));
		
		
		//String literals
		String str1[] = {"Sharmila", "Bhargav", "Surya", "Veda", "Dimple"}; 
		System.out.println(str1);
		
		//Object literals 
		Object obj[] = {"Sharmila", 26, 24.03, "Hyderabad", 'F', "Married", true}; 
		System.out.println(Arrays.toString(obj));
		
		for(int e: k) {
			System.out.println(e);
		}
		
		for(double e: d1) {
			System.out.println(e);
		}
		
		for(char e: ch1) {
			System.out.println(e);
		}
		
		for(String e: str1) {
			System.out.println(e);
		}
		
		for(Object e: obj) {
			System.out.println(e);
		}
			
		
		
	}

}
