package OOPSConcept_1;

public class Student { // Class&Objects_2 --> Student1.java

	String name;
	int marks;
	char grade;
	boolean result;

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "Veda";
		s1.marks = 90;
		s1.grade = 'A';
		s1.result = true;

		Student s2 = new Student();
		s2.name = "Prasanna";
		s2.marks = 33;
		s2.grade = 'D';
		s2.result = false;

		Student s3 = new Student();
		s3.name = "Karthik";
		s3.marks = 87;
		s3.grade = 'A';
		s3.result = true;
		
		Student temp = new Student();

		System.out.println(s1.name + " " + s1.marks + " " + s1.grade + " " + s1.result);
		System.out.println(s2.name + " " + s2.marks + " " + s2.grade + " " + s2.result);
		System.out.println(s3.name + " " + s3.marks + " " + s3.grade + " " + s3.result);
		System.out.println("*****");
		
		temp = s1;
		
		s1 = s2;
		System.out.println(s1.name + " " + s1.marks + " " + s1.grade + " " + s1.result);
		System.out.println(s2.name + " " + s2.marks + " " + s2.grade + " " + s2.result);
		System.out.println(s3.name + " " + s3.marks + " " + s3.grade + " " + s3.result);
		System.out.println("*****");
		
		s2 = s3;
		System.out.println(s1.name + " " + s1.marks + " " + s1.grade + " " + s1.result);
		System.out.println(s2.name + " " + s2.marks + " " + s2.grade + " " + s2.result);
		System.out.println(s3.name + " " + s3.marks + " " + s3.grade + " " + s3.result);
		System.out.println("*****");

		s3 = temp;
		System.out.println(s1.name + " " + s1.marks + " " + s1.grade + " " + s1.result);
		System.out.println(s2.name + " " + s2.marks + " " + s2.grade + " " + s2.result);
		System.out.println(s3.name + " " + s3.marks + " " + s3.grade + " " + s3.result);

	}

}
