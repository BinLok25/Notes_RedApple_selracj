package dec2023javasessions;

public class Employee2 {
	
	String name;
	int age;
	double salary;
	boolean isActive;
	char gender;
	
	//1.const...name will be same as the class name
	//2.const...can not return anything/no void also/no return type
	//3.const... can be overloaded
	//4.const...will be called when you create the object of the class
	//5.const...is used for initializing the class variable with the
	//constr...local vars using the keyword this
	//6.constr...is used to restrict the unnecessary obj creation
	
	
	//below can be said as constructor overloading--respective constructor will be called
	//based on the args being passed - compiler takes decison at runtime based on no of args
	public Employee2() {//0 param - default const...
		System.out.println("emp - default const....");
	}
	public Employee2(int i) {//1 param
		System.out.println(i);
	}
    public Employee2(int i, String s) {//2 params
    	System.out.println(i+s);
    }
	public static void main(String[] args) {
		

	}

}
