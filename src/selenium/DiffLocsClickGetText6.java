package selenium;

public class DiffLocsClickGetText6 {
	
	/**
	 * how to maintain the String locators with the help of By class??
	 * 
	 * ==>get the By locator using String locator
	 * for this u need to create a method which takes the string param and converts
	 * it into a By locator
	 * 
	 * public void getBy(String locatorType, String locatorValue){
	 *     By locator = null;
	 * 
	 *      switch(locatorType.toLowerCase().trim(){
	 *             case"id":
	 *              locator = By.id(locatorValue);
	 *              break;
	 * 
	 * 
	 * 
	 *         default:
	 *          break;
	 *         }
	 *         return locator;
	 * 
	 * }
	 * 
	 * 
	 * 
	 * Xpath/Xml path: is not an attribute so not seen as such on DOM
	 * BUT it is the address of the element on the html Dom
	 * CSS: is not an attribute BUT it gives the styling for the webEle-used as a
	 * cssSelector on Dom
	 * 
	 * case study has to be done: xpath with css and not xpath with id
	 * 
	 * to generate random emails for registration purpose:
	 * 
	 * Where should this common fn be added??
	 * In the StringUtils class
	 * 
	 * public static String getRandomEmail(){
	 * 
	 * return "automation"+System.currentTimeMillis()+"@"+"opencart.com";
	 *           OR
	 * return "automation"+UUID.randomUUID()+"@opencart.com";          
	 *         }
	 *         
	 *  IQ] Tell me about the clean up strategy for the emails??
	 *  By using the wild card to select the StringOfEmail in the sql query
	 *  
	 *  ElementUtil, BrowserUtil --- where driver is being used often -- the modifier
	 *  should be non-static since more object refs will be created, hence it would
	 *  hinder the parallel execution
	 *  
	 *   StringUtil and other common Utils-should be created as static, so only one
	 *   copy is maintained in the memory and also can be accessed from any where
	 *   
	 *   Captcha: should never be automated and also they cannot be automated
	 *   
	 *   --incognito for chrome
	 *   --inprivate for edge
	 *   
	 * 
	 */

}
