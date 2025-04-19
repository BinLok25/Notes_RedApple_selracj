package selenium;

public class JavaStreamUseCasesWithLambda26 {
	
	/**
	 * 
	 * //regex: is a special kind of string which is supported in all ProgLs
	//with the help of which u can create a combination/pattern of a specific
	//string -- domain.replaceAll(regex, replacement);
	// "\\s+" -->>removes spaces more than one when used as a regex-deals with only
	 * one digital exp in a String
	 * //"\\D+" -->>to remove non numeric values-space is also a non numeric value
	//D --denotes digit
	 * 
	 * Pattern.compile("\\d+"); to deal with more than one digital exp in string
	 * ---->Pattern is a class available in java
	 * has to be used along with Matcher class reference
	 * ---import from java.util.regex
	 * 
	 * Streams: means a sequential stream/a parallel stream applied to a
	 * List of WebElements(an object)to collect all the individual eles again
	 * which will be in sequential order again As List is order based collection
	 * From this stream -- can do various operations, like sorting in ascending/
	 * descending order
	 * and apply forEach(e->) which acts like a for loop with no index
	 * and write a var name e which represents all eles one by one
	 * and we say e - u go to each WebElement of the List and do something
	 * and for doing something u supply with a lamda(front pointing arrow)
	 * .forEach(e->System.out.printLn(e.getText()))
	 * supplying e to the right side operation
	 * 
	 * FlipCart with Streams:
	 * whenever we have to interact with multiple eles-we have to use 
	 * driver.FEs();
	 * n store in a List<WebElement> variable
	 * and iterate with a for/for each loop to print all values
	 * 
	 * Streams:
	 * is a kind of no. of operations u can perform on a list only(an ArrayList)
	 * 
	 * u apply a stream method to the list of WebElements to do all operations
	 * -Sorting, iterating, collecting ...etc of the webEles in the list
	 * linksList.stream().forEach(e->e.getText())
	 * 
	 * can do some filterwork on a stream as well 
	 * linksList.stream().filter(e.getText().isEmpty())
	 * 
	 * Whenever u r using Streams()
	 * ---use with limited data
	 * 
	 * streams() are slower when compared with a for loop
	 * if the data is too much -- using streams() will have performance issue
	 * 
	 * dis advantages:
	 * use with limited data
	 * debugging is hard
	 * 
	 * map(): is used to transforms the webEle from one form to another
	 * 
	 * collect() : helps to collect data from streams
	 * 
	 * 
	 * Functional Programming: has to be done when data is minimal
	 * 
	 * sequence vs parallel streams
	 * 1.sequence stream:
	 */

}
