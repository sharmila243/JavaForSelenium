package DataConversion;

public class WrapperClass {

	public static void main(String[] args) {
		
		//String to Integer using wrapperClass
			//int(DataType) -- Integer(Class)
			//primitive to non-primitive
		
		//WrapperClass is used for dataConversions
		
		//Primitive to WrapperClass 
							//(Wrap - under that they hold the primitive value, 
							//on top that java has created the respective classes)
		//int -- Integer
		//double -- Double
		//float -- Float
		//char -- Character
		//boolean -- Boolean
		
		String x = "100";
		System.out.println(x+20);
		int i = Integer.parseInt(x); //conversion from String to Integer
		System.out.println(i+20);
		
		//Only and Only pure numerical can be converted - uncomment and check
//		String test = "100A"; //NumberFormat Exception
//		int k = Integer.parseInt(test);
//		System.out.println(k); 
//		
		//
		double d = Double.parseDouble(x);
		System.out.println(d+15);
		
		//
		String headless = "true"; //I'm reading the data in Selenium from configuration file and
									//I want to run the testCases in the headless mode
									//Can I use the same headless String in the if condition?
		if(Boolean.parseBoolean(headless) == true ) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		
		//Range of Byte
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		//Range of Short
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		//Range of Long
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		
		//Integer to String:
		int u = 100;
		System.out.println(u+20);
		String s = String.valueOf(u);
		System.out.println(s+20);
		
		//
		double d1 = 12.33;
		String s1 = String.valueOf(d1);
		System.out.println(s1 + 10);
		
		//
		char c = 'a';
		System.out.println((int)c);
		System.out.println(c + 10);
		String s2 = String.valueOf(c);
		System.out.println(s2 + 10);
		
		//
		boolean f = true;
		String s3 = String.valueOf(f);
		System.out.println(s3 + 90);
		
		
	}

}
