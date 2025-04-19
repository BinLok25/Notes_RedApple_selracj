package dec2023javapracticals;

import java.util.LinkedHashMap;

public class LinkedHashMapConcept29 {

	public static void main(String[] args) {
		LinkedHashMap<String, String> empData = new LinkedHashMap<String, String>();
		
		//it maintains the insertion order
//		empData.put("", "");
		empData.put("Tom", "SDET1");
		empData.put("Peter", "SDET2");
		empData.put("Ravi", "SDET3");
		empData.put("Lisa", "SDET4");
		empData.put("Salim", "SDET5");
		empData.put("null", "SDET Manager");
		
		System.out.println(empData);

	}

}
