package selenium;

public class WebDriverArchitecture3 {
	
	/**
	 * WebDriverArchitecture: ==> how exactly is sel interacting with the web
	 * browser
	 * the concept of interaction with the browser remains the same-whether the lang
	 * is java, python
	 * 3 components: need to be understood, 1.IDE/local 2.server-specific to the specific
	 * browser-provided by the browser vendor companies-can be binary files/exec files
	 * 3. chrome browser, firefox, edge browsers
	 * 
	 * we r writing the code in specific lang on ide-Rest Apis is the mediator between the
	 * local and the server which translates the http request in the form of code-read by
	 * sel and gets converted into an api n taken to the server
	 * each request is W3C standard=>WebDriver protocol with sel4
	 * 
	 * what is this server and how exactly is it getting launched??
	 * 
	 * with Sel 3/4.5.0 --we needed to manually download the driver exec file - the same
	 * version as the browser on the local
	 * 
	 * But with 4.6.0- it became automatic==> automatically downloaded by the browser
	 * vendor companies first into their official websites and then downloaded auto
	 * into the users local machine-in the .cache folder
	 * the older binaries already downloaded into the .cache previously will not be deleted
	 * until deleted manually by the user/owner of the laptop
	 * -------this is called sel manager --no code needed to be written for this
	 *
	 * Before sel 4.6.0 -- the system.setProperty() used to be written to do this to show
	 * the path of the driver executable/binary file
	 *  
	 * IllegalStateException--thrown if the driver.setProperty() not written when using the
	 * sel 4.0.0 saying the path for webdriver.chrome.driver to be set
	 * 
	 * 
	 */

}
