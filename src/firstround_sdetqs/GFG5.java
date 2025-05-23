package firstround_sdetqs;

import java.util.concurrent.ThreadLocalRandom;

public class GFG5 {
	
	// Java program to generate a random integer
	// within this specific range
	
	/**
	 *  1. Get the Min and Max which are the specified range.
	 *	2. Call the nextInt() method of ThreadLocalRandom class (java.util.concurrent.ThreadLocalRandom) and specify the Min and Max value as the parameter as
     *      ThreadLocalRandom.current().nextInt(min, max + 1);
     *  3. Return the received random value
	 * @param Min
	 * @param Max
	 * @return
	 * 
	 * 
	 */
	
	  public static int getRandomValue(int Min, int Max)
	  {
	    // Get and return the random integer
	    // within Min and Max
	    return ThreadLocalRandom
	.current()
	      .nextInt(Min, Max + 1);
	  }
	  // Driver code
	  public static void main(String[] args)
	  {
	    int Min = 1, Max = 100;
	    System.out.println("Random value between "
	            + Min + " and " + Max + ": "
	            + getRandomValue(Min, Max));
	}
	  
	 

}
