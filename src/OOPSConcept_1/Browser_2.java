package OOPSConcept_1;

import java.util.ArrayList;

public class Browser_2 { //(next) --> Person.java

	// Acceptance criteria WAF:
	// create a function: getEmployeeDevices --> MAC, APple Mouse, Iphone13proMax
	// Want to know how many devices an employee has --> pass the i/p as employee
	// name (String empName)
	// return type - devices list --> can be Array/ ArrayList
				// Since no.of devices varies from person to person --> ArrayList

	public ArrayList<String> getEmployeeDevices(String empName) {
		System.out.println("Devices list of employee.. " + empName);
		
		ArrayList<String> devList = new ArrayList<String>(); 
		
		switch (empName) {
		
		case "Sharmila":
			devList.add("MacBook");
			devList.add("iphone14");
			devList.add("Airpods");
			break;
			
		case "Bhargav":
			devList.add("SamSung S22");
			devList.add("Airtel SIM");
			break;
			
		case "Surya":
			devList.add("Apple Mouse");
			devList.add("Apple Keyboard");
			devList.add("Airpods");
			devList.add("Headphones");
			break;
			
		case "Dimple":
			devList.add("MacBook PRO");
			break;

		default:
			System.out.println("Enter the right employee name.. " + empName);
			break;
		}
		 return devList;
		
	}
	
	public static void main(String[] args) {

		Browser_2 b = new Browser_2();
		ArrayList<String> devices = b.getEmployeeDevices("Naveen");
		System.out.println(devices);
		System.out.println(devices.size());
		
		
	}

}
