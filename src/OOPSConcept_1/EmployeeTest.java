package OOPSConcept_1;

public class EmployeeTest { //MethodsInJava --> Testing.java
	
	//Acceptance criteria 
	//Calculate the score/marks of the employee
	//create a function: getEmployeeMarks
	//input parameter: empName (if student is x, return y -- if student is a, return b)
	//return: marks

	public int getEmployeeMarks(String empName) {
		System.out.println("getting employee marks of " + empName);
	
		int marks = -1;
		
		if(empName.equals("Sharmila")) {
			marks = 93;
//			return 93;
		}
		else if(empName.equals("Bhargav")) {
			marks = 97;
//			return 97;
		}
		else if(empName.equals("Nithish")) {
			marks = 60;
//			return 60;
		}
		else if(empName.equals("Salman")) {
			marks = 100;
//			return 100;
		}
		else {
			System.out.println("emp name not found.. " + empName);
//			return -1;
		}
			return marks;
	}
	
	
	public static void main(String[] args) {
		
		EmployeeTest e1 = new EmployeeTest();
		
		int i = e1.getEmployeeMarks("Naveen"); //If we pass a name which is not in the list then
					//we get 0 in the console as we declared marks = 0
					//there might be a possibility of having an another employee with 0 marks 
					//that could direct us in a wrong way 
					//Print the marks of the student which is not available in the data base - X wrong
		System.out.println(i);
		
		if(i >= 0) {
			System.out.println("Print the marksheet"); //print only if the marks is only greater/equal to 0 
		}
	}

}
