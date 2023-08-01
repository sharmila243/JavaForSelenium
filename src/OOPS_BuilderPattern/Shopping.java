package OOPS_BuilderPattern;

public class Shopping {

	public Shopping login() {
		System.out.println("User is logged in");
		return this; // return the current class object, so change the void to class name
	}

	public Shopping login(String username, String pwd) {
		System.out.println("Logged in with " + username + ":" + pwd);
		return this;

	}

	public Shopping search(String productName) {
		System.out.println("searching " + productName);
		return this;

	}

	public Shopping search(String productName, int price) {
		System.out.println("searching " + productName + ":" + price);
		return this;

	}

	public Shopping addTocart(String productName) {
		System.out.println("addToCart " + productName);
		return this;

	}

	public Shopping doPayment(String cc, int cvv) {
		System.out.println("paying with " + cc + ":" + cvv);
		return this;

	}

	public Shopping doPayment(String upi) {
		System.out.println("paying with " + upi);
		return this;

	}

	public Shopping generateOrderId() {
		System.out.println("generation the order: " + 12345);
		return this;

	}

	public Shopping logout() {
		System.out.println("logged out");
		return this;

	}

}
