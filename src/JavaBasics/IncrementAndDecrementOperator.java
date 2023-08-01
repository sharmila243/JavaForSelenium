package JavaBasics;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		
		//++, --
		
		//1. Post Increment - first assign and then increase
		int a = 1;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		
		int c = -99; 
		int d = c++;
		System.out.println(c);
		System.out.println(d);
		
		//2. Pre-Increment - first increase and then assign
		int x = 1; 
		int y = ++x; 
		System.out.println(x);
		System.out.println(y);
		
		int g = -99; 
		int h = ++g;
		System.out.println(g);
		System.out.println(h);
		
		double d1 = 1.1; 
		double d2 = ++d1; 
		double d3 = d1++;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		char c1 = 'a'; 
		char c2 = ++c1; 
		System.out.println(c1);
		System.out.println(c2);
		
		//3. Post Decrement
		int p = 2; 
		int q = p--; 
		System.out.println(p);
		System.out.println(q);
		
		int p1 = -99; 
		int q1 = p1--; 
		System.out.println(p1);
		System.out.println(q1);
		
		//4. Pre-Decrement
		int h1 = 2; 
		int h2 = --h1; 
		System.out.println(h1);
		System.out.println(h2);
		
		int w1 = -96; 
		int w2 = --w1; 
		System.out.println(w1);
		System.out.println(w2);
		
		System.out.println("*******");
		int test = 5; 
		System.out.println(test++); //test value is given to print first and then increase the value by 1 
		System.out.println(test);
		
		int pop = 8; 
		System.out.println(++pop);
		System.out.println(pop);
		
		System.out.println("*******");
		char ch = '0'; //48 ASCII value
		System.out.println(++ch);
		
		char ch1 = '$'; 
		System.out.println((int)ch1); //$ - 36
		System.out.println(++ch1); //first increase and then assign, 37 - %
		System.out.println((int)'%');
		
		//Not applicable for boolean and String
		//boolean flag = true; 
		//System.out.println(flag++); // compilation error
		
		//String s = "hello"; 
		//System.out.println(s++); // compilation error
		
		int e1 = 2; 
		int e2 = e1++ + ++e1; // 2 + 4
		System.out.println(e1); //4 
		System.out.println(e2);//6 
		
		int l1 = 2; 
		int l2 = l1++ - l1++ + l1--;
				// 2 - 3 + 4
		System.out.println(l1);//3
		System.out.println(l2);//3
		
		
		int s1 = 1; 
		int s2 = 2; 
		System.out.println(--s2 - ++s1 + ++s2 - --s1);
						// 1 - 2 + 2 - 1
		System.out.println(s1);//1
		System.out.println(s2);//2
		
		int i = 19, j = 29, k;
		k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++; 
		  //19 - 18 + 28 - 29 + 18 - 29 + 19 - 28
		System.out.println("value of i: " + i); //19
		System.out.println("value of j: " + j); //29
		System.out.println("value of k: " + k); // -20
		
		}

}
