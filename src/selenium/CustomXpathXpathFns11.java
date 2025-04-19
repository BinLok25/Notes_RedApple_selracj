package selenium;

public class CustomXpathXpathFns11 {
	/**
	 *
	 * //* ==> gives all the eles--traverses thru each ele-is not faster since * takes
	 * to each and every ele so makes it slower--soo better to avoid * in xpath
	 * * means consider every thing
	 * //[@id]
	 * 
	 * how to create Custom xpath??
	 * ------------is address of the ele on the html dom
	 * is used to identify the element on the dom
	 * X means xml -- so also called xml path
	 * 2 Types:
	 * 1.absolute xpath
	 * is risky since in future more eles added on dom-the address changes
	 * starts with one forward slash--has all forward slashes in between as well
	 * 
	 * 2.relative xpath(custom xpath)-uses any attribute
	 * formulae to create:
	 * 2 forward slashes + tagname+square brackets-inside which @attriname='value'
	 * 
	 *  // keep adding the attri with values until the filter reaches 1x1
	 * 1 //input[@tagname]
	 * 2 //input[@value='Login']
	 * 3 //input[@value='Login' and @attri2='value'and @attri3='value']
	 *  //input[@type='text' or @type='email']
	 * attribute and property BOTh are the same
	 * 
	 * ---Nav Notes:
	 * ---->>
	 * capture group: ==> put the entire xpath inside () and then add [3]
	 * 
	 * Right Way: of using index --> capture in a capture group and then 
	 * provide the index in square brackets => [3]
	 * 
	 * 
	 * 
	 */
	
	//Xpath: address of the element in the Dom
			//XMLPath
			//1. absolute xpath
			//html/body/div[2]/div/div[1]/div/h2/h4/a
			//relative xpath(custom xpath)
			
			//1. using single attr:
			//tagname[@attrname = 'value']
			//input[@id = 'input-email']
			//input[@name='email']
			
			//input[@name] --5
			//input[@value='Login'] --1
			
			//2. using multiple attrs:
			//tagname[@attr1='value' and @attr2='value' and @attr3='value']
			//input[@type='submit' and @value='Login'] ---1
			
			//input[@type='submit'] --3
			//input[@type='text' or @type='email']
			//input[@type and @value='Login']
			//input[@type and @value]
			//a[@href]
			
			//3. text():
			//h2 
			//tagname[text()='textValue']
			//h2[text()='New Customer']
			//a[text()='Desktops']
			
			//4. text() and attributes:
			//tagname[@attr='value' and text()='value']
			//a[@class='dropdown-toggle' and text()='Desktops']
			//a[@class='dropdown-toggle' and text()='Desktops' and data-toggle='dropdown']
			//a[text()='Desktops'and @class='dropdown-toggle' and data-toggle='dropdown']
			
			//5. contains() with attr:
			//tagname[contains(@attrName, 'value')] 
			//input[contains(@placeholder, 'E-mail')]
			//input[contains(@placeholder, 'Address')]
			
			//tagname[contains(@attrName1, 'value') and @attr2='value']
			//input[contains(@placeholder, 'Address') and @name='value']
			//input[contains(@placeholder, 'Address') and @name='email' and contains(@id,'email')]
			//a[contains(@href, 'wishlist')]
			
			//dynamic ids:
			//<input id=first_123 />
			//<input id=first_345 />
			//<input id=first_900 />
			//<input id=first_987 />
			
			//input[contains(@id, 'first_')]
			
			//6. contains with text():
			//tagname[contains(text(), 'value')]
			//p[contains(text(), 'Customer service', IT, and CRM software')]
			//a[contains(text(), 'Customer')]
			
			//7. contains() with text() and attr:
			//tagname[contains(text(), 'value') and contains(@attr, 'value')]
			//a[contains(text(), 'Notebooks') and contains(@href, 'category&path')]
			
			//tagname[contains(text(),'value') and contains(@attr1, 'value') and @attr2='value']
			
			//8. starts-with():
			//tagname[starts-with(@attr, 'value')]
			//input[starts-with(@placeholder,'E-mail')]
			
			//9. starts-with() with text():
			//tagname[starts-with(text(), 'value')]
			//a[starts-with(text(), 'Forgotten')]
			
			//dynamic ids:
			//<input id=firstname_123_login />
			//<input id=123_firstname_login />
			
			//10. ends-with() is not supported in xpath
			
			//11. index based xpath: storing xpath inside the capture gp-AVOID as much as possible
			//(//a(text()='Forgotten Password')[1]
			//(//a[@class='list-group-item')[13]
			//(//input[@class='form-control')[6]
			//(//input[@class='form-control')[position()=4]
			//(input[@class='form-control')[4]
			//(//input[@class='form-control')[last()]
			
			// ((//div[@class='navFooterLinkCol navAccessibility')[last()]//a)[last()]

			// ((//div[@class='navFooterLinkCol navAccessibility')[last()]//a)[last()-last()+1]
	
	

}
