package dec2023javapracticals;

public class SwitchCaseStment05 {

	public static void main(String[] args) {
		// Switch case : better than if-else if- ....else statements
		//for multiple conditions
		//will not chk line by line N jumps directly to the particular case
		//so no performance issue
		
		String browser = "chrome";
		
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome browser");
			break;
		case "firefox":
			System.out.println("launch firefox browser");
			break;
		case "edge":
			System.out.println("launch edge browser");
			break;
		case "safari":
			System.out.println("launch safari browser");
			break;

		default:
			System.out.println("plz pass the right browser...");
			break;
		}
		
		//switch case to find vowels: case 'a'|'A': doesnot work
		char c = 'A';
		switch (c) {
		case 'a':
			System.out.println("a is a vowel");
			break;
		case 'e'|'E':
			System.out.println("e is a vowel");
			break;
		case 'i':
			System.out.println("i is a vowel");
			break;
		case 'o':
			System.out.println("o is a vowel");
			break;
		case 'u':
			System.out.println("u is a vowel");
			break;

		default:
			System.out.println(c+" is a consonant");
			break;
		}
	}

}
