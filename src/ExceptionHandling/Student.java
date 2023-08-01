package ExceptionHandling;

public class Student {
	
	@SuppressWarnings("finally")
	public static int getStudentMarks(String studName) {
		System.out.println("Get Student marks: " + studName);
			
		if(studName.equals("Sharmila")) {
			
			try {
//				int i = 9/0;

				int i = 9/3;
				System.out.println(i);
//				System.exit(0); //JVM please exit - Shut down everything

				return 45; //still goes to the finally block and return 100 - 45 is replaced by 100
				
			}
			catch(ArithmeticException e){
				System.out.println("AE is coming");
				e.printStackTrace();
				return 85; //It will return 85 not 100 - in order to return 100 add finally 
			}
			finally {
					//System.exit(0) is one such method to stop executing finally block, 
						//if it is written before reaching the finally block
				return 100;	// even though we have return 85, because of this 100 will be returned
			}
			
		}
		else if(studName.equals("Bhargav")) {
			return 99;
		}
		else {
			System.out.println("Student not found");
			
			throw new FrameworkException("StudentNotFound");
//			return -1;
		}
		
			
	}

	public static void main(String[] args) {
		
		int m1 = Student.getStudentMarks("Sharmila");
		System.out.println(m1);
	}

}
