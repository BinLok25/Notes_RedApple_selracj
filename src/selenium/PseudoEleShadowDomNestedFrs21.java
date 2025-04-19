package selenium;

public class PseudoEleShadowDomNestedFrs21 {
	/**
	 * 
	 * pseudoElement:
	 * e.g: the asterisk symbol that says that a field is mandate
	 * usually represented by ::before, ::after, that are also called as
	 * pseudoclasses
	 * 
	 * pseudoclasses : are part of your html dom and do not have any
	 * property/attribute- it has only content: * written in the style tab
	 * 
	 * java script code which would fetch the *
	 * window.getComputedStyle(document.querySelector('css selector for pseudoele','::before').getPropertyValue('content'));
	 * 
	 * ---the above line will fetch/gives result as a * (the pseudoelement)
	 * 
	 * ShadowDom: what is it??is used to prevent data sniffing 
	 * ---------not ghost text
	 * e.g: of shadow dom:
	 * go to chrome and its settings page ==>type below string on url bar
	 * chrome//settings 
	 * then type notifications in the search bar
	 * 
	 * When u right click and inspect the element-will see tag ||r
	 * to #shadow-root (open)
	 * ---is like a container that the dev was using when designing the page
	 * --which is very light weight and also very secure
	 * --in order to automate this  shadow root - it has to be in open state
	 * --if not in open state-need to talk to developer
	 * --there is no direct method available in sel to automate this
	 * --right click on the tag of the shadow root on dom and copy the 
	 * JS path and paste it on the console
	 * which will give the complete path of the shadow root ele
	 * 
	 * autopiercing:
	 * -------------
	 * 
	 * 
	 * sc1: on browser-->page-->shadowDom(open)--element
	 * sc2: on browser--page-->shadowDom(open)-->iframe --element
	 * 
	 * 
	 * sel 4.x NewFeature:
	 * --------
	 * driver.switchTo().parentFrame();
	 * the parentFrame() method is introduced to overcome the default switch
	 * to the main window
	 * 
	 * 
	 */

}
