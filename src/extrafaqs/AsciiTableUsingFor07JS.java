package extrafaqs;

public class AsciiTableUsingFor07JS {

	public static void main(String[] args) {
		//ascii table printing:
	System.out.println("<----ascii table print---->");	
		for(char ch='0';ch<='9'; ch++) {
			System.out.println(ch +"="+(byte)ch);
		}

	}

}
