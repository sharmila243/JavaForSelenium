package OOPSConcept_7;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		
		//Call variables? - static in nature by default, so
		//why static in nature? - If not, I need to create an object to access it but I cannot create the object of an interface
		System.out.println(USMedical.min_fee);//accessible with interface
		System.out.println(FortisHospital.min_fee);//accessible with child class name - Inherited
		
		//If FortisHospital wants to change the min_fee, manipulate it, we want 100 dollars? 
		//Is that possible? - NO, because the variable declared in Interface will be static and final in nature
		
//		FortisHospital.min_fee = 100; //variable min_fee cannot be reassigned
		
		//US
		fh.physioServices();
		fh.cardioServices();
		fh.ENTServices();
		//UK
		fh.neuroServices();
		fh.orthoServices();
		//Indian
		fh.oncologyServices();
		fh.dentalServices();
		fh.gyncoServices();
		
		fh.emergencyServices();//common method
		
		fh.medicaltraining();//Individual method
		fh.medicalInsurance();//Individual method
		
		fh.covidVaccination();
		fh.medicalNews();
		
		fh.medicalRD();
		
		//Can I create the object of USMedical Interface??
		//NO, Why?
		//User does not go the Interface, user goes to the hospital
		//In OOP - implementation is always done at the class level not at the interface
		//If we're allowed to create the object of an interface, user goes to the interface
				//Will be any method body/ business logic over there in the Interface? NO
				//That is the reason why we are not allowed to create the object of an interface 
//		USMedical us = new USMedical(); //Cannot instantiate the type USMedical
		
		System.out.println("*****TOP CASTING*****");
		//child class object referred by parent interface reference variable 
		USMedical us = new FortisHospital();
		us.physioServices();
		us.cardioServices();
		us.ENTServices();
		us.emergencyServices();
		
		us.covidVaccination();
		us.medicalNews();
		
		
//		us.orthoServices();//Not accessible
//		us.gynoServices();//Not accessible
		//Even Individual methods of FH are also not accessible
		
		UKMedical uk = new FortisHospital();
		uk.neuroServices();
		uk.orthoServices();
		uk.emergencyServices();
		
		IndianMedical in = new FortisHospital();
		in.dentalServices();
		in.gyncoServices();
		in.oncologyServices();
		in.emergencyServices();
		
		System.out.println("*****DOWN CASTING*****");
//		FortisHospital fh1 = new USMedical(); //we cannot create the object of the interface 
		//So DOWN CASTING is not possible
		
		
		//FROM JDK 1.8
		USMedical.USMedPharmacy();
//		FortisHospital.USMedPharmacy(); //cannot be inherited
		
		System.out.println(FortisHospital.min_fee);
		//I can access static variables but not static methods with child class name.
		
		//
		fh.billing();
		

		
		
		
	}

}
