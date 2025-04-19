package selenium;

public class IdLocFEFEsEleUtil05 {
	
	/**
	 * 1.
	 * 2.
	 * 3.
	 * 4.
	 * 5.
	 * 6.
	 * 7. BrUtil + eleUtil
	 * 8. By util = String locators
	 * 
	 * 
	 * 
	 * EleUtil: 
	 * ------>>>Design pattern should follow SRP(Single Responsibility Principle)
	 * ==> each class is responsible for one kind of work
	 * => BrowserUtil -- responsible for browser specific work only
	 * EleUtil -- should be responsible for element related work
	 * ==> creation of webeles and performing action on those
	 * 
	 * 1. create private vars
	 * private WebDriver driver
	 * 
	 * 2.public constructor which takes the param WebDriver driver
	 * --the same driver given to the class variable using this keyword
	 * ==>
	 * this.driver = driver;
	 * this.localVar = classVar;
	 * 
	 * 3.public methods to do the page Actions
	 * 
	 * ---->>>IMP
	 * the vars are private -- so no body accesses them from outside
	 * and to maintain the same driver thru out the session
	 * initialized with the constructor by passing it as param
	 * then assigned the same driver to the class variable
	 * 
	 * the private vars are then accessed thru the public methods
	 * ----AND THE ELE UTIL IS ALSO A CLASSIC EX OF ENCAPSULATION
	 * 
	 * By locators -- is application specific -- so should exist in the caller class
	 * ==> the test class
	 * Element utility -- should not have the By locs/page By locs
	 * 
	 * 
	 * 
	 */

}
