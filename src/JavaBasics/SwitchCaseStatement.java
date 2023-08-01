package JavaBasics;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		
		String browser = "chrome"; 
		
		switch (browser) {
		case "chrome":
			System.out.println("Launch Chrome");
			break;
		
		case "firefox":
			System.out.println("Launch firefox");
			break;
		
		case "safari":
			System.out.println("Launch safari");
			break;
		
		case "edge":
			System.out.println("Launch Edge");
			break;
		
		default:
			System.out.println("Please pass the right browser.. "+ browser);
			break;
		}
		
		
	}

}
