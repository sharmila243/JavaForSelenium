package StringConcepts;

public class StringTest {

	public static void main(String[] args) {
		
		
		String s = "testing"; //String literals 
		
		//String is a class why cannot we create the object of the string and pass the value there?
		String s1 = new String("testing");	//String objects with new keyword
		
		//How many objects are created after L8 and L11? --> 2 
				//1. 1 is available in the form of actual object - heap - new keyword
				//2. 1 more object created inside SCP
							//Up to JDK 1.7 SCP is not a part of heap, after it is.
		
		//Where String literals will be stored and string objects will be stored?
		
		//String objects - "testing" -- stored inside Heap and 
				//s1 reference variable inside stack
		
		//String literals - inside heap - inside SCP String COnstant Pool
				//s reference variable inside stack
		
		//*int i = 10; is stored in stack memory
		
		String s2 = "testing"; 
		//how many objects after this? - 2 only 
			//because it goes and check & find there is already "testing" inside SCP so it starts pointing to the same - 2 references  
					//s, s2 --> "testing" - So 2 objects only 
			//inside constant pool we cannot have duplicate values
		
		System.out.println(s == s2); //true, both are literals
		System.out.println(s == s1); // false, because s1 is in heap memory
										//and s compares with the entire object of s1 
										//so for string comparisons we always use .equals() method
										//because ==, compares with the references (reference memory address)
											//content is same 
											//let's say s is at 1000 and s2 is at 2334, they are not equal and == compares with reference address memory
		System.out.println(s1 == s2);
		System.out.println(s.equals(s1)); //true, comparison based on content
		System.out.println(s.equals(s2)); //true
		
		
		//
		String s3 = "java"; //SCP
		s3 = null; //breaks the connection with "java" and update to null value
		System.out.println(s3); //"java" - remains in SCP with no reference 
		
		String s4 = "java"; //will it create one more "java"?? 
							//no, as duplicate values are not allowed 	
							//s4 will be pointing to the "java" in SCP with no reference 
		String s5 = "java"; //s5 will also start pointing to s4
		System.out.println(s4 == s5);
		
		String s6 = new String("testing"); //creating the String object with new keyword 
				//objects created with new keyword, a new object is created unlike SCP, 
				//even if there is an another object with same content
		System.out.println(s == s6); //false
		
		
		System.out.println("--------------");
		
//		String t1 = "Selenium";
//		String t2 = "selenium"; //Since java is case sensitive, 2 objects will be created 
		
		String pop = "Selenium"; //1 -SCP
		
		String t3 = new String("Selenium"); //1 object is created inside heap , //1 -heap
		t3.intern(); //create the same value inside SCP -- but of no reference 	, //0
			//2 objects will be created in total
		String t4 = "Selenium" ; //inside SCP, this points to the no reference "Selenium" //0
		System.out.println(pop == t4);
		
		//
		String top = "Sharmila"; 
		String top1 = "Sharmila"; //1 object with 2 reference variables 
		String top2 = new String ("Sharmila"); //1 object
		top = null;
		top1 = null;
		String top3 = "Sharmila"; 
		
		System.out.println(top == top1);
//		System.out.println(top.equals(top1)); //NPE --> null is not an actual value so we get NPE
		System.out.println(top2 == top3);
		System.out.println(top2.equals(top3));
		
		
		//
		String p1 = new String("Cypress");
		p1.intern();
		
		//
		String z = "testing";
		z = z.concat("automation");	
		String str = z.concat("automation"); //Concatenating and creating a reference variable and storing in it
		System.out.println(z); //String's are Immutable - I cannot change the existing value
		System.out.println(str); 
		String z1 = "testing";
		System.out.println(z1);
		
		//
		String r = "     Cypress     "; 
		System.out.println(r.trim());
		String r1 = r.trim(); //simply writing r.trim() will not replace the existing value,
								//we have to declare it to new variable and then use it
								//the replaced value will be stores in heap not in SCP	
		String r2 = "     Cypress     "; 

		System.out.println(r);
		System.out.println(r1);
		
		System.out.println(r2 == r1);
		
		//if we are performing any action on the existing String, 
				//a new object will be created with no reference if we don't declare it 
		
		System.out.println("--------------");	
		//StringBuffer and StringBuilder --> Mutables
		
		//String Buffer									//String Builder
			//Thread safe									//Not thread safe
			//Synchronized									//Not Synchronized 
		 	//Since Java 1.0								//Since java 1.5
			//Slower										//Faster
		
		//Multiple users cannot have access at at time, one after one in StringBuffer 
		//Although having it's own disadvantage, multiple users can access at a time in StringBuilder	
		
		//there will not be any StringBuilder literals
		StringBuilder sb = new StringBuilder("Sharmila");
		sb.append("Bhargav"); //this is appended to sb, a new object will not be created here - Mutable
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer("Sharmila");
		sb1.append("Bhargav");
		System.out.println(sb1);
		
		
		
		System.out.println("------ImmutableStrings--------");	

		String x = "testing";
		x.concat("456");
		System.out.println(x);
		
		String y = x.concat("123");
		System.out.println(y);
	}

}
