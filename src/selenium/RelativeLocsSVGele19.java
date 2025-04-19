package selenium;

public class RelativeLocsSVGele19 {
	/**
	 * Relative Locs: very useful for doing quick sanity check 
	 * 
	 * Relative locs: introduced with sel 4.x
	 *                   above of ele                  
	 *                   |
	 * left of ele <--- ele --> right of ele
	 *                   |
	 *  near of ele      below of ele
	 *                   
	 *  instead of By there is this with method i.e introduced for relative locs
	 *  
	 *  RelativeLocatorClass: is introduced with sel 4.x
	 *  press ctrl+shift+O -- to see all the methods of relative locs
	 *  ------need to do a static import for the below code:
	 *  import static org.openqa.selenium.support.locators.RelativeLocator.with;
	 *  
	 *  in the above import-Relative locator is the class and with is a method from this class
	 *  
	 *  then create the base WE -->> from this base ele--Go left, right, above, below N near(100 px within the range)
	 *  ----using the static method -- with() -- is available inside the relative loc which is static
	 *  in nature-so needs to be accessed thru class name OR just do the static import
	 *  WebDriver driver = new ChromeDriver();
	 *  driver.get("url");
	 *  
	 *  WebElement ele = driver.findElement(By.linkText("");
	 *  driver.findElement(RelativeLocator.with(By.tagname("p")).toLeftOf(ele)).getText();
	 *  
	 *  SVG Element: Scalar Vector Graphs ==> art eles-smileys, immorticons, star,circle
	 *  
	 *  the normal xpath will not work for SVG eles-so need to create a special xpath
	 *  query
	 *  --with 2 forwar slashes then a star with square brackets and attribute
	 *  local-name() = 'svg'
	 *  ==> IQ] write the xpath for svg??
	 *  //*[local-name()='svg']
	 *  
	 *  //button//*[local-name()='svg']
	 *  
	 *  g : is also an svg element
	 *  for svg tagname --> we have to write local-name()
	 *  local-name(): is a pre-defined fn to start with svg
	 *  And under svg: if we have any other name like rect, g, d, path(which are also sub
	 *  part of svg)....etc then
	 *  ---for all of these we have to use a different function name
	 *  name()
	 *  ===>
	 *  //*[local-name()='svg' and @id='map-svg']//*[name()='g'and id='regions']
	 *  
	 *  
	 *  use url: flipcart.com
	 *   inspect shopping cart icon, magnifying/search icon are SVG eles
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
