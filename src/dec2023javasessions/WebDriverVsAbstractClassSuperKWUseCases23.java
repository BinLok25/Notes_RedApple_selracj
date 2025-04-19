package dec2023javasessions;

public class WebDriverVsAbstractClassSuperKWUseCases23 {
	
	/**
	 * 
	 * why WebDriver.java is an interface and not abstract class??
	 * Why page class was an abstract class??
	 * ------------
	 * 1. to achieve 100% abstraction -- should be an interface
	 * 2. different browsers are inheriting the WebDriver class--
	 * it has no idea about the diff browser engines - how they are
	 * going to implement the diff features declared by WebDriver
	 * 
	 *  
	 *  here in the page class, also part of the same ecosystem and has
	 *  idea about the System's features
	 *  
	 *  this : used to call the current class constructor
	 *  super : used to call the parent class's constructor
	 *  --shud be the first statement
	 *  --can be called only once
	 *  ---both either of super()/this shud be the very first statement
	 *  in the program -- so they cannot be together--only one of them
	 *  could be used
	 *  
	 *  super:
	 *  //is used to call parent class constr...it should be the first
	 *  statement
	 *  //super & this can not be together in the constr...
	 *  //is used to call the parent class methods and vars
	 *  //goes to immediate/direct parent
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
