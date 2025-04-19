package dec2023javapracticals;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcept29 {

	public static void main(String[] args) {
		TreeMap<String, String> empData = new TreeMap<String, String>(Collections.reverseOrder());
		
		empData.put("Tom", "SDET1");
		empData.put("Peter", "SDET2");
		empData.put("Ravi", "SDET3");
		empData.put("Lisa", "SDET4");
		empData.put("Praveen", "SDET4");
		empData.put("Amit", "SDET5");
//		empData.put("arpit", "SDET6");
//		empData.put("ravi", "SDET7");
//		empData.put("1", "SDET7");
//		empData.put("2", "SDET8");
//		empData.put("$", "SDET8");
		//empData.put(null, "SDET Manager"); //null key - not allowed
		empData.put("selenium", "null");
		
		System.out.println(empData);
		
		//for loop:
		for(Map.Entry<String, String>entry:empData.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println("--------------------");
		
		//forEach loop:
		empData.forEach((k,v) -> System.out.println(k + ":"+v));

	}

}
