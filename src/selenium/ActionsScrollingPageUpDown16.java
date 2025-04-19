package selenium;

public class ActionsScrollingPageUpDown16 {
	/**
	 * 
	 * With sel4.x:
	 * we can use actions class for scrolling also-previously we used to do
	 * it with jse--infinite scrolling can be done only with jse
	 * 
	 * enum: is a collection of multiple constant values
	 * 
	 * keys:is predefined enum in java
	 * 
	 * act.senkeys(Keys.PAGE_DOWN).perform();
	 * 
	 * Every action has to be written with dot perform();
	 * 
	 * cmd+arrowdown--macbook
	 * ctrl+arrowdown-windows
	 * ---------------all the keys are character sequence
	 * act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
	 * Thread.sleep(1000);
	 * act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
	 * -----Scroll to element
	 * act.scrollToElement(driver.findElement(By.xpath("//xpathOfEle")))
	 *    .Click(driver.findElement(By.xpath("xpathofEle")))
	 *    .build().perform();
	 * ----from the keyboard refresh is ctrl+F5
	 * 
	 * ---sendKeysWithA pause
	 *    
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
