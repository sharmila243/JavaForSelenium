package OOPSConcept_1;

public class Student1 { //Class&Objects_Assignment
	
	String name;
	int marks;
	char grade;
	boolean result;

	public static void main(String[] args) {
		
		Student1 s1 = new Student1();
		s1.name = "Veda";
		s1.marks = 90;
		s1.grade = 'A';
		s1.result = true;

		Student1 s2 = new Student1();
		s2.name = "Prasanna";
		s2.marks = 33;
		s2.grade = 'D';
		s2.result = false;

		Student1 s3 = new Student1();
		s3.name = "Karthik";
		s3.marks = 87;
		s3.grade = 'A';
		s3.result = true;
		
		Student1 s4 = new Student1();
		s4.name = "Mani";
		s4.marks = 56;
		s4.grade = 'C';
		s4.result = true;

		System.out.println(s1.name + " " + s1.marks + " " + s1.grade + " " + s1.result);
		System.out.println(s2.name + " " + s2.marks + " " + s2.grade + " " + s2.result);
		System.out.println(s3.name + " " + s3.marks + " " + s3.grade + " " + s3.result);
		System.out.println(s4.name + " " + s4.marks + " " + s4.grade + " " + s4.result);

		System.out.println("*****");
		
		s1 = s2;
		System.out.println(s1.name + " " + s1.marks + " " + s1.grade + " " + s1.result);
		System.out.println(s2.name + " " + s2.marks + " " + s2.grade + " " + s2.result);
		System.out.println(s3.name + " " + s3.marks + " " + s3.grade + " " + s3.result);
		System.out.println(s4.name + " " + s4.marks + " " + s4.grade + " " + s4.result);

		System.out.println("*****");
		
		s2 = s3;
		System.out.println(s1.name + " " + s1.marks + " " + s1.grade + " " + s1.result);
		System.out.println(s2.name + " " + s2.marks + " " + s2.grade + " " + s2.result);
		System.out.println(s3.name + " " + s3.marks + " " + s3.grade + " " + s3.result);
		System.out.println(s4.name + " " + s4.marks + " " + s4.grade + " " + s4.result);

		System.out.println("*****");

		s3 = s4;
		System.out.println(s1.name + " " + s1.marks + " " + s1.grade + " " + s1.result);
		System.out.println(s2.name + " " + s2.marks + " " + s2.grade + " " + s2.result);
		System.out.println(s3.name + " " + s3.marks + " " + s3.grade + " " + s3.result);
		System.out.println(s4.name + " " + s4.marks + " " + s4.grade + " " + s4.result);

		System.out.println("*****");
		
		s4 = s1;
		System.out.println(s1.name + " " + s1.marks + " " + s1.grade + " " + s1.result);
		System.out.println(s2.name + " " + s2.marks + " " + s2.grade + " " + s2.result);
		System.out.println(s3.name + " " + s3.marks + " " + s3.grade + " " + s3.result);
		System.out.println(s4.name + " " + s4.marks + " " + s4.grade + " " + s4.result);
	}

}
