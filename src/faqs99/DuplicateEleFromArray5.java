package faqs99;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateEleFromArray5 {

	public static void main(String[] args) {
		
		String names[] = {"java", "javaScript", "ruby", "C","Python","java","ruby"};
		
		//1.compare each element:O(nxn)-worst soln:
		for(int i=0;i<=names.length-1;i++) {
			for(int j=i+1;j<names.length;j++) {
				
				if(names[i].equalsIgnoreCase(names[j])) {
					System.out.println("duplicate ele is: "+names[i]);
				}
			}
		}
		
		//2.using hashset:part of java collec and it has a prop:stores unique eles
		System.out.println("--------using hashset---------");
		
		Set<String>store = new HashSet<String>();
		//using for each loop to iterate thru hashset
		for(String ele:names) {
			
			if(store.add(ele)==false) {
				System.out.println("duplicate element found: "+ele);
			}
			
		}
		
		//3.using hashmap:
		System.out.println("----------using hashmap-----------");
		
		HashMap<String, Integer> storemap = new HashMap<String,Integer>();
		

	}

}
