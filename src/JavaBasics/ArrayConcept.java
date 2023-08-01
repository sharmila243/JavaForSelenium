package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// array: to store similar data type variables in an array variable

		// 1 integer array
		// lowest index = 0; highest index = n-1; index = n(size of an array)
		// 1D Array

		// Disadvantages of array
		// 1 size is fixed -- Static Array (if size is 4 only 4 values are allowed, if more - Exception)
				// to overcome this we use collections -- ArrayList, HashTable -- Dynamic Array

		// 2 stores only similar data types -- to overcome this we use Object array

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[2]);
		System.out.println(i[3]);

		// System.out.println(i[4]); //ArrayIndexOutOfBoundsException

		System.out.println(i.length); // gives the size of array

		// print all the values of array: use for loop

		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}

		// 2 double array

		double d[] = new double[3];
		d[0] = 11.44;
		d[1] = 32.89;
		d[2] = 54.60;

		System.out.println(d[2]);

		// 3 char array

		char c[] = new char[3];
		c[0] = 'a';
		c[1] = '2';
		c[2] = 'V';

		System.out.println(c[1]);

		// 4 boolean array

		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;

		System.out.println(b[0]);

		// String array

		String s[] = new String[3];
		s[0] = "Sharmila";
		s[1] = "Bhargav";
		s[2] = "Surya";

		System.out.println(s.length);
		System.out.println(s[1]);

		// Object Array - Object is superclass of all the classes
		// used to store different data type values

		Object ob[] = new Object[6];
		ob[0] = "Sharmila";
		ob[1] = 25;
		ob[2] = 'F';
		ob[3] = "24/03/1997";
		ob[4] = 12.33;
		ob[5] = "India";

		System.out.println(ob[5]);
		System.out.println(ob.length);

		for (int p = 0; p < ob.length; p++) {
			System.out.println(ob[p]);
		}

		//Examples:
		//Static Array - Movie tickets, Flight tickets, Days of week, Months of year
		//Dynamic Array - Booking car of an uber - increases and decreases depends on the time of the day
		
		//Online e-commerce application - Myntra - 3 categories - M, W, kids - fixed - Static array
	}

}
