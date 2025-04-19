package extrafaqs;

public class ChkOddOREven07 {

	public static void main(String[] args) {
		//using modulus(%) operator:
		
		for(int num=0; num<=10; num++) {
			if(num % 2== 0) {
				System.out.println(num+" is even");
			}
			else {
				System.out.println(num+"is odd");
			}
		}

	}
}

