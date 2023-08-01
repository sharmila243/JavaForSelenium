package JavaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListConcept_3 { //Different methods

	public static void main(String[] args) {
		
		//NOTE:
		//For Example - If we are declaring an arrayList, VC = 10, PC = 0 by default 
				//And we've filled up all the virtual segments, VC = 0; PC = 10
					//If we delete all the data we've entered - what will be the value of VC??
							/*VC will still be 0 because memory is allocated, 
							 * even if we delete the data, Memory is assigned already and 
							 * remains the same just the data gets deleted
							 */
			
		ArrayList<String> ar =  new ArrayList<String>(15); //VC = 10; PC =0 - Default
		//But I can deliberately Allot Virtual segments by giving the size in the parameter (15)
		//Now VC = 15; PC = 0
		//If all the virtual segments are filled, in the next slot VC alloted will be - 15/2 - 7
		//Only advantage - Memory Optimization
		System.out.println(ar); //o/p []
		System.out.println(ar.size()); //o/p - (size of PC)0
		//System.out.println(ar.get(0)); //AIOB Exception
		
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(5);
		marksList.add(1); 
		marksList.add(4); 
		marksList.add(10); 
		marksList.add(13);
		marksList.add(8);
		
		System.out.println(marksList);
		//marksList.remove(1); //removes the 1st indexed value --> 5
		//System.out.println(marksList);
		//If we want to remove value 1 - we need to pass the Object/Datatype as non-primitive type in the brace
					//NOT int but Integer OR Object
		marksList.remove((Integer)1);
		marksList.remove((Object)4);
		System.out.println(marksList);
		
		System.out.println("*****ARRAYLIST Literals*****");
		
		ArrayList<String> browserList = new ArrayList<String>(Arrays.asList("chrome", "firefox", "safari", "edge"));
		System.out.println(browserList);
		System.out.println(browserList.size()); //PC = 4  
		System.out.println(browserList.get(2));
		browserList.remove(1);
		System.out.println(browserList);
		
		for(String e: browserList) {
			System.out.println(e);
				if(e.contains("chrome")) {
					System.out.println("Launch Chrome");
				}
		}
		
		System.out.println("*****");
		
		ArrayList<String> empList = new ArrayList<String>(Arrays.asList("Sharmila", "Bhargav", "Surya", "Dimple", "Veda"));
		System.out.println(empList);
		
		for(int i = empList.size()-1; i>=0; i--) {
			System.out.println(empList.get(i));
		}
		//Print the arrayList in the reverse order - use Collections class
		Collections.reverse(empList);
		System.out.println(empList); //reversed List
		System.out.println("3rd indexed person in the reversed List: " +empList.get(3));
		
		for(String e: empList) {
			System.out.println(e); //How to print arrayList in the reverse order - 
												//use collections first then print it	
		}
		
		//Collections class is applicable for all the data types - Integer, double, String, character
		
		System.out.println("*****");
		
		Integer num[] = {12, 34, 55, 43, 67, 33}; //there is no VC for Static array
		//Convert this array into ArrayList --> Static array to Dynamic Array
		
//		ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(num));
		Arrays.asList(num); //asList - gives us list of integers (Hover mouse over asList)
		
//		List<int[]> numberList = Arrays.asList(num); //int[] - non-primitive
		//<> --> called Generics -- In generics we must ALWAYS write non-primitive data types
										//That's why int[]
		//List - is an interface - An interface is the parent interface of the ArrayList
		
//		System.out.println(numberList.size()); //last line code gives us the LIST OF NO OF ARRAYS
		
//		List<Integer> numList = Arrays.asList(num);
		int i = Arrays.asList(num).size(); // Stores all the static arrays
		System.out.println(i);
		
//		Arrays.asList(num); //num - is an array not an array values 
					//and the return type is list<int[]> -- list of integer arrays not their values
						//we've stores 1 array so the size is 1
		
		List<Integer> numList = Arrays.asList(num); //Change the array name to Integer(non-primitive type)
		System.out.println(numList);
		System.out.println(numList.size()); //PC = 6; VC = 4
		
		//
		String browser[] = {"chrome", "firefox", "safari", "edge"};
		List<String> browserNamesList = Arrays.asList(browser);
		System.out.println(browserNamesList);
		System.out.println(browserNamesList.size());
		
		//
//		System.out.println("****Another way of declaring an ARRAY*****");
//		ArrayList<String> list = new ArrayList<String>() {
//			
//			{
//				add("Java");
//				add("Python");
//				add("Ruby");
//			}	
//		};
//		System.out.println(list);
//		System.out.println(list.size());
//		list.add(3, "C#");
//		list.add("Selenium");
//		System.out.println(list);
//		System.out.println(list.size());
		
	}

}
