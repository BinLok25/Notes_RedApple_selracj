package impcodeforaninterview;

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
//		empData.put("arpit", "SDET5");//first all capital cases taken then smaller
//		empData.put("ravi", "SDET3");
//		empData.put("1", "SDET7");
//		empData.put("2", "SDET8");
//		empData.put("3", "SDET9");
		empData.put("Sripathi", null);
//		empData.put(null, "SDET9");//Null Pointer Exception at line 23
				
		System.out.println(empData);
		
		for(Map.Entry<String, String> entry: empData.entrySet()) {
			System.out.println(entry.getKey()+":"+ entry.getValue());
		}
		System.out.println("-------------------------------");
		
		empData.forEach((a,b) -> System.out.println(a + ":" +b));

	}

}
