package faqs102;

public class Swap2Strings09 {

	public static void main(String[] args) {
		// to swap strings without using temp/third variable:
		String a = "Hello";
		String b = "World";
		
		System.out.println("before swapping:");
		System.out.println("the value of a is"+a);
		System.out.println("the value of b is"+b);
		
		//1. append a and b: and store in a
		a = a+b;//HelloWorld
		
		//2. store initial string a in String b:
		b = a.substring(0, a.length()-b.length());
		
		//3.store initial String b in String a:
		a = a.substring(b.length());
		
		System.out.println("the value of a and b after swapping");
		
		System.out.println("the value of a is:"+a);
		System.out.println("the value of b is:"+b);

	}

}
