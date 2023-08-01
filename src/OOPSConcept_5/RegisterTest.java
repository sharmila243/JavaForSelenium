package OOPSConcept_5;

public class RegisterTest {

	public static void main(String[] args) {
		
//		Register reg = new Register(); //cannot create a default object because We have a constructor defined 
		
		//POST CALL
		Register reg = new Register("Sharmila", 26, 7093838986L, "Hyderabad", true);
		
		//GET CALL
		System.out.println(reg.getName());
		System.out.println(reg.getAge());
		System.out.println(reg.getPhoneNumber());
		System.out.println(reg.getCity());
		System.out.println(reg.isPermanent());
		
		System.out.println("*****");
		
		//PUT CALL - Update the value
		reg.setPhoneNumber(9010525844L);
		reg.setCity("Mtl");
		
		//GET CALL
		System.out.println(reg.getName());
		System.out.println(reg.getAge());
		System.out.println(reg.getPhoneNumber());
		System.out.println(reg.getCity());
		System.out.println(reg.isPermanent());
		
		System.out.println("-----");
		
		Register reg1 = new Register("SaiBhargav", 8886789302L);
		
		System.out.println(reg1.getName());
		System.out.println(reg1.getAge());
		System.out.println(reg1.getPhoneNumber());
		System.out.println(reg1.getCity());
		System.out.println(reg1.isPermanent());
		
		//can update the remaining using setter - later
		reg1.setAge(26);
		reg1.setCity("Mtl");
		reg1.setPermanent(true);
		
		System.out.println(reg1.getName());
		System.out.println(reg1.getAge());
		System.out.println(reg1.getPhoneNumber());
		System.out.println(reg1.getCity());
		System.out.println(reg1.isPermanent());
		
		
		
		
		
		
	}

}
