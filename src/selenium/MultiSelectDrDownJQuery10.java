package selenium;

public class MultiSelectDrDownJQuery10 {
	/**
	 * Sometimes select tag will have an extra attribute-multiple which indicates that
	 * multiple values can be selected at a time
	 * 
	 * if select tag - has multiple property/attribute ==> it is a multi select
	 * drop down
	 * 
	 * to know if select-has a multiple dropdown available
	 * On ide - do select dot and search for isMultiple(); methods available
	 * in the method overloaded drop down => suggestions list of eclipse 
	 * 
	 * e.g: 
	 * <select multiple size="6">
	 *      <option value = "American">American Flamingo</option>
	 *      
	 *      just interact with the select class dr down ele using FE
	 *      then pass the web Ele in the Select constructor as a param
	 *      Select sel = new Select("WE");
	 *      
	 *      sel.selectByVisibleText("American Flamingo");
	 *      
	 *      to deselect use deselectByVisibleText(); method
	 *      to capture all options getAllOptions();
	 *      to select first option getFirstSelectedOption();
	 *      
	 *      to select all selected options-getAllSelectedOptions();
	 *      
	 *      how to handle a dr down which is not Select based??
	 *      e.g: google search by entering a search phrase
	 *      solve the problem By writing xpath using parent tag, child tag
	 *      combination
	 *      figure out a pattern - and write xpath to select all suggestions
	 *      List
	 *      write a generic fn for this search without select tag--then
	 *      move the generic fn to the Element Util class-as soon as you 
	 *      move it there -- remove static key word, replace sendKeys() with
	 *      doSendKeys(); frome ur elementUtil, replace findElements() with
	 *      getElements() of ur element util
	 *      
	 *      Nav's assignment: on Groww.in - enter paytm in search and then 
	 *      u have to click on one suggestion
	 *      --enter HDFC bank
	 *      	WRITE GENERIC CODE FOR THE ABOVE SCENARIO
	 *      
	 *      bold items: on dom represented by b tag
	 *      single slash / ==> direct child
	 *      two forward slashes ==> collects indirect children as well
	 *      
	 *      ul - un-ordered list
	 *      
	 *      
	 *      utility -- is not responsible for creating the xpaths*****
	 * 
	 *      JQueryDrDown: 
	 *      url: jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette
	 *      
	 *      3 DOT : ... 
	 *      Also called Spread parameter which acts as a String []
	 * 
	 * 
	 * 
	 * 
	 */

}
