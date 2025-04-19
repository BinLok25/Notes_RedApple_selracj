package selenium;

public class LocatorFEeleUtil5 {
	/**
	 * what do u mean by WebElement
	 * so far we have seen how to launch the browser and get page title etc
	 * Now we have to learn how to interact with the web element on the page
	 * header, search field, link,....are all web eles
	 * 
	 * how to interact with these WEs//
	 * first: create/find the WebElement
	 * second: perform an action on it(click, sendkeys, gettext, isDisplayed)
	 * 
	 * chrome Dev tools: 
	 * when u right click on any web page n inspect - what u see(a window) is called
	 * Chrome Dev Tools
	 * 
	 * The elements section is called the DOM
	 * -the entire html of this page written by Dev is seen here
	 * using the inspect btn u can check the entire page-where u can see the html tag
	 * of each ele after the < bracket
	 * then u can see after the html tag- all the diff attributes/many r there of the
	 *  ele
	 *  
	 *  whenever a browser is launched-the Dom is always loaded first and then the
	 *  page will be loaded after the Dom
	 *  Dom is not the functionality - it is just to place the WEs on the page
	 *  
	 *  the html is the common language for the web/browser app
	 *  driver.findElement(By.id(""))
	 *  => driver.findElement() is helping to find the ele
	 *  id(), name, classname
	 *  -- are all methods
	 * 
	 * SRP: Single Responsibility principle
	 * BrowserUtil - is responsible for browser related work
	 * EleUtil - is responsible for element related work
	 * ExcelUtil - is responsible for excel related work
	 * 
	 * ElementUtil:
	 * 1. create a private webdriver driver to prevent unnecessary access - the default value
	 * of which is going to be null
	 * 2.create public methods for all the actions-BUT the driver will have the default
	 * value of null since the object is not yet initialized
	 * 3.so initialize the driver using encapsulation concept==>
	 * a.create a public constructor not default one BUT parameterized with driver
	 * private driver either initialized by public constructor OR by public method 
	 * 
	 * using this.driver = driver;
	 * ===> driver being given to the driver var at classs level
	 * 
	 * By Locators: also called page By locators/Object REpository(OR)
	 * 
	 * 
	 * 
	 * 
	 */

}
