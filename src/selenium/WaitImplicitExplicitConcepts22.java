package selenium;

public class WaitImplicitExplicitConcepts22 {
	
	/**
	 * 
	 * WAIT: is an interface which has unimplemented method until
	 * ---has a child class - WebDriver wait
	 * is the amazing implementation-we need it to sink between the code
	 * and the application
	 * does the synchronization between the code and the application
	 * appn can be slow -because of server issue, network issue
	 * Sync: wait
	 * 1.static wait: Thread.sleep(2000):20 secs --is a java method
	 * 2.dynamic wait: dynamically wait for the ele and if the ele appears in lesser
	 * time-the rest of the wait time will be ignored and the script moves further
	 * 2.a: Implicit Wait
	 * 2.b: Explicit Wait
	 *   2.b.i)WebDriver Wait (C)
	 *   2.b.ii)Fluent Wait (C)
	 *   ==> both the above waits are classes WebDriver wait & Fluent wait
	 *   
	 *   FluentWait is also a kind of explicit wait
	 *   
	 *   Wait(I) : until(); --> FluentWait(C): until(){} + other methods-->WebDriver wait(C)
	 *   
	 *   strike line ==> the method is deprecated
	 *   TimeUnit.SECONDS ----is deprecated was until sel 3.x
	 *   
	 *   Duration.ofSeconds(10); ----is the new method to be used in sel 4.x
	 *   
	 *   imp wait: Global wait: is applied to all eles by default
	 *   FE/FEs-is not possible for a specific ele always for all elements
	 *   
	 * Dynamic waits: will not throw exceptions immediately, instead will wait until
	 * the time mentioned in the wait statement
	 * 
	 * IMPLICIT WAIT: CASE STUDY
	 * case1:
	 * the dynamic wait : the latest value of it in the script will be applied(global)-until
	 * it has been overridden
	 * 
	 * case2:
	 * gets applied to all the elements since global
	 * 
	 * case3:
	 * is only for webelements
	 * not applicable for non web elements: JS alert, title, urls, browser window
	 * 
	 * avoid imp wait in your real time framework-use it for individual tc's
	 * 
	 * EXPLICIT WAIT: 
	 * ---is for specific element
	 * 
	 * Wait(I) : until(); --> FluentWait(C): (@overridden)until(){} + other methods-->WebDriver wait(C): no methods
	 * 
	 * can be applied either with the FluentWait(C) or with the WebDriver wait
	 * 
	 *  until(): changes its behavior accordingly
	 *  
	 *  IQ]What is the diff between visibility of ele located and the presence of element located??
	 *  presence : just means ele present on the Dom
	 *  
	 *  Visibility: means always checking for the ele on the page
	 *  ==> not only displayed on Dom, available on page but also has a height and width greater than 0
	 * 
	 * By default, the complete page load time is applied by selenium==> sel waits
	 * until the complete page is loaded, and only then sel will start interacting
	 * with the elements after this line written in code
	 * driver.get("");
	 * 
	 * JimEvans: a contributor to sel clearly said not to add both implicit and
	 * explicit waits together
	 * 
	 * trust factor pages: selenium.dev and selenium github pages
	 */

}
