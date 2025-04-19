package selenium;



public class AllSelNewFeaturesSel4Dotx {
	
	/**
	 * 1.seleniummanager(SM):introduced to take care of the work being
	 * done by WebDriver manager-where the browser vendors started taking
	 * care of downloading the browser compatible version of driver executable
	 * 
	 * until sel 3.7 -->json wire protocol
	 * from sel 3.8 --> w3c webdriver protocol
	 * All--Browser, WebApp, seleniumLib -->>following w3c webdriver protocol
	 * 
	 * 2.BasicAuth: is the simplest form of authentication where u just enter the username
	 * and password
	 * 
	 * 3. addition of HasAuthentication interface to take care of Basic Authentication
	 * pop up
	 * 
	 * HasAuthentication -->>
	 * indicates that a driver supports authenticating to a website in some way 
	 * 
	 * has to typecast the driver into hasAuthentication and then register with the new
	 * username and password
	 * 
	 * register() --method says u have to give one supplier
	 * 
	 * register() -- is one interface -- have to supply as a functional interface
	 * using lambda
	 * 
	 * 4. Relative locs: introduced with sel 4.x
	 *                   above of ele                  
	 *                   |
	 * left of ele <--- ele --> right of ele
	 *                   |
	 *                   below of ele
	 * 
	 * 5.
	 * sel 4.x NewFeature:
	 * --------
	 * driver.switchTo().parentFrame();
	 * the parentFrame() method is introduced to overcome the default switch
	 * to the main window
	 * 
	 * 6.dragAndDrop() method introduced into ACtions class
	 * -------
	 * 
	 * 7.NewWindowconcept:
	 * -------
	 * driver.switchTo().newWindow(WindowType.TAB);
	 * driver.switchTo().newWindow(WindowType.WINDOW);
	 * 
	 * 
	 * 
	 */

}
