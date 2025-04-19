package faqs102;

public class Swap2vars08 {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		
		//x=10, y=5;
		
		//1. with using 3rd var:
//		int t;
//		t=x;
//		x=y;
//		y=t;
//		
//		System.out.println(x);
//		System.out.println(y);
		
		//2.Not using temp var: t
//		x= x+y;//15
//		y= x-y;//5
//		x= x-y;//-5
//		
//		System.out.println(x);
//		System.out.println(y);
//		
		//3.without using temp var: using * operator
//		x= x*y;
//		y= x/y;
//		x= x/y;
//		
//		System.out.println(x);
//		System.out.println(y);
		
		//4.using BitWiseConversion: XOR
		x = x ^ y;//15 --> 1111
		y = x ^ y;//10 --> 1010
		x = x ^ y;//5 --> 0101
		
		System.out.println(x);
		System.out.println(y);
		
		
		

	}

}
