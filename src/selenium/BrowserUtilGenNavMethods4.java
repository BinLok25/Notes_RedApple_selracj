package selenium;

public class BrowserUtilGenNavMethods4 {
	
	/**
	 * how to create a browser Util with diff driver methods with proper 
	 * Error handling??
	 * 
	 * 
	 
	 * How to create a ReusableFn/Utility/specific reference function??
	 * Create a class-BrowserUtility
	 * 1.create webdriver reference at the top level/class level
	 * 2.create a method - to launch browser with params-browsername, 
	 * n create a switch case statement for all cases with browsername as param in
	 * the switch case statement
	 * 
	 * documentation comments-create before the class or inside the class as well
	 * /** enter - will give the author name
	 * 
	 * STaTic: will hold only one copy in the memory
	 * 
	 * Navigations: Back and forward, get vs to, refresh methods
	 * 4-methods-in navigation concept-Back & forward, to(), refresh()
	 * get() is not from navigations concept
	 * 
	 * Headless Concept:
	 * no browser visibility--browser is there but not seen
	 * is faster - since it is not wasting time to open browser and visualize anything
	 * used to run tc's on CI CD/Jenkins/Linux ANd testing becomes faster than headed
	 * recommended: not since no body wants to navigate amazon.com headless
	 * local:
	 * 
	 * problems: of headless
	 * it is not actual user simulation
	 * complex apps/HTML DOM:
	 * alerts/popups: could be a problem
	 * 
	 * how to use headless??
	 * As such there is no direct method available to use headless--we have to use
	 * chrome Options class
	 * pass the object of chrome options inside the ChromeDriver
	 */

}
