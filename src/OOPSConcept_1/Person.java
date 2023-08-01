package OOPSConcept_1;

public class Person { 
	
	//MethodOverloading: Static/ Compile time Polymorphism (Many forms)
	//within the same class if you have multiple methods
	//1. with the same name 
	//2. with different i/p parameters
	//3. with different types of parameters 
	//4. with the different sequence / order of the parameters
	//5. return type does not matter
	
	
	
	//Can I have same method twice? --> NO (If present, it's called a duplicate method)
	//Can I have same method name with different number of i/p parameters? --> YES
	public void test() { //0 parameterized method
		
	}
	
//	public void test() { //duplicate
		 
//	}
	
	public void test(int a) { //1 i/p parameter - Integer parameter
		
	}
	
//	public int test(int a) { //Still Duplicate because return type does not matter
							 //MethodOverloading purely depends on the method name not the return type
//		return 100;
//	}
	
//	public String test(String name) { //Duplicate
//		return "testing";
//	}
	
	public void test(int a, int b) { //2 i/p parameters - (Integer, Integer)
		
	}
	
	public void test(String a) { //1 i/p parameter - String parameter (NOT DUPLICATE)
		
	}
	
	public void test(String a, int b) { //2 i/p parameters - (String, Integer)
		
	}
	
	public void test(int a, String b) { //2 i/p parameters - (Integer, String) - NOT DUPLICATE because of the order
		
	}
	
	public void test(int a, String b, boolean flag) { //3 i/p parameters - (Integer, String, Integer)
		
	}
	
	//Real time use cases: Method Overloading
	//Amazon: search should be overloaded
	public void search() {
		
	}
	
	public void search(String name) {
		System.out.println(name);
	}
	
	public void search(String name, int price) {
		System.out.println(name + " " + price);
	}
	
	public void search(String name, int price, String color) {
		System.out.println(name +" "+ price +" "+ color);
	}
	
	//login method can be overloaded
	public void login(){
		
	}
	
	public void login(String userName, String pwd){
		
	}

	public void login(String userName, String pwd, String role){
		
	}

	public void login(String phone, int otp) {
		
	}
	
	//payment 
	public void doPayment(String cc, int cvv) {
		
	}
	
	public void doPayment(String upi) {
		
	}
	
	public void doPayment(String cc, int cvv, int otp) {
		
	}
	
	//Uber - booking (STt.pt, dr.pt0
	public void booking(String stPoint, String dropPoint) {
		
	}
	
	public void booking(String stPoint, String dropPoint, String carType) {
		
	}
	
	public void booking(String stPoint, String dropPoint, String carType, int Persons) {
		
	}
	
	
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		//which method has to be called is already decided by during compile time
		p.search("MacBook");
		p.search("SamsungS22", 700);
		p.search("NikeShoe", 400, "White");
			
	}

}
