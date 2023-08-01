package SuperKeyword;

public class FH implements USMedical {

	
	int min_fee = 200;
	
	
	@Override
	public void neuroServices() {
		System.out.println("FH -- neuroServices");
		USMedical.billing();
	}

	
}
