package faqs99;

public class ReverseAnInteger3 {

	public static void main(String[] args) {
		
		//1.using algo:
		int num = 12345;
		int rev = 0;
		
		while(num!=0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
       System.out.println("Reverse of num is "+rev);
       
       //2. using StringBuffer method:
       long num1 = 12345;
       StringBuffer rev1 = new StringBuffer(String.valueOf(num1)).reverse();
       System.out.println(rev1);
	}

}
