package selenium;

public class SelectClassDrDownHandling9 {
	
	/**
	 * Select Dr down Concept:
	 * ----------------------
	 * use orangehrm.com/30-day-free-trial
	 * Dropdowns where select tag is there--will come with no. of options
	 * ==> select is parent and options is the child
	 * 
	 * Select -- is a pre-defined class in sel
	 * select|ctrl+space
	 * -->will give only one constructor that takes WE as the parameter
	 * 
	 * Select class has 3 methods-selectByIndex(), SelectByVisibleText(), 
	 * SelectByValue()
	 * 
	 * SelectByValue() is better than to use selectByIndex()
	 * SelectByIndex() is better used when there is fixed no of indices
	 * 
	 * DISADVANTAGE: is that if there are 10 drop downs - for each dr down u need
	 * to create one select class obj
	 * 
	 * any method name after which on ide keep the cursor ctrl+shift+2 and one step
	 * down and enter
	 * 
	 * selectByIndex() -- is risky as the position of the webelement might change
	 * in the future
	 * --is suitable when dr downs indices are fixed like days of week
	 * 
	 * selectByValue() -- has a text value for the webelement on dom with the
	 * property/attribute called value(which is nothing BUT text)--this text is
	 * seen on the dropdown
	 * 
	 */

}
