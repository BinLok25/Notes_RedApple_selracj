package dec2023javaassignments;

import dec2023javapracticals.User11;

public class ArrMethodsCollecsClassNObjNoRefObjs11 {
	
	/**
	 * default value of vc/initial capacity after the creation of ArrayList is 10
	 * ArrayList<String> ar = new ArrayList<String>(5);
	 * can we override the vc?? yes
	 * explicitly given the vc as 5
	 * ar.size(); --gives the physicalcapacity/pc
	 * 
	 * ar.add(); --increases the pc and decreases the vc
	 * load factor = pc/2
	 * 
	 * ArrayList<String> b = new ArrayList<String>(Arrays.asList("one","two","three"));
	 * 
	 * 
	 * ArrayList class: Methods
	 * indexOf(); ---gives the index of an ele from the Arrlist
	 * addAll(); removeAll();
	 * 
	 * set(); --will always replace
	 * add(); --will always add and shift*******VERY IMP
	 * 
	 * to maintain a blank list which is immutable:
	 * Collections.emptyList();
	 * 
	 * Right way of creating mutable empty list------>>>>>
	 * 
	 * ArrayList<String> footerLinksList = new ArrayList<String>();//mutable list
	 * 
	 * CLASS: is a category/blue print-of objs which are physically there in the world
	 * instance -- object
	 * from single category-can we create multiple objects?? yes
	 * blueprint -- is a prototype which describes how exactly the object is
	 * 
	 * no reference  objects -- are destroyed by garbage collector - ANTI PATTERN
	 * no reference object -- has no obj reference name
	 * 
	 * //no reference object: unnecessary space is occupied in memory
		new User11().name = "Tom";
		new User11().age = 40;
	 * 
	 *  Objects will get copies of class variables
	 * 
	 */

}
