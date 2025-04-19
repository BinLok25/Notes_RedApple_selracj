package selenium;

public class JavaScriptExecJSutils20 {
	/**
	 * 
	 * To understand ShadowDom,pseudoEles -- need to understand jse also
	 * JSE:
	 * i) browser understands only java script-no matter what lang the code is
	 * written on the ide
	 * ii) sel cannot provider for everything-sometimes sel code doesnot work-in 
	 * which case we need to do things from backend using java script executor
	 * 
	 * ==> we can write some code in Js and give to one interface-jse
	 * and jse has a method called executeScript()
	 * executeScript(): this method will run the js script on behalf of the browser
	 * 
	 * e.g: click() is not working then can write some script in js and execute it
	 * with the help of jse
	 * 
	 * to print something on console:all java script code
	 * console.log("hello");
	 * history.go(-1); to go back
	 * history.go(1);  to go forward
	 * history.go(o); for refresh
	 * alert("some message");
	 * document.documentElement.innerText;
	 * window.scrollTo(0,document.body.scrollHeight); to scroll to bottom of page
	 * window.scrollTo(document.body.scrollHeight,0); to scroll back up
	 * window.scrollTo(0,document.body.scrollHeight/2);  to go until middle of the page
	 * arguments[0].scrollIntoView(true);  to scroll until ele is in view
	 * document.body.style.zoom = '400.0%'
	 * --we do not have any method available in sel for this zooming purpose
	 * document.getElementById("username').value = "tom@gmail.com";
	 * 
	 * we avoid sendKeys by jse
	 * 
	 * Java Script: is just a backdoor entry
	 * 
	 * 
	 * 
	 * a class can execute multiple interfaces
	 * in java interface to interface casting possible
	 * both WebDriver and JavascriptExecutor r interfaces
	 * 
	 * WebDriver driver = new ChromeDriver();
	 * driver.get("");
	 * 
	 * JavascriptExecutor js = (JavascriptExecutor)driver;
	 * js.executeScript("javascript code");
	 * 
	 * *****just as we created element utility, browser utility in the frame work
	 * --now we need to create a utility for JSE related work needed for the frame
	 * work
	 * 
	 * IQ] do we have any method in sel to grab the entire text of a web page??No
	 * A] but using java script can write the code to grab the entire text
	 * document.documentElement.innerText;
	 * 
	 * 
	 * 
	 */

}
