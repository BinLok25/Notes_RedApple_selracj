package dec2023javasessions;

public class StringBufferStrBuilderFinallyBlockExs27 {
	
	/**
	 * FINALIZE: this keyword is deprecated from jdk 9 onwards
	 * previously was used for Garbage collection -- garbage collection 
	 * before the Garbage collection enters
	 * 
	 * 
	 * 
	//try -- finally -- yes
	//try -- catch -- yes
	//try -- no
	//catch -- finally -- no
	//try -- catch -- finally -- yes
	//try -- try --catch -- finally -- no
	//try - catch-- finally -- finally -- no
	//try catch catch catch catch -- finally -- yes
	 * 
	 * 
	 * finally cannot be written without try
	 * one try multiple finally not allowed
	 * 
	 * FINALLY: this block is used along with try...catch block
	 * --this block gets executed no matter if try...catch is executed or not
	 * ==> whether the exception is coming or not
	 * IQ] can we write finally block multiple times?? No doesnot make sense
	 * ---Only ONE should be written
	 * multiple try - allowed
	 * Q]can we write try...catch block inside the finally block??
	 * 
	 * finally: use cases
	 * close the DB, close the browser
	 *  file system - close the resource with that file
	 * 
	 * //when to use finally?
	 * //make the connection with DB(SQL): username/pwd
	 * //hit the SQL: select * from Employee;
	 * //get the results from DB table
	 * //use the results in the script
	 * 
	 *  //continue code
	 *  
	 *  System.exit(1); //not a good praactice - never use in selenium
	 *  exit() -- is a static method from System class -- used to shut down
	 *  the JVM
	 * 
	 * finally: can be written without the catch block as well
	 * BUT cannot be written in between try and catch blocks
	 * 
	 * SEQUENCE: is always try...catch then finally
	 * 
	 * Preference: is always be with the FINALLY block and if there is a
	 * return value in this block -- this value will be the latest updated
	 * value -- which would override the previous return value
	 * 
	 * For TRY catch is mandator and NOT finally block
	 * 
	 */

}
