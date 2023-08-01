package OOPSConcept_7;

public class Z {
	
	//Diamond problem is solved here 
	//Multiple Inheritance is solved here with Interface
	
	//If I'm the owner of the Hospital and want to open multiple branches in different countries
	//FortisHospital 
	//FortisHospital class is now the child of multiple Interfaces - use implements keyword
	//Interface is some kind of Rules and Regulations that needs to be followed/ implemented, only then you can Open a branch here 
	//Let's say Interfaces in this case are medical interfaces
	//USMedical, UKMedical, IndianMedical, BrazilMedical - Interfaces
	//A class (FortisHospital) must implement all the methods, each and every method of the interfaces 
	//Interface cannot define the business logic, it will define only what kind of business you should have
	//it is our responsibility to provide the business logic in the class(FortisHospital)
	//Interface cannot have method bodies as all the methods are abstract in nature.
	//FH - okay we really want to open a branch in the US, and we would like to implement all your methods/override all your methods.
	//FH can have it's own individual methods
	
	//If after 2 years rules in US has changed, the FH must also adopt/update to the new rules.
	
	//A class can extend single parent class(extends) and implement multiple interfaces(implements) - MULTIPLE INHERITANCE
	
	//If I want to build one more hospital in US, Again then I need to follow US MEdical Regulations and
			//I can have my own hospital methods (MAX, APOLLO)
	
	//Abstraction:
	//1. USMedical
	//2. UKMedical
	//3. IndianMedical
	//4. FortisHospital
	//5. TestHospital
	//6. ApolloHospital
	//7. ApolloTest
	//8. WHO
	//9. UN
	//10. Medical
	//11. Automation
	
	//Can I create a constructor in Interface?
	//NO, why?
	//Since we cannot create the object of an interface, constructor will be called only by creating an object
		//which is not possible in the interface, there is no concept called Constructor in Interface.
	
	
	//child class extends parent class
	//class implements interface 
	//interface extends interface
	
	
	//Interface is not defining any template of the class
	//Class is the blue print of all the objects 
	//Interface is not the blue print
	//from the classes object should be produced not from the Interfaces
		//that is the reason why constructors are not allowed in interfaces

}
