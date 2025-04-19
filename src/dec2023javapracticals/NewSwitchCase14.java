package dec2023javapracticals;

import java.util.ArrayList;

public class NewSwitchCase14 {
    
	//WAF: 
	//function name: getDevicesList
	//input param: empName
	//return: ArrayList<String>devicesList
	
	public ArrayList<String> getDevicesList(String empName) {
		System.out.println("getting devices list for emp: "+empName);
		
		ArrayList<String> devicesList = new ArrayList<String>();
		
		switch (empName.toLowerCase().trim()) {
		case "pallavi":
			devicesList.add("Macbook Pro");
			devicesList.add("Macbook Air");
			devicesList.add("iphone");
			break;
		case "sudheer":
			devicesList.add("Windows Lenovo");
			devicesList.add("Samsung s10");
		case "saida":
			devicesList.add("Airtel SIM");

		default:
			System.out.println("plz pass the righ emp name...empname not found..."+empName);		
			break;
		}
		return devicesList;
	}
	public static void main(String[] args) {
		NewSwitchCase14 obj = new NewSwitchCase14();
		ArrayList<String> actDevList = obj.getDevicesList("pallavi");
		
		System.out.println(actDevList);
		

	}

}
