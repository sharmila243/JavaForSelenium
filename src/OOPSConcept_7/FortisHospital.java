package OOPSConcept_7;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical{ //Multiple Inheritance
	
	//FH is the child of multiple Interfaces
	//and also FH is also the child of Medical parent class
	//extends - first 
	//implements - next
	
	//Child class (FH) can extend only 1 parent class & can have multiple parent interfaces

	//US
	@Override
	public void physioServices() {
		System.out.println("fh -- physioServices");
	}

	@Override
	public void cardioServices() {
		System.out.println("fh -- cardioServices");
	}

	@Override
	public void ENTServices() {
		System.out.println("fh -- ENTServices");
	}
	
	//UK
	@Override
	public void neuroServices() {
		System.out.println("fh -- neuroServices");
	}

	@Override
	public void orthoServices() {
		System.out.println("fh -- orthoServices");
	}
	
	//Indian
	@Override
	public void oncologyServices() {
		System.out.println("fh -- oncologyServices");
	}

	@Override
	public void dentalServices() {
		System.out.println("fh -- dentalServices");
	}

	@Override
	public void gyncoServices() {
		System.out.println("fh -- gyncoServices");
	}
	
	//Individual methods
	public void medicaltraining() {
		System.out.println("fh -- MedicalTraining");
	}
	
	public void medicalInsurance() {
		System.out.println("fh -- MedicalInsurance");
	}

	//I need to implement it once, I need not implement in thrice saying all the interfaces has the emergencyServices method
	//If I call it thrice, it becomes duplicate method
	//method body, I can say, if country name is US Call 911, If country name is India call 108, Etc so on
	@Override
	public void emergencyServices() {
		System.out.println("fh -- emergencyServices");		
	}

	
	//Parent Interface - WHO method
	@Override
	public void covidVaccination() {
		System.out.println("WHO - CovidVaccination");
	}

	//UN
	@Override
	public void medicalNews() {
		System.out.println("UN -- medicalNews");
	}
	
	//Can default method be overridden/ inherited? - default methods are only for Interfaces
	@Override //NO Error - so Can be overridden after changing the visibility to public
	public void billing() {
		System.out.println("FH -- billing");
	}
	
	

	
		

}
