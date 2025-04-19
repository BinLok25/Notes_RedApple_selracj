package selenium;

public class JsAlerPopUpAuthPopup17 {
	
	/**
	 * 
	 * alert(): is a method there in the Java Script--type it on the console of a 
	 * browser, after u rt click and inspect and pass a message as a param and it 
	 * creates an alert pop up window
	 * 
	 * PopUps(3 types)/javascript alerts:-js alert, js confirm, js prompt
	 * --has only one ok btn 
	 * Javascript alerts-normal alert popups, confirmation popups, prompt popups
	 * use url: the-internet-herokuapp.com/javascript_alerts
	 * 
	 * Alert al = driver.switchTo().alert();
	 * String txt = al.getText();
	 * al.accept();
	 * OR
	 * al.dismiss();
	 * 
	 * Authentication Popups:
	 * -------------2 has two fields unlike alert popup
	 * use url: the-internet.herokuapp.com/basic_auth
	 * 
	 * swithTo() will not work on this popup
	 * since this is not alert-it is auth popup-need to supply username, password
	 * cannot inspect this popup, it has no html dom
	 * how to handle it??
	 * ---launch this app and enter the url-supply username and password==>supply the
	 * username and password in the url itself
	 * ==>after https://admin:admin
	 * what is the limitation/major disadvantage of this
	 * --what if the password has special characters inside it
	 * in sel 4.x : they have created one special interface-HasAuthentication to 
	 * handle this. so overcomes even if the password has any other character in it
	 * --which is implemented by chrome/edge driver
	 * how to use hasAuthentication: use the interface HasAuthentication and TypeCast
	 * it into driver==>and then pass the supplier as a lambda in the register method
	 * ((HasAuthentication)driver).register(() -> new UsernameAndPassword(username, pwd));
	 * 
	 * FileUpLoad Popups:
	 * -----------3 is handled by this hack
	 * type = file is mandatory on the dom
	 * use the sendkeys method to pass the path of the file as a param
	 * 
	 * selenium does not support without type = file present on dom-so ask the dev's to
	 * add in case it is not provided as type = file on dom
	 * 
	 * sikuli-image/resolution based
	 * autoIT--only for windows machine-won't work in docker,jenkins,linux,macos
	 * 
	 * frame: webelement :  DOM
	 * 
	 * browser
	 *    --page: webelement
	 *         --Frame: webelement
	 *         
	 *         
	 * driver.switchTo().Frame(); to take the driver's control on to the frame
	 * driver.switchTo().defaultContent(); //switches the driver back to the main frame
	 * 
	 * nested frames: frame inside the frame
	 * 
	 * driver.switchTo().parentFrame();
	 * page doesnot have any id or name-is not a webele BUT is just a window
	 * 
	 * Consumer: need to 
	 * Supplier: is always a blank supplier as per the functional interface
	 * 
	 * can we have a default method in an interface?? yes
	 * 
	 * Frames : are heavy
	 * shadowDom is light weight
	 * 
	 * geekforgeeks.org
	 * 
	 */

}
