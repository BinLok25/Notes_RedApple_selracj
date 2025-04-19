package dec2023javasessions;

import dec2023javapracticals.FunctionTest14;

public class MethodExsWithSwCaseIfElseRetrurnMethodOverL14 {
	
	/**
	 * 
	 * Before writing a fn: write the requirements first-what exactly is the
	 * reqment, what exactly is the acceptance criteria??--in jira we write
	 * in the UserStory
	 * --have to return the student marks => give the student name
	 * 
	 * WAF: function Name: getStudentMarks
	 * input Param: student Name(String)
	 * return: marks(int)
	 * student not found --> return something
	 * 
	 * 1.way of writing a method:
	 * -----------------without declaring an initial var
	 * public int getStudentMarks(String studentName) {
		System.out.println("getting marks for student: "+studentName);
		
		if(studentName.equalsIgnoreCase("devika")) {
			return 90;
		}else if(studentName.equalsIgnoreCase("ravi")) {
			return 95;
		}else if(studentName.equalsIgnoreCase("naveen")) {
			return 10;
		}else {
			System.out.println("student name not found...plz pass the right student name "+studentName);
			return -1;
		}
	
	}

	public static void main(String[] args) {
		FunctionTest14 obj = new FunctionTest14();
		int m1 = obj.getStudentMarks("tom");
		System.out.println(m1);
		
		if(m1==1) {
			System.out.println("no need to print the marksheet");
		}
		else {
			System.out.println("print marksheet");
		}
	}

	 * 
	 * 
	 * 
	 * 
	 */
	//2nd way: of declaring a fn by declaring an initial var:
	
	/**
	 * 
	 * public int getStudentMarks(String studentName) {
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

	public static void main(String[] args) {
		FunctionTest14 obj = new FunctionTest14();
		int m1 = obj.getStudentMarks("tom");
		System.out.println(m1);
		
		if(m1==1) {
			System.out.println("no need to print the marksheet");
		}
		else {
			System.out.println("print marksheet");
		}
	}

	 * 
	 * 
	 *
	 * 
	 */
	/**
	 * 
	 * SWITCH : 
	 * boolean condition not allowed in a switch statement
	 * return and break cannot go together in a switch statement
	 * return itself acts as a break
	 * can do multiple break statements with one single return statement
	 * can do multiple return statements with one single break statement
	 * 
	 * Method Overloading Concept:
	 * ---------
	 *  //duplicate methods are not allowed
	 *  common thing in all the methods below - same name
	 *  when you have diff methods with:
	 *  1. with the same name
	 *  2. with different parameters(diff number of params)and diff type of params
	 *  3. with different sequence of the params in case of the same number of params
	 *  4. return type doesnot matter
	
	public void test() {//0 param
		
	}
	public int test() {//0 param //duplicate since return type doesnot matter
		return 100;
	}
	public String test() {//0 param //duplicate since return type doesnot matter
		return "testing";
	}

	public void test(int i) {// 1 param overloading 

	}

	public void test(int l, int j) {// 2 params-

	}

	public void test(int l, String k) {// 2 params-diff sequence

	}
	
	public void test(String k, int l) {// 2 params

	}
	 * 
	 * IQ] is main method overloading  possible/allowed in java?? yes
	 * BUT jvm always looks for PSVM(String[]args){} type of main method
	 * 
	 * what is the purpose of the main method??
	 * the caller method/main method should not have any business logic
	 * 
	 */

}
