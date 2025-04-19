package string_manipulation25;

public class FinallyBlockQuestion27 {
	
	//try -- finally -- yes
	//try -- catch -- yes
	//try -- no
	//catch -- finally -- no
	//try -- catch -- finally -- yes
	//try -- try --catch -- finally -- no
	//try - catch-- finally -- finally -- no
	
	public static int getMarks(String studentName) {
		System.out.println("getting marks for: "+studentName);

		if (studentName.equals("rahul")) {
			try {
				int i = 9 / 0;
				return 80;
			} catch (ArithmeticException e) {
				System.out.println("AE is coming..");
				return 70;
			} finally {
				System.out.println("finally block");
				return 60;
			}
		} else if (studentName.equals("om")) {
			return 95;
		} else if (studentName.equals("BinAuto")) {
			return 10;
		} else {
			System.out.println("plz pass the right student name...");
			return -1;
		}
//		return 0;  //since unreachable

	}
	

	public static void main(String[] args) {
		int m = getMarks("om");
		System.out.println(m);

	}

}
