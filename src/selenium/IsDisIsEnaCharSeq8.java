package selenium;

public class IsDisIsEnaCharSeq8 {
	
	/**
	 * 
	 * return type of FEs-List of WEs
	 * return type of FE- is a single WE
	 * 
	 * how exactly will sel behave when WE not there??
	 * NoSuchElementException --- is thrown
	 * 
	 * new change happened in sel--if passing id, name or classname -- internally
	 * sel is creating a css Selector to find it-this is the new strategy of sel
	 * if u r passing xpath --- internally it will use the same xpath to find the WE
	 * 
	 * how will sel behave when WEs not there??
	 * returns an empty array list []
	 * and when u print the size it will give 0
	 * 
	 * how to chk any specific ele by its classname on Dom???
	 * to find any ele by class name on DOM//
	 * ctrl+F then in the field
	 * .class-name
	 * ----will see all the eles highlighted in yellow
	 * 
	 * Limitation/disadvantage of IsDisplayed:
	 * gives no such Ele exception if element is not displayed--it doesnot reach till
	 * the actions-before itself throwing the no such ele exception
	 * gives boolean value true only if the ele is there--BUT does not give value as
	 * false if ele not there and throws NoSuchEle exception
	 * 
	 * so this method is not powerful
	 * 
	 * how to handle the above situation without using isDisplayed()//
	 * what is the alternate way to handle such situation without using isDisplayed()???
	 * 
	 * the soln is to use driver.FEs() since it returns an empty array if ele not present
	 * and if ele is present returns the ele
	 * on the basis of list size can throw the custom messages
	 * 
	 * since the FEs method returns a list of WEs - and if ele not there returns a blank
	 * list/array -- so on the basis of the list size can throw proper custom messages and
	 * handle the situation--SO THIS IS THE BETTER APPROACH rather than using the isDisplayed()
	 * along with driver.FE() ==> suitable when finding the single element
	 * 
	 * getText() cannot be applied to input fields - BUT can be applied to
	 * link, header, label, span ==> where the element has its own text on the DOM 
	 * 
	 * the value attribute does not have = value on Dom***
	 * BUT holds the entered values of the entry/input fields
	 * only key is seen on Dom - its value is held internally but not visible on Dom
	 * 
	 * how to fetch this value attribute??
	 * using getAttribute("value") method
	 * 
	 * driver.findElement(By.id("fname")).sendKeys(null);
	 * ---will throw illegalArgumentException: keys to send should be a not null
	 * charSequence
	 * 
	 * CharacterSequence -- is an interface which has 3 dots==>3 child classes
	 * String, StringBuilder, StringBuffer - are child of CharSequence interface
	 * 
	 * in the sendKeys(charsequence...keystosend);
	 * ------the 3 dots => string builder, string buffer, string
	 * 
	 * IQ]In sendKeys() method in Sel--what kind of params is it taking???
	 * A] the 3 dots param -- is an array param taking String, Stringbuilder
	 * stringBuffer
	 * 
	 * supply array also
	 * 
	 * StringBuilder sb = new StringBuilder("testing");
	 * String s = "automation";
	 * 
	 * driver.findElement(By.id("fname")).sendKeys(sb,s, "naveen");
	 * 
	 * In sel sendKeys method takes what kind of parameters??
	 * do not say just String--it is actually taking characterSequence
	 * --and it can take String, StringBuilder and StringBuffer
	 * 3 dots==>String, StringBuffer, StringBuilder
	 * --u can supply individually also and also as comma separated values all three
	 * 
	 * 
	 * IS ENABLED CONCEPT:
	 * 
	 * disabled -- attribute/property on the Dom should be checked to test
	 * the WE property status whether disabled/OR not
	 * the moment check box for "I agree to terms" is checked -- the disabled
	 * property is automatically gone from the dom
	 * chk manually on the fly--by checking/unchecking the check box and observing
	 * the property on the dom
	 * 
	 * diff between isDisplayed() and isEnabled()???
	 * ------------------------------------------
	 * 
	 * isEnabled() -- works only when ele is there-gives NoSuchElementException
	 * if ele not present on dom
	 * 
	 * can i click on a disabled btn??
	 * -----ElementClickInterceptedException-Btn is not clickable
	 * 
	 * driver.findElement().click() //no exception
	 * driver.FE().sendKeys("testing"); //ElementNotInteractibleException
	 * 
	 * driver.FE().sendKeys(null); //IllegalArgumentException--keys to send
	 * //should be not null
	 * 
	 * driver.FE().sendKeys("null"); //null gets inputted in the field
	 * 
	 * 
	 * 
	 * 
	 */

}
