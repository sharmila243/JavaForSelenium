package OOPSConcept_1;

public class Testing { //MethodsInJava --> broswer.java
	
	//Acceptance criteria
	//launch a browser --> chrome, firefox, edge, safari
	//statement --> launch browser
	//boolean return type --> if the browser is launched or not --> true, false
	//launchBrowser(String browserName) --> this returns boolean
	
	public boolean launchBrowser(String browserName) {
		
		System.out.println("Launching the browser.. " + browserName);
		
		boolean flag = true;
				//If I maintain flag = false, foe every switch case we need to write flag = true
		browserName = browserName.trim().toLowerCase();
		
		switch (browserName) {
		
		case "chrome":
			System.out.println("Launch chrome.. Pass");
			break;
		case "ff":
			System.out.println("Launch ff.. Pass");
			break;
		case "safari":
			System.out.println("Launch safari.. Pass");
			break;
		case "edge":
			System.out.println("Launch edge.. Pass");
			break;

		default:
			System.out.println("Please pass the right browser.. " + browserName);
			flag = false;
			break;
		}
		
		return flag;
	}
	
	//multiple returns 
	
	public boolean launchBrowserTest(String browserName) {
		
		System.out.println("Launching the browser.. " + browserName);

		browserName = browserName.trim().toLowerCase();

		switch (browserName) {
		
		
		case "chrome":
			System.out.println("Launch chrome.. Pass");
			return true; 
			//scope of the return is now limited to only this switch case
			//return and break --> both will break the loop, so cannot be written together --> so remove break
//			break; //unreachable code
		case "ff":
			System.out.println("Launch ff.. Pass");
			return true;
		case "safari":
			System.out.println("Launch safari.. Pass");
			return true;
		case "edge":
			System.out.println("Launch edge.. Pass");
			return true;

		default:
			System.out.println("Please pass the right browser.. " + browserName);
			return false;
		}
		
	}

	public static void main(String[] args) {
			
		Testing test = new Testing();
		
		boolean b = test.launchBrowser("OPERA"); 
					//If we pass something which goes to the default case,
					//initialize flag as false in the default case to come out of the switch case
					//If not, flag becomes always true and if condition gets executed
		System.out.println(b);
					
		if(b == true) {										//Instead of this we can directly say
															//if(test.launchBrowser("___")){
																		//}
			System.out.println("Enter the URL");
		}
		
		System.out.println("*****");
		
		if(test.launchBrowserTest("opera")){
			System.out.println("URL entered");
		}
	}

}
