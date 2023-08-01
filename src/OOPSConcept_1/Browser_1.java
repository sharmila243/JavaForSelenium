package OOPSConcept_1;

public class Browser_1 { //MethodsInJava --> Browser_2

	//Acceptance criteria WAF:
	//create a function: getDevicesList --> MAC, APple Mouse, Iphone13proMax
	//Want to know how many devices an employee has --> pass the i/p as employee name (String empName)
	//return type - devices list --> can be Array/ ArrayList
		//Assignment -- do it with the static array
	
	public String[] getdevicesList(String empName) {
		System.out.println("Devices list of employee.. " +empName);
		
		String devList[] = new String[5];
		
		if(empName.equalsIgnoreCase("Sharmila")) {
			devList[0] = "Iphone13proMax";
			devList[1] = "Apple Mouse"; 
			devList[2] = "Apple keyboard";
			devList[3] = "Apple watch";
		}
		else if(empName.equalsIgnoreCase("Bhargav")) {
			devList[0] = "Samsung S22"; 
			devList[1] = "Airpods";
			devList[2] = "Bose Headphones"; 
		}
		else if(empName.equalsIgnoreCase("Kalyan"))	{
			devList[0] = "OnePlus nord"; 
			devList[1] = "Internet router";
		}
		else if(empName.equalsIgnoreCase("Vaibhav")) {
			devList[0] = "MacBook"; 
			devList[1] = "Apple keyboard";
			devList[2] = "iphone12";
			devList[3] = "Sim card";
			devList[4] = "Speaker"; 
//			devList[5] = "HardDisk";
		}
		else {
			System.out.println("Pass the right employee name.. " +empName);
		}
		return devList;
		
	}
	
	public static void main(String[] args) {

		Browser_1 b = new Browser_1();
		String str[] = b.getdevicesList("naveen");
		for(String e: str) {
			System.out.println(e);
		}
		System.out.println(str.length);
		
	}

}
