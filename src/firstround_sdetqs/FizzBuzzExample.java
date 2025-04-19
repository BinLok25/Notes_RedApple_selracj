package firstround_sdetqs;

public class FizzBuzzExample {
	
	/*
	 * Write a program which return "fizz" if the number is a multiplier of 3, return "buzz"
	 *  if its multiplier of 5 and return "fizzbuzz" if the number is divisible by both 3 
	 *  and 5. If the number is not divisible by either 3 or 5 then it should just return 
	 *  the number itself?
	 * 
	 */
	
	 public static String fizzBuzz(int number) {
	        if (number % 3 == 0) {
	            if (number % 5 == 0) {
	                return "fizzbuzz";
	            } else {
	                return "fizz";
	            }
	        } else if (number % 5 == 0) {
	            return "buzz";
	        }
	        return String.valueOf(number);
	    }
	  public static void main(String[] args) {
	    System.out.println(fizzBuzz(15));
	}

}
