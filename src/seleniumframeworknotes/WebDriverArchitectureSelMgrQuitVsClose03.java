package seleniumframeworknotes;

public class WebDriverArchitectureSelMgrQuitVsClose03 {
	
	
	/**
	 * 
	 * 
	 * language is for the client -- servers do not understand the code language
	 * server understands only the RestAPIs
	 * 
	 * what is selenium manager??
	 * is a binary/.exe management component of sel--the dot exe files of the
	 * browser drivers
	 * WebDriver driver = new ChromeDriver(); 
	 * 
	 * is just enough --- sel 4.x -- the browser vendors responsible for doing
	 * the work of WebDriver manager
	 * ==> downloads the compatible version of the driver executable on to the
	 * users local machine and uses it
	 * 
	 * any sel code after quit/code --- invalid session id exception
	 * close(); -- same session id BUT invalid 
	 * quit(); --- session is null
	 */

}
