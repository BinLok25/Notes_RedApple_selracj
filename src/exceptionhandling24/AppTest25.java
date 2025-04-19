package exceptionhandling24;

public class AppTest25 {
	
	public static void main(String[] args) {
		
		String browser = "ie";
		
		if(browser.equals("chrome")) {
			System.out.println("open chrome");
		}
		else if(browser.equals("firefox")) {
			System.out.println("open firefox");
		}
		else if(browser.equals("safari")) {
			System.out.println("open safari");
		}
		else {
			System.out.println("plz pass the right browser....");
			throw new MyException("WRONG BROWSER EXCEPTION");
		}
		
		System.out.println("launch url");
		
		
	}

}
