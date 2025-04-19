package sdetintquestions30;

public class SwappingTwoNums01 {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		System.out.println("before swapping values..."+a+" "+b);
		
		//logic 1 - third variable
		int t = a;
		a=b;
		b=t;

		System.out.println("after swapping values..."+a+" "+b);
	}

}
