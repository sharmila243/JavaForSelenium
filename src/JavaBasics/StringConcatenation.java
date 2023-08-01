  package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		
		//String is a Class in Java - " "
		//Non-primitive DataTypes - String, Class, Object, Array, ArrayList
		String s = "SharmilaBhargav"; 
		System.out.println(s);
		
		String s1 = "100"; //This is a String not an integer
		System.out.println(s1+20); // o/p - 10020 (String + Integer)
		 
		System.out.println(10+20); //Arithmetic operation 
		
		int a = 100; 
		int b = 200; 
		String x = "Sharmila"; 
		String y = "Bhargav"; 
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		System.out.println(a+b+x+y+a+b);
		
		System.out.println("The value of a "+ a);
		System.out.println("The value of b "+ b);
		System.out.println("The sum: "+ (a+b));
		
		double d1 = 11.22;
		double d2 = 55.44; 
		System.out.println(d1+d2);
		System.out.println(x+y+d1+d2);
		System.out.println(a+b+x+y+d1+d2);
		System.out.println(a+b+x+y+(d1+d2));
		
		char c1 = 'a';
		char c2 = 'b';
		System.out.println(c1+c2);
		System.out.println(x+y+c1+c2);
		System.out.println(c1+c2+x+y);
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a*b);
		
		System.out.println(c1-c2);
		System.out.println(c1*c2);
		System.out.println((char)c1);
		
		System.out.println("this employee is: "+ true); //string can be concatenated with boolean 
		System.out.println("your bank acc is: "+ false); // your bank acc is inactive

		System.out.println(9/3);
		System.out.println(9/2); //4.5 --> 4 (since both the numbers are integers, result - integer)
		System.out.println(9.0/2); //4.5
		System.out.println(9/2.0); //4.5
		System.out.println(9.0/2.0); //4.5

		System.out.println(0/1);
		System.out.println(0/100);
		//System.out.println(9/0); //Arithmetic Exception
		//System.out.println(0/0); //Arithmetic Exception (in case of integer values)
		
		System.out.println(9.1/0); //Infinity (in case of floating numbers)
		System.out.println(9.0/0); //Infinity
		System.out.println(9/0.0); //Infinity
		System.out.println(9.0/0.0); //Infinity
		
		System.out.println(0.0/0.0); //Not a number
		System.out.println(0.0/0); //Not a number
		System.out.println(0/0.0); //Not a number
		
		//System.out.println('a'/0); //Arithmetic Exception
		
		System.out.println('a'/'0'); //97/48
		
		//byte - -128 to 127 
		byte b1 = 125; 
		byte b2 = 30; 
		//byte b3 = b1 + b2; //sum is out of range - so should be declared short/int
		int b3 = b1 + b2;
		int b4 = b1 - b2;
		System.out.println(b3);
		System.out.println(b4);
		
		int f1 = 100; 
		int f2 = 200; 
		int f3 = f1+f2; 
		System.out.println(f3);
		
		//modulus operator - to check even or odd
		System.out.println(10%2);
		System.out.println(9%2);
		System.out.println(50%3);
		System.out.println(100%3);
		
		//octal number - base 8 - octal range - numbers can only be from (0-7)
		byte h = 065; 
		System.out.println(h);
		
		//065 - 5*8^0 + 6*8^1 + 0*8^2 = 5 + 48 + 0 = 53
		
		//byte h1 = 089; //because of octal range 
		byte h2 = 077; //allowed
		//byte h3 = 078; //not allowed
		//byte h4 = 0736; //result is out of byte range so should be declared short/int
		short h4 = 0736; 
		System.out.println(h2);
		System.out.println(h4);
		
		byte x1 = 125;
		byte x2 = 120; 
		//byte x3 = x1+x2; //error
		byte x3 = (byte) (x1 + x2); //compresses the value to byte forcefully
		System.out.println(x3);
		//-11 is because 
		//-128 to 127 --> range is 256 (128 +128(including 0))
		//256 is the range of byte 
		//sum is 245
		//256 - 245 = 11
		}

}