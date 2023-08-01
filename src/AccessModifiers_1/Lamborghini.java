package AccessModifiers_1;

public class Lamborghini extends Car{ //sub-class
		//same package sub-class

	public static void main(String[] args) {
		
		Lamborghini l = new Lamborghini();
		
		System.out.println(l.name); //public 
		System.out.println(l.price); //protected
		System.out.println(l.color); //default 
		
		//cannot access private variable
		

	}

}
