package dec2023javasessions;

public class HashMapConceptKeyValueInternalImplementation28 {
	
	/**
	 * IQ] how exactly does HashMap work internally??
	 * --------->>>how exactly is it not maintaining the order
	 * 
	 * unlike ArrayList, the default capacity for a hash map is 16 segments,0-15
	 * internally to place the key value pairs - each segment is divided into
	 * 3 parts
	 * hashing mechanism: will generate some hash code for the k,v pairs, it will
	 * calculate the index - internally it will call the mod method to calculate
	 * the hash code based on which will calculate the index is created
	 * 
	 * is it possible that hash code could be duplicate for multiple/2 diff
	 * keys?? yes is possible and is called the concept of collision
	 * ==>multiple pairs getting the same index
	 * to overcome this java will create an extra node on the same index => a
	 * linked list is getting created
	 * 
	 * only one null key BUT multiple null values are allowed in HM
	 * 
	 * for HM the load factor(lf) --- is 75% 
	 * initial virtual segment(they do not say VC here) is 16
	 * 
	 * only and only in case of collision - the linked list is getting created
	 * which maintains the order
	 * 
	 * to fetch the values - use get method  and pass the value for key
	 * 
	 * What is the time complexity for arraylist/linked list??
	 * we simply write for loop -- so O(n)
	 * 
	 * From jdk 1.8 onwards - in case of collision - upto 8 segments we maintain
	 * the index --then the linked list will be converted into a binary tree
	 * the tc for binary tree is O(log n)
	 * 
	 * major advantage of binary tree: we r getting better tc because of binary
	 * tree
	 * 
	 * //k, v
	 * how to create the object of hashmap??
	 * HashMap -- is a non-order based collection => no insertion order
	 * a predefined class in java, declare the generics inside
	 * the angular braces
	 * --to insert values into HashMap -- use put() - method
	 * --.size() to get the no.of key, value pairs available in HM
	 * --only Wrapper Class names allowed as generics
	 * --duplicate keyvalues allowed 
	 * --null keys allowed(only one)
	 * --null values(multiple) allowed
	 * --for single key-multiple values not allowed-if written, then the
	 * latest update is picked
	 * --null key and null value - yes
	 * 
	 * can print hashmap directly on console -- need not have any loops
	 * 
	 * 
	 * HashMap<String, Integer>empMap = new HashMap<String, Integer>();
	 * 
	 * to iterate thru hash map-for loop/for each loop can be used
	 * 
	 * the k,v pair of hash map: also know as entry set
	 * entry => an element of hashmap
	 * entrySet => both k,v pairs
	 * 
	 * FOR loop: 
	 * =======
	 * for(Map.Entry<String, String> entry : empData.entrySet()){
	 * System.out.println(entry.getKey()+" : "+entry.getValue());
	 * }
	 * 
	 * ForEachLoop:
	 * ===========
	 * empData.forEach((k,v) -> System.out.println(k + ":" +v));
	 * 
	 */

}
