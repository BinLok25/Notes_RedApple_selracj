package dec2023javapracticals;

public class MethodChaining15 {
	
	//overloading the method test() - METHOD OVERLOADING CONCEPT
//	public static void test() {
//		
//	}
//	public static void test(int a) {
//		
//	}
//	public static void test(int a, String b) {
//		
//	}
	
	public static void t1() {
		System.out.println("t1 method");
		t2();
	}

	public static void t2() {
		System.out.println("t2 method");
		t3();
	}

	public static void t3() {
		System.out.println("t3 method");
		//create the object
		MethodChaining15 obj = new MethodChaining15();
		obj.m1();//calling nonstatic obj m1 from static method:
	}
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	public void m3() {
		System.out.println("m3 method");
		t1();
	}
	
    //PSVM - String[]
	public static void main(String[] args) {
		//MethodChaining15.t1();
		MethodChaining15 obj = new MethodChaining15();
		obj.m1();
		
		//s - s --> class name.methodname/directly
		//NS -- NS --> directly
		//s - NS --> create the object
		//NS -- s --> classname.method name/directly
		
		//main() - m
		//m -- s --> class name.method name/directly
		//m -- NS --> create the object

	}

}
