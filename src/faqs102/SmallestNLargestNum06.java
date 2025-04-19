package faqs102;

import java.util.Arrays;

public class SmallestNLargestNum06 {
		//TC: O(n)
	public static void main(String[] args) {
		int numbers[] = {-10, 24, 50, -88, 987656, 0};
		//tcs: for one, zero, multiple nums
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i = 1; i<numbers.length; i++) {
			if(numbers[i]>largest) {
				largest = numbers[i];
			}
			else if(numbers[i]<smallest) {
				smallest = numbers[i];
			}
		}
		
		System.out.println("\n given array is: "+Arrays.toString(numbers));
		System.out.println("largest no in Array: "+largest);
		System.out.println("smallest no in Array: "+smallest);
	}

}
