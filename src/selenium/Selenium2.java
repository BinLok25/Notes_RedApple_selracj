package selenium;

public class Selenium2 {
	
	/**
	 * IDE: Eclipse/Intellij
	 * config selenium in IDE
	 * Maven project:
	 * pom.xml -- dependencies : external libs
	 * JRE 1.11 --> internal libs
	 * Selenium --> external libs/3rd parties
	 * testng/poi
	 * 
	 * TC:
	 * open browser
	 * enter url
	 * get the title
	 * verify the title => actual vs expected
	 * 
	 * 
	 * JRE: is the main core/internal lib for a java prj
	 * 
	 * set up sel configuration on IDE_to do this create a maven project, which
	 * gives a pom.xml file to load the external dependencies
	 * 
	 * Maven Project: helps to add external/3rd party libs to the prj thru pom.xml
	 * Mvn folder structure: has src/main/java; src/test/java
	 * src/main/java is not for testng code
	 * src/test/java is for testng code
	 * 
	 * WebDriver basics: how to open the browser/first step in automation
	 * 2.enter the url 3.capture the url-these r the tc steps
	 * 
	 * Selenium WebDriver Architecture: the top interface is Search Context-under
	 * which there are two abstract methods-FE() and FEs()
	 * ---under this search context interface--there is another interface called
	 * WebDriver -- which has more abstract methods- get(url), getTitle(), quit()
	 * close()
	 * ---WebDriver interface--there is the RemoteWebDriver class-is a direct child
	 * which implements all the unimplemented methods from the heirarchy
	 * CHROMIUM: is the platform/engine provided Google team to create ur own browser
	 * -----ChromiumDriver-is a child of RemoteWebDriver
	 * --is a platform/engine provided by the Google team
	 * -----EdgeDriver, ChromeDriver --are both children of ChromiumDriver
	 * 
	 * SafariDriver, FirefoxDriver---are all the children of RemoteWebDriver
	 * 
	 * TopCasting: child class object will be referenced by parent classes ref var
	 * will allow the usage of child class object using grandparents ref variable
	 * e.g
	 *   WebDriver driver = new ChromeDriver();
	 *   
	 *   automation steps + verification point ---> AutomationTesting
	 *   test steps + verification point ===> test case
	 *   
	 *   TopCasting OPTIONS:
	 *   1. WD d = new CD();
	 *   valid - recommended
	 *   to run tests on local machine
	 *   WD is the main interface which is implementing all the methods
	 *   
	 *   2.SC driver = new CD();
	 *   valid - not recommended since only 2methods FE(); and FEs() are accessible
	 *   
	 *   3.RWD driver = new CD();
	 *   valid - recommended for grid usage
	 *   
	 *   4.ChromiumDriver dr = new ChromeDriver();
	 *   for cross browser testing will not support as under ChromiumDriver-
	 *   there are only 2 child classes-chrome and Edge drivers available
	 *   
	 *   5.WD driver = new RemoteWebDriver(remoteaddress,capabilities);
	 *   valid -- recommended
	 *   
	 *   6.
	 *   SearchContext driver = new RemoteDriver(serverURL, capabilities);
	 *   
	 *   7.CD driver = new ChromeDriver();
	 *   valid BUT works only for chrome browser
	 *   FirefoxDriver driver = new FirefoxDriver();
	 *   to run tests on remote/server/cloud machine grid
	 * 
	 * 
	 * 
	 * 
	 */

}
