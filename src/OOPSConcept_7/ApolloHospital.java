package OOPSConcept_7;

public class ApolloHospital implements USMedical {

	@Override
	public void physioServices() {
		System.out.println("Apollo -- physioServices");
	}

	@Override
	public void cardioServices() {
		System.out.println("Apollo -- cardioServices");
	}

	@Override
	public void ENTServices() {
		System.out.println("Apollo -- ENTServices");
	}

	@Override
	public void emergencyServices() {
		System.out.println("Apollo -- emergencyServices");
	}
	
	//own method
	public void billing() {
		
	}

	
	//WHO method
	@Override
	public void covidVaccination() {
		System.out.println("WHO - CovidVaccination");		
	}

	//UN
	@Override
	public void medicalNews() {
		System.out.println("UN -- medicalNews");		
	}

}
