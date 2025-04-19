package dec2023javapracticals;

public class FunctionTest14 {
	
	
	
	// WAF: function Name: getStudentMarks
	// input Param: student Name(String)
	// return: marks(int)
	// student not found --> return something
	
	public int getStudentMarks(String studentName) {
		System.out.println("getting marks for student: "+studentName);
		
		int marks = -1;
		
		if(studentName.equalsIgnoreCase("devika")) {
		//	return 90;
			marks = 90;
		}else if(studentName.equalsIgnoreCase("ravi")) {
		//	return 95;
			marks = 95;
		}else if(studentName.equalsIgnoreCase("naveen")) {
		//	return 10;
			marks = 10;
		}else {
			System.out.println("student name not found...plz pass the right student name "+studentName);
		//	return -1;
		}
	  return marks;
	}
	
	public int getMarks(String studentName) {
		System.out.println("getting the marks for the student: "+ studentName);
		
		switch (studentName.toLowerCase().trim()) {
		case "devika":
			return 95;
		case "ravi":
			return 90;
		case "naveen":
			return 10;
			

		default:
			System.out.println("student name not found...plz pass the right studentname "+studentName);
			return -1;
		}
		
		
	}

	public static void main(String[] args) {
		FunctionTest14 obj = new FunctionTest14();
		int m1 = obj.getStudentMarks("tom");
		
		int m2 = obj.getMarks("ravi");
		System.out.println(m2);
		
		if(m1==-1) {
			System.out.println("no need to print the marksheet");
		}
		else {
			System.out.println("print marksheet");
		}
	}

}
