package dec2023javapracticals;

public class MaxNumber06 {

	public static void main(String[] args) {
		//find out the max number...three diff numbers:
		
		int a = 300;
		int b = 600;
		int c = 1000;
		
		if(a>b && a>c) {
			System.out.println("a is the greatest");
		}
		else if(b>c) {
			System.out.println("b is the greatest");
		}
		else {
			System.out.println("c is the greatest");
		}
		System.out.println("**********************");
		//find max amongst four numbers:HW
		int x = 1400;
		int y = 1600;
		int z = 20000;
		int w = 21000;
		
		if(x>y && x>z && x>w) {
			System.out.println("x is greatest");
		}
		else if(y>z && y>w) {
			System.out.println("y is greatest");
		}
		else if(z>w) {
			System.out.println("z is greatest");
		}
		else {
			System.out.println("w is the greatest");
		}
	}

}
