package firstround_sdetqs;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {
	
	public static void main(String[] args) {
        int[] array = {4, 2, 4, 5, 2, 3, 1};
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < array.length ; i++) {
            //If same integer is already present then add method will return FALSE
            if(set.add(array[i]) == false) {
                System.out.println("Duplicate Element Found: " + array[i]);
            }
} }


}
