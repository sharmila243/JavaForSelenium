package JavaBasics;

public class DataTypes {

	public static void main(String[] args) {
		

		//Primitive DataTypes - 1. It will take space in the memory
		//						2. No need to create an object 
		//1. Integral - byte, short, int, long
		//2. Floating - float, double 
		//3. character - char
		
		//byte - size - 1 byte = 8 bits 
		//		 range - -128 to 127 ( -2^7 to 2^7-1 )
		byte b = 10;
		byte b1 = 20; 
		b = 40; 
		//byte b2 = 128; //error - because of range 
		
		System.out.println(b);
		System.out.println(b1);
		
		//short - size - 2bytes = 16 bits 
		//		  range - -32768 to 32767 ( -2^15 to 2^15-1)
		short s = 1000; 
		short s1 = 25000; 
		s = 32767; 
		//short s2 = 32768; //error because of range 
		
		System.out.println(s);
		System.out.println(s1);
		
		//int - size - 4bytes = 32 bits 
		//		range - -2147483648 to 2147483647 ( -2^31 to 2^31-1)
		int i = 100000;
		int i1 = 0; 
		int i2 = -188885; 
		System.out.println(i);
		System.out.println(i1);
		System.out.println(i2);
		
		//long - size - 8bytes = 64 bits 
		//		 range - ( -2^63 to 2^63-1)
		long l1 = 123456789; 
		long l2 = 987653864537892L; //Lmust be added at the end 
		System.out.println(l1);
		System.out.println(l2);
		
		//float - size - 4bytes = 32 bits 
		//		  range - after point it can take upto 6 - 7 digits 
		//float f = 12.33; //error 
		float f = 12.44f;
		float f1 = (float)34.88658888; 
		
		System.out.println(f);
		System.out.println(f1);
		
		//double - size - 8bytes = 64bits 
		//		   range - after point, it can take up to 15 digits 
		double d = 12.33333;
		double d1 = 12.567899990000009;
		System.out.println(d);
		System.out.println(d1);
		
		//char - size - 2 bytes = 16 bits 
		char c1 = 'A'; 
		char c2 = 'a';
		char c3 = '1';
		char c4 = '$';
		
		System.out.println(c1 + c2); // if we perform any arithmetic operations on alphabets
										// it takes ASCII values of characters and perform the operation
		//range
		//a - z = 97 - 122
		//A -Z = 65 - 90 
		//0 - 9 = 48 - 57 
		
		//to print ascii value of characters 
		System.out.println((int)c1);
		System.out.println((int)c3);
		System.out.println((byte)c4);
		System.out.println((byte)'@');
		System.out.println((byte)' '); //ASCII value of space
		
		//
		int x = 100; 
		char p = 'K';
		System.out.println(x+p); // takes the ascii value of k and add to int x
		
		System.out.println(c1 + " " + c2); //concatenate 
		
		String z = "Hello Selenium"; 
		char z1 = 't'; 
		System.out.println(z + " " + z1);
		
		//boolean - size - ~1bit 
		boolean flag = true; 
		boolean y = false; 
		System.out.println(flag);
		System.out.println(y);
	}
}