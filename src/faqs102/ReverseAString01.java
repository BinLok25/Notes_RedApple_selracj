package faqs102;

public class ReverseAString01 {

	public static void main(String[] args) {
		// String is immutable so s.reverse() is not available
		//StringBuffer is mutable : so reverse() is available
		
		String str = "selenium";
		//1.using for loop
		int len = str.length();
		
		String rev = "";
		
		for(int i=len-1;i>=0;i--) {
			rev = rev + str.charAt(i);	//m
		}
       System.out.println(rev);
		
		//2.using StringBuffer class:
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
