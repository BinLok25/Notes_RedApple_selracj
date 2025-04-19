package dec2023javapracticals;

import java.util.HashMap;

public class HashMapConcept28 {

	public static void main(String[] args) {
		HashMap<String, Integer>empMap = new HashMap<String, Integer>();
		
		empMap.put("Tom", 101);
		empMap.put("lisa", 200);
		
		System.out.println(empMap.size());
		
		System.out.println(empMap.get("Tom"));
		
		empMap.put("lisa", 300);
		
		System.out.println(empMap.get("lisa"));
		
		HashMap<String, String>empData = new HashMap<String, String>();
		
		empData.put("Tom", "SDET1");
		empData.put("Peter", "SDET2");
		empData.put("Ravi", "SDET3");
		empData.put("Lisa", "SDET4");
		empData.put("BinAuto", "SDET Manager");
		empData.put(null, "SDET Manager");
		empData.put(null, "SDET Director");
		
		System.out.println(empData.get(null));
		System.out.println(empData.get("test"));

	}

}
