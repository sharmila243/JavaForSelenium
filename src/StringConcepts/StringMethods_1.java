package StringConcepts;

public class StringMethods_1 {

	public static void main(String[] args) {
		
		
		String s1 = "Automation testing";
		String s2 = "Automation";
		String s3 = s2 + " testing"; //heap
		String s4 = "Automation" + " testing"; 
		
		System.out.println(s3);
		System.out.println(s4);
		
	
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s3));

		System.out.println("-------------");
		
		String s5 = "testing";
		String s6 = new String("testing");
		String s7 = new String("testing");
				
		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));
		System.out.println(s6 == s7);
		
		
	}

}
