package StringConcepts;

public class StringReverse_1 {
	
	
	
	public static int reverseInteger(int num) {
		
		int remainder; 
		int rev = 0;
		
		while(num != 0) {
			remainder = num % 10; // last digit of number 
			rev = (rev * 10) + remainder; // (0*10) + last digit
			num = num/10; // 123/10 = 12.3 --> 12
		}
		return rev;
	}
	
	
	
	

	public static void main(String[] args) {
		
		System.out.println(StringReverse_1.reverseInteger(123));
		System.out.println(StringReverse_1.reverseInteger(240397));


	}

}
