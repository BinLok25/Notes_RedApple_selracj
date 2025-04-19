package impcodeforaninterview;

import java.util.HashMap;
import java.util.Map;

public class HashMapConceptWithIteration29 {

	public static void main(String[] args) {
		//HM: non-order based collection:
		HashMap<String, String> empData = new HashMap<String, String>();
		
		empData.put("Tom", "SDET1");
		empData.put("Peter", "SDET2");
		empData.put("Ravi", "SDET3");
		empData.put("Lisa", "SDET4");
		empData.put("Praveen", "SDET4");
		empData.put(null, "SDET Manager");
		empData.put(null, "SDET Director");
//		empData.put(null, null);
//		empData.put("Prateek", null);
//		empData.put("Usha", null);
		empData.put("Tom", "SDET1");
//		empData.put("Tom", "SDET1");

		System.out.println(empData.get(null));
		System.out.println(empData.get("Praveen"));
		
		System.out.println(empData);
		
		//null keys = 1
		//null values = multiple
		
		for(Map.Entry<String, String>entry : empData.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println("----------------------------------");
		
		//for each method: acts as a forEach loop
		empData.forEach((a,b)-> System.out.println(a+":"+b));
	}

}
