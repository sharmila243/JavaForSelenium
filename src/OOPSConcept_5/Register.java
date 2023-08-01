package OOPSConcept_5;

public class Register { //template - pvt varibales, combination of multiple constructors, public getters/setters
	
	//POJO - Plain Old Java Objects- cannot be the child of any class - see template
		//Register class do not extend to any class
	//I want to prevent user updating the values, only the initialized are the final values 
			//In that case I will not provide setters, that should work
	
	private String name;
	private int age;
	private long phoneNumber;
	private String city;
	private boolean isPermanent;

	
	//Constructor - Restricts the creation of unnecessary objects
	public Register(String name, int age, long phoneNumber, String city, boolean isPermanent) {
				//User having all the above values only can register 
						//If user has only name, phonenumber and city and wants to register - he cannot with the constructor above - restricting unnecessary object creation
						//but if there is another constructor with name, phonenumber and city - he can register
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.isPermanent = isPermanent;
	}
	
	
	
	public Register(String name, long phoneNumber) { //so otp can be sent
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	
	//purpose of constructor and setter is same, then what is the need of setter here???
		//purpose is If there is any update, If I need to update any variable I can use setVariable setter 

	//Getter and Setter - public always
	//Getter - mandatory, if all the class variables are private and there is a constructor, how to get the values??
	//setter - we can avoid, we can do the same thing using a constructor
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isPermanent() {
		return isPermanent;
	}

	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}
	
	
	

}
