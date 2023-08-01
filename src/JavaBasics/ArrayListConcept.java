package JavaBasics;

import java.util.*;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//ArrayList - class - by default - Dynamic array
		//Create the object of an ArrayList class using ArrayList and new keyword
		//Index/order based array
		
		ArrayList<Object> ar = new ArrayList<Object>(); 
	
		System.out.println(ar.size()); //PC = 0; VC = 10
		System.out.println(ar); //empty list before adding/manipulating any
		
		ar.add("Sharmila"); //0
		ar.add(24.03); //1
		ar.add('F'); //2
		ar.add("Hyderabad"); //3
		ar.add("SAI Bhargav"); //4
		ar.add(17.08); //5
		ar.add('M'); //6
		ar.add("Montreal"); //7 
		
		System.out.println(ar.get(4));
		System.out.println(ar.get(5));
		
		System.out.println(ar);
		System.out.println(ar.size());
		
		ar.remove(7);
		System.out.println(ar);
		
		for(Object e: ar) {
			System.out.println(e);
		}
		
		System.out.println("*****");
		
		System.out.println(ar);
		
		System.out.println("*****");

		for(Object e: ar) {
			System.out.println(e);
		}
		
		System.out.println("*****");
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("*****");
		
		//Restrict the arraylist: Generics in AL
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(75);
		marksList.add(73); 
		marksList.add(100);
		
		System.out.println(marksList);
		for(int e: marksList) {
			System.out.println(e);
				if(e == 100) {
					System.out.println("Topper");
				}
		}
		
		for(int i = 0; i<marksList.size(); i++) {
			System.out.println(marksList.get(i));
				if(marksList.get(i).equals(100)) {
					System.out.println("A+ Grade");
				}
			
		}
		
		//int --> Integer
		//double --> Double 
		//String --> String
		
		ArrayList<Double> bmiList = new ArrayList<Double>();
		bmiList.add(100.0); 
		bmiList.add(24.03); 
		bmiList.add(33.66); 
		bmiList.add(99.99); 
		
		System.out.println(bmiList);
		
		ArrayList<String> monthsList = new ArrayList<String>();
		monthsList.add("Jan");
		monthsList.add("March");
		monthsList.add("June");
		monthsList.add("August");
		monthsList.add("September");
		monthsList.add("December");
		
		System.out.println(monthsList);
		
		//different types of data in ArrayList --> Object
		//add Object in the line 13
		ArrayList<Object> empDataList = new ArrayList<Object>(); 
		empDataList.add("Veda");
		empDataList.add(26);
		empDataList.add("CS"); 
		empDataList.add('F'); 
		empDataList.add(07.09); 
		empDataList.add(false);
		
		System.out.println(empDataList);
		
		//foreach loop
		for(Object e: empDataList) {
			System.out.println(e);
				if(e.equals(7.09)) {
					System.out.println("DOB");
				}
		}
		
		//for loop
		for(int i=0; i<empDataList.size(); i++) {
			System.out.println(empDataList.get(i));
				if(empDataList.get(i).equals('F')){
						System.out.println("Female");
						break;
				}
		}
		
		
		//Initially Java creates 10 Virtual Segments called Virtual Capacity 
			//VC = 10 and Physical capacity = 0
		//After initializing and declaring arraylist for example 
		
			/*	   PC = 0		ar.add(100); - 0 index/Segment     			VC = 10 (Default)
								ar.add(200); - 1
								ar.add(300); - 2
								ar.add("Selenium"); - 3
								ar.add('M'); - 4   		
					PC = 6		ar.add(26); - 5			     	VC = 4
								ar.add(); - 6
								ar.add(); - 7
								ar.add(); - 8
					PC = 10		ar.add(); - 9 // current size- 10   		VC = 0			
			 */
		
		//Now the next VC alloted = PC/2 ; 10/2 = 5; 
		//Next VC allots 5 Virtual segments						LOAD FACTOR = PC/2
			/*					ar.add(); - 10
			  					ar.add(); - 11
			  					ar.add(); - 12
			  					ar.add(); - 13
			  		PC = 15		ar.add(); - 14 //current size - 15    		VC = 0
			 			
			 			 */
		
		//Next VC alloted - PC/2 = 15/2 = 7.5 - since both are integers - 7 VC
			/*					ar.add(); - 15
			 					ar.add(); - 16
			 					ar.add(); - 17
			 					ar.add(); - 18
			 					ar.add(); - 19
			 					ar.add(); - 20
			 		PC = 22		ar.add(); - 21 //current size - 22			VC = 0
			 
			 */
		//Next VC alloted would be - PC/2 - 22/2 - 11  i.e, Load Factor
		
		//ar.size(); - gives Physical Capacity
	}

}
