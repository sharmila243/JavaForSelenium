package OOPSConcept_1;

import java.util.ArrayList;

public class Browser { //methodsInJava -->browser_1
	
	//Acceptance criteria WAF:
	//create a function: getEmployeeDevices --> MAC, APple Mouse, Iphone13proMax
	//Want to know how many devices an employee has --> pass the i/p as employee name (String empName)
	//return type - devices list --> can be Array/ ArrayList
			//Since no.of devices varies from person to person --> ArrayList
	
	public ArrayList<String> getDevicesList(String empName) {
		
	System.out.println("Devices list of employee.. " + empName);
	
	ArrayList<String> devList = new ArrayList<String>(); //PC = 0
	
	if(empName.equalsIgnoreCase("Sharmila")) {
		devList.add("Iphone13proMax");
		devList.add("Apple mouse");
		devList.add("Keyboard");
	}
	else if(empName.equalsIgnoreCase("Bhargav")) {
		devList.add("HP Laptop");
		devList.add("Apple watch");
	}
	else if(empName.equalsIgnoreCase("Veda")) {
		devList.add("Airtel SIM");
		}
	else if(empName.equalsIgnoreCase("Vaibhav")) {
		devList.add("Airpods");
		devList.add("MacBook Air");
		devList.add("Apple keyboard");
		devList.add("Samsung S22");
	}
	else {
		System.out.println("Enter the right employee name.. " +empName);
	}
	return devList;
	}
	

	public static void main(String[] args) {
		
		Browser b = new Browser(); 
		
		ArrayList<String> devices = b.getDevicesList("Vaibhav");
		System.out.println(devices);
		
		System.out.println("Total no. of devices.. " + devices.size());
		System.out.println("remove a device from list.. " + devices.remove(1));
		System.out.println(devices);
		System.out.println("Final no. of devices.. " + devices.size());
	}

}
