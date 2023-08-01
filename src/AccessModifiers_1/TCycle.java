package AccessModifiers_1;

public class TCycle {

	public static void main(String[] args) {
		
		Car c = new Car();
		//Same package non sub-class
		
		System.out.println(c.name); //public 
		System.out.println(c.price); //protected
		System.out.println(c.color); //default
		
		
		
		
		
	}

}
