package OOPSConcept_7;

public interface WHO { //Parent Interface of USMedical
	
	//No method body 
	//Why USMedical is extending WHO interface, why cannot implement?
	//USMedical is not implementing any business logic because it is an interface
	//SO USMedical child interface extends WHO Parent interface
	
	//The who will implement WHO methods? 
	//It is GrandCHILD class's responsibility to implement not only US Medical interface but also WHO's interface methods 
	
	public void covidVaccination();

}
