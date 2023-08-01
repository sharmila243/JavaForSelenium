package JavaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListConcept_4 {

	public static void main(String[] args) {
		
		//we dont't create this List.of() array 
		
		//List - Interface - have a method but does not an method body
		List<Integer> nList = List.of(1,2,3,4,5); //List.of() - fixed list --> Called Immutables 	
													//no manipulations -- add/remove
							//Static Arraylist/ Constant List/ Immutable ArrayList
		System.out.println(nList);
		System.out.println(nList.size());
//		nList.add(6);		//UnsupportedOperation exception 
//		System.out.println(nList); 

		System.out.println("*****");
		
		ArrayList<String> monthsList = new ArrayList<String>();
		monthsList.add("March");
		monthsList.add("June");
		monthsList.add("August");
		monthsList.add("December");
		
		System.out.println(monthsList.size()); //VC = 6; PC = 4
		monthsList.trimToSize(); //trim the VC to the current PC --> VC = 4; PC = 4 already
									//next VC alloted - PC= 4/2 = 2
		
		Collections.swap(monthsList, 0, 2);
		System.out.println(monthsList);
		
		Collections.reverse(monthsList);
		System.out.println(monthsList);
		
		Collections.sort(monthsList);
		System.out.println("After sorting: " +monthsList);
		
		List<Object> ls = Collections.emptyList();
		System.out.println(ls.size());
		System.out.println(ls);
	
		System.out.println("*****");
		//Create a number list -- 1, 4, 55, 73, 88, 25
		//Print in sorting order - Ascending order 
		//Print in sorting order - descending order - reverse using collections
		
		ArrayList<Integer> pp = new ArrayList<Integer>(Arrays.asList(1, 4, 55, 73, 88, 25)); 
		Collections.sort(pp);
		System.out.println(pp);
		Collections.reverse(pp);
		System.out.println(pp);
		
		System.out.println("*****");
		
		//add a value in the middle of the arraylist
		ArrayList<Integer> ll = new ArrayList<Integer>(Arrays.asList(1, 2, 5, 6, 8, 6, 9));
		System.out.println(ll);
		System.out.println(ll.size());
		int midValue = (ll.size())/2;
		ll.add(midValue, 100);
		System.out.println(ll);
		
		ll.add(midValue+2, 2345);
		System.out.println(ll);
	}

}
