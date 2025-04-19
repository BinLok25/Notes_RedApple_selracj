package faqs99;

public class ReverseString1 {
	/*
	 * IQS???
	 * how to reverse a String?
	 * diff between String and StringBuffer class??
	 * do we have reverse function in String class?No
	 * 
	 */

	public static void main(String[] args) {
		String s = "Selenium";
		
		//1.using for loop:String is IMMUTABLE and no reverse() available
		int len = s.length();
		String rev = "";
		
		for(int i=len-1;i>=0;i--) {
			
			rev = rev + s.charAt(i);
			
		}
        System.out.println(rev);
        
        //2.using String Buffer class-MUTABLE and has reverse()
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse());
	}

}
