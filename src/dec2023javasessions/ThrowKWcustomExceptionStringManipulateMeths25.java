package dec2023javasessions;

public class ThrowKWcustomExceptionStringManipulateMeths25 {
	
	/**
	 * Throw: this key word is used to custom create your own exception with some
	 * proper message
	 * 
	 * throw new Exception("message");
	 * 
	 * To handle the above custom exception again -- have to surround the above
	 * line with try...catch block
	 * 
	 * 
	 * which class is the parent of all exceptions-parent of all runtime exception
	 * classes??
	 * 
	 *  //Throwable
	 *      //Exception
	 *          //RunTimeException
	 *              //AE, NPE
	 *              
	 * when we write custom exception in the framework design - we always go with
	 * the runtime exception -- which is coming from java.lang pkg
	 *   --call the parent class constructor ==> of RuntimeException -- using
	 *   super key word and pass the message as a param to this super() --constr...
	 *   
	 * 
	 * IQ] what are the ways to do exception handling in java ??
	 * ---Exception handling in java is done with one and only try...catch block
	 * 
	 * throws : this key word just passes the exception from one method to another
	 * method -- which would catch and if it has again a try...catch block written
	 * in this method then it would be handled other wise it need to be thrown 
	 * again to some other method-- this chain keeps on happening until the
	 * main method catches it -- And JVM handles it here
	 * 
	 * throw: is used to write a CUSTOM EXCEPTION
	 * 
	 * STRING: is a collection of multiple characters
	 * SIOB -- comes under RuntimeException class -- exception thrown when trying
	 * to access ele which is out of bounds for a static array
	 * 
	 * in dot indexOf(""); ---> if the string is not there -- would print -1 on the
	 * console --> is the default behaviour
	 * 
	 * //indexOf is an overloaded method - which would take chars, strs,...
	 * 
	 * STRING MANIPULATION:
	 * 
	 * Can replace() be used to replace a space?? yes
	 * str.replace(" ", "");
	 * ==> replace space with nothing 
	 * 
	 * which one is better replace() or replaceAll()
	 * replace() -- will handle one space at a time
	 * replaceAll() -- will collect all the spaces together and replace with nothing
	 * 
	 * 
	 * REGULAR EXPRESSION: RegEx
	 * ---------->>Regular expression is a special kind of string which is
	 * supported in almost all programming languages where you can create a
	 * combination of OR pattern of a specific String
	 * 
	 * what is the pattern here
	 * ----->>two backslash and space denoted by s and for more than one space +
	 * "\\s"
	 * "\\s+"
	 * 
	 * "\\D+"   here D => digit
	 * 
	 * Pattern: is a class
	 * 
	 * what kind of a string is this""
	 * "Hello!!! this is my value .$1233333*"; //AlphaNumeric
	 * 
	 * SPACE: is also a special character
	 * 
	 * IMMUTABLE: cannot be changed, updated ex: Strings
	 * 
	 * creates a new String - each time you try to update the original
	 * 
	 * SCP : is inside the Heap in the memory--duplicate values not allowed
	 * == : operator compares references/memory addresses and not values
	 * 
	 *  what is the purpose of dot equals method??
	 *  --->>>it compares the respective values
	 *  
	 *  what is the best way for string comparison?? .equals();
	 *  
	 *  BEST WAY OF CREATING STRINGS : always go with the STRING LITERALS
	 *  
	 *  Can we have duplicate objs inside the heap??yes
	 *  But not inside SCP
	 *  
	 */

}
