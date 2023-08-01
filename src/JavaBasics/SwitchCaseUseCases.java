package JavaBasics;

public class SwitchCaseUseCases {

	public static void main(String[] args) {
		
		
		//switch not suitable for double, boolean, long
		
		//aeiou
		char alphabet = 'c'; 
		switch (alphabet) {
		case 'a':
			System.out.println("Vowel");
			break;

		case 'e':
			System.out.println("Vowel");
			break;
			
		case 'i':
			System.out.println("Vowel");
			break;
			
		case 'o':
			System.out.println("Vowel");
			break;
			
		case 'u':
			System.out.println("Vowel");
			break;
		
		default:
			System.out.println("Consonant");
			break;
		}
		
		//env - prod, qa, dev, stage, uat
		String envName = " QA "; 
		switch (envName.trim().toLowerCase()) { 
		
		//trim - delete all the spaces first to the corners  
		//qa(convert to lower case)
		
		case "qa":
			System.out.println("Run it on qa");
			break;
			
		case "dev":
			System.out.println("Run it on dev");
			break;
		
		case "prod":
			System.out.println("Run it on prod");
			break;
		
		case "uat":
			System.out.println("Run it on uat");
			break;
		
		default:
			System.out.println("no env is found.. "+ envName);
			break;
		}
		
		//cross browser testing: SwitchCasestatement
		//Days of a week/months in a year - switch (few no. of cases)
		
		//booking app - Uber
		//Nested switch Case
		
		String carType = "SUV"; 
		int noOfPersons = 6;
		switch (carType) {
		case "mini":
			System.out.println("mini car");
			if(noOfPersons<4) {
				System.out.println("Mini is allocated");
			}
			else {
				System.out.println("Book a sedan/SUV");
			}
			break;
			
		case "SUV":
			if(noOfPersons>4) {
				
			System.out.println("SUV");
			switch (noOfPersons) {
			case 6: 
				System.out.println("Sufficient for 6 people, extra price, luggage is carried on the top");
				break; 
				
			case 5:
				System.out.println("Sufficient w/o Luggage");
				break;
			
			case 4:
				System.out.println("Sufficient with Luggage");

			default:
				break;
			}
			}
			break;
			
		case "UberXL":
			System.out.println("UberXL");
			break;
			
		default:
			System.out.println("Enter proper carType");
			break;
		}
		
		//Examples:
		//User based permission for an app / RBAC(Role Based Access Permission) -
				// admin user, customer user, seller, partner, vendor, distributor
		//Run test cases - Sanity, Smoke, Regression, production regression test cases
		//Loan Type - Home, Car, Education, Personal
		
	}

}
