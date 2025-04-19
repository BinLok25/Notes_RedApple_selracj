package dec2023javapracticals;

public class AsciiTableForChars07 {

	public static void main(String[] args) {
		
		System.out.println("---1-Print ascii table for chars a to z-----");
		
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch+"="+(byte)ch);
		}
		
		
		System.out.println("---2-Print ascii table for chars 0 to 9-----");
		
		for(char ch='0';ch<='9';ch++) {
			System.out.println(ch+"="+(byte)ch);
		}
		
		
		System.out.println("---3-Print ascii table for chars A to Z-----");
		
		for(char ch='A';ch<='Z';ch++) {
			System.out.println(ch+"="+(byte)ch);
		}

	}

}
