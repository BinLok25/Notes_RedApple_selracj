package dec2023javaassignments;

public class SwitchCaseAndLocalVar14 {
	
	
	public int getStudentMarks(String studentName) {
		System.out.println("getting marks for the student: "+studentName);
		
		int marks = -1;
		
		switch (studentName.toLowerCase().trim()) {
		
		case "kinjal":
			marks = 40;
			return marks;
			
		case "sapna":
			marks = 20;
			return marks;
			
		case "ashwini":
			marks = 60;
			return marks;
		
			
		default:
			System.out.println("student name not found...."+studentName);
			return marks;
		}
	}
	
	//WAF: launchBrowser (name)
	//input param: string browserName
	//return: true/false(boolean)
	
	public boolean launchBrowser(String browserName) {
		System.out.println("browser name is: "+browserName);
		
		switch (browserName.toLowerCase().trim()) {
		
		case "chrome":
			System.out.println("chrome is launched");
			return true;
		case "edge":
			System.out.println("edge is launched");
			return true;
		case "firefox":
			System.out.println("firefox is launched");
			return true;
		case "ie":
			System.out.println("ie is launched");
			return true;
		case "safari":
			System.out.println("safari is launched");
			return true;

		default:
			System.out.println("plz pass the right browser..."+browserName);
			return false;
		}
		
	}
	

	public static void main(String[] args) {
		
		SwitchCaseAndLocalVar14 obj = new SwitchCaseAndLocalVar14();
		int m1 = obj.getStudentMarks("kinjal");
		
		System.out.println(m1);
		
		boolean isLaunched = obj.launchBrowser("chrome");
		System.out.println(isLaunched);
		
		if(isLaunched) {
			System.out.println("enter the URL");
		}
		

	}

}
