package dec2023javasessions;

public class StrImmutableStrConstantPoolEqsAndDoubEqlToStr_RegExps26 {

	/**
	 * System.out.println(s1==s2); System.out.println(s4==s3);//scp=heap //cannot
	 * compare heap refs with double equal to - will always give false //it will
	 * always compare their respective memory address not their value
	 * 
	 * dotequals() -- always compares the values double=s --compares the references
	 * 
	 * best practice: to always use dotequals() to compare 2 strings
	 * 
	 * String regex to escape some characters: "\\s" ==> one space "\\s+" ==> more
	 * than one space "\\D" ==> digits "\\d" ==> more digits
	 * 
	 * String Literals: => without new key word - creation of string String s1 =
	 * "Hello";// only one created in SCP String s2 = "world"
	 * 
	 * String s3 = new String("world"); --with the above line 2 objs created - one
	 * in SCP and one outside on heap SCP concept: inside heap there is this area
	 * 
	 * garbageCollector: applied to SCP as well since within the
	 * heap memory 
	 * 
	 * can we have duplicate objects inside the heap? yes
	 * But inside SCP -- only unique ones
	 * .equals --- always compares the values
	 * whereas == compares their references
	 * 
	 */

}
