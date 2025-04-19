package faqs102;

public class StringManipulation07 {

	public static void main(String[] args) {
		
		String str = "The rains have started here in Mississipi";
		String str1 = "The rains have started here";
		String str2 = "The rains Have started here";
		
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('s'));//8
		
		//to find the index of second s	
		System.out.println(str.indexOf('s', 9));
		System.out.println(str.indexOf('s', str.indexOf('s')+1));//15
		
		//to find the third occurrence of s		
		System.out.println(str.indexOf('s', str.indexOf('s', str.indexOf('s')+1)+1));//33
		
		System.out.println(str.indexOf("have"));//can find the index of String as well as char
		
		System.out.println(str.indexOf('T'));
		
		//in case of string not there results in -1
		System.out.println(str.indexOf("hello"));
		/*
		 * this concept of a return of -1 in case of index not available is very useful in
		 * selenium -- to write code to assert if a particular string is available/or not
		 * 
		 */

		//String comparison: since java is case sensitive should be exact
		System.out.println(str1.equals(str2));//false
		System.out.println(str1.equalsIgnoreCase(str2));//true
		
		//substring
		System.out.println(str1.substring(0, 9));
		
		//trim: trims only for before/after the phrase spaces
		String str3 = "    Hello   world    ";
		System.out.println(str3);
		
		System.out.println(str3.replaceAll(" ", ""));
		
		String date = "01-03-2021";
		System.out.println(date.replaceAll("-", "/"));
		
		//split():returns one string array => testval[]
		String test = "hello_world_test_selenium";
		
		String testval[] = test.split("_");
		for(int i=0;i<testval.length;i++) {
			System.out.println(testval[i]);
		}
		
		String s2 = "cares";
		System.out.println(s2.concat("s"));
		
		String x = "hello";
		String y = "world";
		
		int a = 100;
		int b = 200;
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
	}

}
