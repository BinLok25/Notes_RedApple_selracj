package firstround_sdetqs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExample {
	/*
	 * java program to remove duplicates from a list
	 * 
	 * 
		1. Get the ArrayList with duplicate values.
		2. Create a new List from this ArrayList.
		3. Using Stream().distinct() method which return distinct object stream. 
		4. convert this object stream into List
	 * 
	 */
	public static void main(String[] args) {
	    // input list with duplicates
	    List<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4,5, 5));
	    System.out.println("ArrayList with duplicates: "+ list);
	    // Construct a new list from the set constucted from elements
	    // of the original list
	    List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
	    System.out.println("ArrayList with duplicates removed: "+ newList);
	  }

}
