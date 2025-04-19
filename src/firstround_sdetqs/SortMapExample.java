package firstround_sdetqs;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortMapExample {
	
	
		  public static Map<String, String> sortMap(Map<String, String> map) {
		        List<Map.Entry<String, String>> capitalList = new LinkedList<>(map.entrySet
		());
		        Collections.sort(capitalList, (o1, o2) -> o1.getValue().compareTo(o2.getValue
		()));
		        LinkedHashMap<String, String> result = new LinkedHashMap<>();
		        for (Map.Entry<String, String> entry : capitalList) {
		            result.put(entry.getKey(), entry.getValue());
		}
		        return result;
		    }
	
		    public static void main(String[] args) {
		      LinkedHashMap<String, String> capitals = new LinkedHashMap<>();
		        capitals.put("Nepal", "Kathmandu");
		        capitals.put("India", "New Delhi");
		        capitals.put("United States", "Washington");
		        capitals.put("England", "London");
		        capitals.put("Australia", "Canberra");
		        Map<String, String> result = sortMap(capitals);
		        for (Map.Entry<String, String> entry : result.entrySet()) {
		            System.out.print("Key: " + entry.getKey());
		            System.out.println(", Value: " + entry.getValue());
		}
		        }

}
