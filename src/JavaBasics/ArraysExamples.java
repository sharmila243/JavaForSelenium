package JavaBasics;

import java.util.Arrays;

public class ArraysExamples {

	public static void main(String[] args) {
		
		//Online e-commerce - Static array
		//Myntra - M, W, Kids - fixed 3 categories
		
		//Cricinfo - 11 + 4 extra players - fixed no. of players 
		//Specific player
				//name, age, country, runs, strike rate
		//if I want to display this data on any website or application
		Object player[] = new Object[5];
		player[0] = "Rashid Khan"; 
		player[1] = 35; 
		player[2] = "AFG - Afghanistan"; 
		player[3] = 5000; 
		player[4] = 112.33; 
		
		System.out.println(Arrays.toString(player));
		
		//if we have 100 players, we need to create 100 object arrays
				//we solve it with the help of 
					//Collections
					//Dynamic array
					//Classes and Objects concept
		
		Object player1[] = new Object[5]; // I dont have much data available
		player1[0] = "Rinku Singh"; 
		player1[1] = 25; 
		
		System.out.println(Arrays.toString(player1));
			//default values go null since object is a non-primitive data type
		
		System.out.println("*****");
		
		int num[] = {1, 20, 43, 56, 82, 22, 30}; 
		System.out.println(Arrays.toString(num));
		
		num[4] = 1000;  // 82 is now replaced by 1000 
		System.out.println(Arrays.toString(num));
		
		//delete an element from an array
		int removeIndex = 6; 
		for(int i = removeIndex; i<num.length-1; i++) {
			num[i] = num[i+1]; 
		}
		System.out.println(Arrays.toString(num));
		
	}

}
