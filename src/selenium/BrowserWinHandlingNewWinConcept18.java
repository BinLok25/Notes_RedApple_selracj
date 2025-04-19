package selenium;

public class BrowserWinHandlingNewWinConcept18 {
	/**
	 * 
	 * the social media links: on any webpage if u inspect and u see any property
	 * target = blank ==> it is going to open in a new tab==> kind of browser window
	 * popup
	 * 
	 * by default driver not going to go back to the parent window-instead will be
	 * lost
	 * 
	 * Whereas in alert popups - the driver returns back to the parent window by default
	 * 
	 * windowids: always unique and so set is being used
	 * set : is not orderbased so iterable, and cannot have duplicates
	 * iterator(a interface) comes from java.util pkge
	 * 
	 * how to handle browser window popups??
	 * 1.fetch the window ids
	 * 2.switching work
	 * 
	 * window popups: 
	 * how to recognize a window or alert popup??
	 * every window has its unique url, title,dom structure... etc whereas alert windows
	 * will not have any of these-url/title
	 * 
	 * so for new window popups/browser window popups we need to use
	 * driver.switchTo().window();
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
