package OOPSConcept_7;

public class ApolloTest {

	public static void main(String[] args) {
		
		ApolloHospital ah = new ApolloHospital();
		
		ah.physioServices();
		ah.cardioServices();
		ah.ENTServices();
		ah.emergencyServices();//This we're getting it from USMedical
		ah.billing();
		
	}

}
