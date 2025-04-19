package dec2023javasessions;

public class StaticArrObjArrArrLiteralsLimits08 {
	
	/**
	 * DEFAULT VALUES:
	 * 1.of char is space
	 * 2.of the entire int family is 0
	 * 3.of boolean is false
	 * 
	 * 4.of non-primitive data types is null
	 * 
	 * BREAK: there is no concept of breaking the if....else statement in the programming
	 * world
	 * break --> always breaks the loop/switch statements
	 * 
	 * Arrays: collection of similar kind of data-is a non-primitive data type
	 * is kind of collection which stores similar kind of data-is STATIC
	 * ==> SIZE IS PRE DEFINED
	 * Limitations of static Array:
	 * 1.size is fixed
	 * 2.stores only similar-same datatypes
	 * 
	 * static Array: use cases
	 * bookmyshow.com - where the theatres have fixed no of seats
	 * flightbooking - the seats are fixed
	 * month array, week array
	 * 
	 * to overcome above problems-dynamic arrays came into pic
	 * dynamic array: use cases
	 * uber booking:
	 * 
	 * // Array: non primitive data type
		//can store similar kind of data types
		
		//1. using new key word:
		int i[] = new int[4];
		
	 * HI-highest index = length -1 =>4-1=3
	 * length -- is the inbuilt variable in java
		 * LI-lowest index = 0
		 * 
		 * if tried to retreive the value beyond the range of Array-throws
		 * AIOB exception-ArrayIndexOutOfBoundsException
		 * 
		 * system.out.println(i); gives address of the array-A random String
		 * which is USELESS so use Arrays - an inbuilt class which has .toString()
		 * 
		 * NEVER print Array directly with the variable name- gives random string
		 * 
		 * System.out.println(Arrays.toString(i));
	 * 
	 * to print all the values of Array one by one: use for loop
	 * 
	 * emp data: name(string), age(int), salary(double), gender(char), isPermanent(boolean)
	 * Object Array: can store any kind of data --> for varieties of data
	 * Object--> is the super class of all the classes
	 * 
	 * Object empData[] = new Object[5];
	 * empData[0] = "Shilpa";
	 * empData[1] = 30;
	 * empData[2] = 25.55;
	 * empData[3] = 'f';
	 * empData[4] = true;
	 * 
	 * the above object is for one specific employee
	 * for 100 employees-need to create 100 objects
	 * 
	 * dynamic array: use cases
	 * 1.booking uber: 100 cab[100]
	 * 2.ecommerce app -- users reg --> new customers -->
	 * 3.emp drop down
	 * 
	 * static array: use cases
	 * 1.bookmyshow.com --> Animal --200 seats
	 * 2.flight booking
	 * 3.month array
	 * 4.week array
	 * 5.
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
