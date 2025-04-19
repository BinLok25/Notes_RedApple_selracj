package dec2023javapracticals;

public class CondiStmentsIfElseSwitchCase05 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		// == >= <= < > !=  are all comparison operators
		System.out.println(x>y);
		
		//conditional statements:
		
		if(x>y) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		//2.control statement:
		if(true) {
			System.out.println("if-true, reachable");
			System.out.println("Hi");
		}
//		else {// all dead/unreachable code-control never comes inside here
//			System.out.println("Bye");
//		}
		
		//3.control statement:
		if(false) { //Dead/unreachable code
			System.out.println("Hi");
		}
		else {
			System.out.println("else part reachable");
			System.out.println("Bye");
		}
		
		//
		boolean flag = true;
		if(flag) {
			System.out.println("Hello");
		}
		else {
			System.out.println("World");
		}
		//
		int t1 = 200;
		int t2 = 100;
		
		if(t1>t2) {
			System.out.println("t1 and t2 are gr than or equal");
		}
		//can u write control statement only with else part: NO
		
		//
		int p1 = 100;
		int p2 = 200;
		if(p1!=p2) {
			System.out.println("selenium");
		}
		
		//multiple if conditions: can be written-else is associated with the last if condition
		//is horrible code: not right way
		//last if will create a pair with else
//		String browser = "chrome";
//		if(browser.equals("chrome")) {
//			System.out.println("launch chrome browser");
//		}
//		if(browser.equals("firefox")) {
//			System.out.println("launch firefox browser");
//		}
//		if(browser.equals("edge")) {
//			System.out.println("launch edge browser");
//		}
//		if(browser.equals("safari")) {
//			System.out.println("launch safari browser");
//		}
//		else {
//			System.out.println("plz pass the right browser....");
//		}
		
		//has performance issue if browser equals last browser-safari
		//will chk all 4 conditions--->better BUT performance issue
		String browser = "chrome";
		if(browser.equals("chrome")) {
			System.out.println("launch chrome browser");
		}
		else if(browser.equals("firefox")) {
			System.out.println("launch firefox browser");
		}
		else if(browser.equals("edge")) {
			System.out.println("launch edge browser");
		}
		else if(browser.equals("safari")) {
			System.out.println("launch safari browser");
		}
		else {
			System.out.println("plz pass the right browser....");
		}
		
		//Switch Case: better than previous 2 : no performance issue
	}

}
