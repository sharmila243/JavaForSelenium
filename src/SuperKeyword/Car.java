package SuperKeyword;

public class Car extends Vehicle{
	
	int min_speed = 100;
	
	
	public Car() {
		this(10);
		System.out.println("Car -- default Constructor");
	}
	
	public Car(int i) {
		System.out.println("Car -- Constructor: " +i);
	}
	
	
	public void speed() {
		System.out.println("Car -- speed");
	}
	
	public static void ABS() {
		System.out.println("Car -- ABS");
	}
	
	
}
