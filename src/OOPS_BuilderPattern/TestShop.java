package OOPS_BuilderPattern;

public class TestShop {

	public static void main(String[] args) {
		
		Shopping sh = new Shopping();
		
		//1.
		sh.login("sharmila24397@gmail.com", "Sharmila123")
				.search("Nike Shoe")
					.addTocart("Nike Shoe")
						.doPayment("9010525844@ybl")
							.generateOrderId()
								.logout();
		
		//2. 
		System.out.println("_________");
		sh.login("sharmila24397@gmail.com", "Sharmila123")
				.search("MacBook Air", 1000)
					.addTocart("MacBook Air")
						.logout();
		
		//3. 
		System.out.println("_________");
		sh.login("sharmila24397@gmail.com", "Sharmila123")
				.search("Apple Iphone")
					.search("macBook Pro")
						.search("Airpods")
							.addTocart("Apple Iphone")
								.doPayment("123412341234", 123)
									.generateOrderId()
										.logout();
		
		//4. 
		System.out.println("_________");
		sh.login("sharmila24397@gmail.com", "Sharmila123")
				.logout();
		
	}

}
