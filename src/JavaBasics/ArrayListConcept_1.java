package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept_1 {

	public static void main(String[] args) {
		
		//Integer Data Type
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(75);
		marksList.add(73);
		marksList.add(100);

		System.out.println(marksList);
		for (int e : marksList) {
			System.out.println(e);
				if (e == 100) {
				System.out.println("Topper");
			}
		}

		for (int i = 0; i < marksList.size(); i++) {
			System.out.println(marksList.get(i));
				if (marksList.get(i).equals(100)) {
				System.out.println("A+ Grade");
			}

		}
		
		//Object data Type
		ArrayList<Object> empDataList = new ArrayList<Object>(); 
		empDataList.add("Veda");
		empDataList.add(25);
		empDataList.add("CS"); 
		empDataList.add('F'); 
		empDataList.add(07.09); 
		empDataList.add(false);
		
		System.out.println(empDataList);
		
		//foreach lsoop
		for(Object e: empDataList) {
			System.out.println(e);
				if(e.equals(7.09)) {
					System.out.println("DOB");
				}
		}
		
		//for loop
		for(int i=0; i<empDataList.size(); i++) {
			System.out.println(empDataList.get(i));
				if(empDataList.get(i).equals(25)){
						System.out.println("Age is greater than 20");
						break;
				}
		}
		
	}

}
