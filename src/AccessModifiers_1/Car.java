package AccessModifiers_1;

public class Car {
	
	
	public String name;
	protected int price;
	private int mileage;
	String color; //default - default keyword is used for methods inside interfaces 
	
	

	public static void main(String[] args) {

		Car c = new Car();
		c.name = "Lamborghini";
		c.price = 40000;
		c.mileage = 25;
		c.color = "Black";
		
		System.out.println(c.mileage);
		
		
	}

}
