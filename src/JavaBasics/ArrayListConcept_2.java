package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept_2 {

	public static void main(String[] args) {
			
		ArrayList<String> empList = new ArrayList<String>();
		
		empList.add("Sharmila"); //0
		empList.add("Bhargav"); //1
		empList.add("Surya"); //2
		empList.add("Tom"); //3
		empList.add("Dimple"); //4
		empList.add("Veda"); //5
		empList.add("Tom"); //6 - duplicates are allowed
		
		System.out.println(empList);
		
		//If I want to add something in between
		empList.add(3, "Dimple"); //index 3 "TOM' shifted to 4th index	
		System.out.println(empList);
		
		//If I add a String to the array w/o any index
		empList.add("KSB"); //adds to the last
		
		System.out.println(empList.get(4)); //Tom shifted from index 3 - 4 -- we're not losing the data 
	
		empList.remove("Tom"); //[S, B, S, D, T, D, V, T, K] - 1st tom - removed= [s,b,s,d,d,v,t,k]
		System.out.println(empList);
		
		System.out.println("*****");
		empList.remove(4); //4th index from above commented array is removed --> [s,b,s,d,v,t,k]
		System.out.println(empList); //Till here current size is 7
		
		//if I add something at 10th index leaving 8 9 index's
		//empList.add(10, "Selenium"); //AIOB Exception
		
		empList.remove(5);
		System.out.println(empList); //Final Array - [S,B,S,D,V,K]
		
		//we can also add null values to the array list 
		//multiple null values also added 
		//empList.add(null);
		
		for(int i=empList.size()-1; i>=0; i--) {
			System.out.println(empList.get(i));
				if(empList.get(i).equals("KSB")) {
					System.out.println("Elder than all");
				}
		}
		
	}	

}
