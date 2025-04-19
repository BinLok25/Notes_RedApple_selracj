package dec2023javasessions;

import java.util.Map;
import java.util.TreeMap;

public class HashMapIterationAddRemoveForEachLoop_linkedHMtreeM_HMusedcases29 {
	/**
	 * 
	 * Basic Heirarchy Diagram for HashMap:===>
	 * Map interface extends Sorted Map interface then TreeMap class is child of
	 * both Map interface and Sorted Map interface--implementing Sorted Map interface
	 * 
	 * Map interface: being implemented by HashMap class - which inturn is extended
	 * by Linked Hash Map class
	 * 
	 * ------------
	 * HM: works in the form of k, v format
	 * --has no indexing concept
	 * --it always generates the hash code and then the index will be calculated and
	 * then into the specific index the value will go and in case of collision- it
	 * will start creating the linked list and once the threshold value is covered or
	 * once it will reach the threshold value it will start converting the linked list
	 * to the balanced binary tree
	 * 
	 * null keys = 1 => only one null key allowed
	 * null values = multiple => multiple null values allowed
	 * 
	 * Map.entry 
	 * entry:entrySet()
	 * 
	 * entry.getKey() ---fetches the key 
	 * entry.getValue() --- fetches the respective value of the key
	 * 
	 * to print the hash map values -- can print it directly
	 * output comes in the form of a json object=> between {k=v, k=v,...}
	 * in the random order of keys and their values
	 * 
	 * ----cannot use for loop to print the key and its value pairs since there is no
	 * indexing available for the keys -- will be complex but can  be written using
	 * Map and Entry interfaces and also define what exact generics we have used
	 * 
	 * 
	 * LinkedHashMap:
	 * extends hashMap
	 * it maintains the insertion order BUT not index based
	 * 
	 * what is the mechanism that it follows?? 
	 * it maintains the hashcoding etc -- same as HashMap -- but one extra job --
	 * of doing insertions following the index/order Plus getting the data as well
	 * following the insertion order -- which kind of makes it slightly slower than HashMap
	 * ==> retrieves the values the same way as the user had inserted them
	 * 
	 * 
	 * TreeMap:
	 * Sorted Map is the parent of TreeMap - which inturn is a child of Map interface
	 * treemap - maintains the sorted order
	 * --null key is not allowed in tree map
	 * --null value is allowed
	 * 
	 * to print the values with keys: in ascending order for/forEach() with lambda
	 * expression works - BUT to print in the reverse order
	 * --have to use collections.reverse() as a param to the new TreeMap<>(collections.reverse());
	 * ==> in the declaration of TreeMap - use Collections.reverseOrder() as PARAM
	 * 
	 * CODE: to print in ascending order
	 * 
	 * for(Map.Entry<String, String> entry: empData.entrySet()) {
			System.out.println(entry.getKey()+":"+ entry.getValue());
		}
		
		/**
		 * Map: is the interface in which there is one more interface Ent
		 * 
		 */
		
	/*	System.out.println("-------------------------------");
		
	 *	empData.forEach((a,b) -> System.out.println(a + ":" +b));
	 *
	 * to print in REVERSE ORDER:
	 * ===========================>>>>type collections.reverseorder inside the paranthesis
	 * when declaring
	 * TreeMap<String, String> empData = new TreeMap<String, String>();
	 * 
	 * TreeMap<String, String> empData = new TreeMap<String, String>(collections.reverseOrder());
	 * 
	 * LinkedHashmap maintains insertion order, Hashmap maintains random order and
	 * TreeMap maintains the sorted order
	 * 
	 * null key: NOT ALLOWED IN TreeMap since it cannot sort the null key=>
	 * cannot decide where to place the null key - at the start/at the end
	 * HENCE null key not allowed as it is a hindrance for sorting
	 * BUT null value is allowed
	 * 
	 * Map: is one Interface under which Entry is another interface
	 * 
	 * can remove specific key, value pairs from the TreeMap
	 * using remove(key) method
	 * contains(key) -- returns a boolean
	 * 
	 */
}
