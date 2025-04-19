package faqs102;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FinddupElesInArray05 {

	public static void main(String[] args) {
		
		String names[] = {"Java", "JavaScript", "Ruby", "C", "Python", "Java", "C"};
		
		//1. compare each element:TC O(n^2) -- worst approach
		for(int i=0; i<names.length; i++) {
			for(int j = i+1; j<names.length; j++) {
				
				if(names[i].equals(names[j])) {
					System.out.println("duplicate eles:: "+names[j]);
				}
			}
		}
		System.out.println("==================================");
		//2. using hashSet: doesnot allow duplicates - stores only unique eles
		Set<String> store = new HashSet<String>();
		for(String name: names) {
			
			if(store.add(name) == false) {
				System.out.println("duplicate element is:: "+name);
			}
		
		}
		System.out.println("==================================");
		
		//3. using HashMap:
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		
		for(String name:names) {
			Integer count = storeMap.get(name);
			if(count == null) {
				storeMap.put(name, 1);
			}else {
				storeMap.put(name, ++count);
			}
		}
		//get the values from the HashMap:using entrySet -- will return the set of Entry
		Set<Entry<String, Integer>> es = storeMap.entrySet();
		for(Entry<String, Integer> e: es) {
			if(e.getValue()>1) {
				System.out.println("duplicate element is:: "+e.getKey());
			}
			
		}
		

	}

}
