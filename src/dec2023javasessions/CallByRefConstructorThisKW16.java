package dec2023javasessions;

import constructorconcepts16.Employee;

public class CallByRefConstructorThisKW16 {
	
	/**
	 * who is deciding which method needs to be called first??
	 * ----by interpreter or compiler
	 * DECIDED BY COMPILER -based on the arguments being passed - hence called
	 * compile time polymorphism
	 * depends upon the arguments being passed in the method--in case method
	 * overloading/polymorphism/compiletime  is happening
	 * 
	 * CallByValue:when calling the method we pass some argument/actualvalue as per the
	 * methods signature -- since we are passing the value when calling the method
	 * ---it is called call by value
	 * 
	 * CallByRef: means the object reference
	 * 
	 * 
	 * We have to restrict the unnecessary obj creation
	 * --------->>>is not the right way to create the objects
	 * 
	 * 
public class Employee {
	//is not the right way to create the objects --should take the help from constructor
	String name;
	int age;
	double salary;
	boolean isActive;
	char gender;
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.name = "Tom";
		
		Employee e2 = new Employee();
		e2.name = "BinAuto";
		e2.salary = 12.33;
		
		Employee e3 = new Employee();
		e3.name = "Tom";
		e3.age = 40;
		e3.salary = 34.33;
		
		Employee e4 = new Employee();
		e4.name = "Peter";
		e4.age = 40;
		e4.salary = 34.33;
		
		
		
		
	}
	

}
	 * the right way of creating the object is Employee2.java
	 * ------------->>>>>>>
	 * public class Employee2 {
	
	String name;
	int age;
	double salary;
	boolean isActive;
	char gender;
	
	//const...name will be same as the class name
	//const...can not return anything/no void also/no return type
	//const... can be overloaded
	//const...will be called when you create the object of the class
	
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
	 * 
	 * CAN WE WRITE THE BUSINESS LOGIC INSIDE A CONSTRUCTOR? NO
	 * 	------imp IQ
	 * Since it is not a function and also it does not return 
	 * any thing - so never write the Business logic inside a 
	 * fn
	 * 
	 * 
	 * 
	 * PURPOSE OF CONSTRUCTOR: is to restrict unnecessary object
	 * creation
	 * //1.const...name will be same as the class name
	//2.const...can not return anything/no void also/no return type
	//3.const... can be overloaded
	//4.const...will be called when you create the object of the class
	//5.const...is used for initializing the class variable with the
	//constr...local vars using the keyword this
	//6.constr...is used to restrict the unnecessary obj creation
	//7.constr...is used for initialization purpose not for business logic
	 * //const...is used to restrict the object creation - depends on the use case
	//const...is used for initialization purpose only not for business logic
	//but function is used for business logic which may or may not return
	 * //8. constr... calling should be the first statement in the class
	 * 
	 * fn will be called multiple times whereas a constructor is called only when
	 * the specific obj is initialized
	 * fns should have the business logic
	 * 
	 * BUT function is for business logic -- that may or may not
	 * return anything
	 * 
	 * IQ] Diff between fn and constructor??
	 * Q] can we call the fn from inside the constructor? yes
	 * 
	 * MEMORY ARCHITECTURE: of Employee.java
	 * -----------------
	 * Heap: for objects-JVM calls GC to clean this
	 * Stack: execution and stack vars => obj ref names-cleaning is
	 * done because of LIFO
	 * CMA : for static vars and also static methods => main() as well
	 * class: will also occupy some auxiliary space - done by class
	 * loaders -- nothing related to heap
	 * class loader - is a component in the jdk that comes alongwith jre, which helps
	 * to load the class with the help of class loader
	 * 
	 * 
	 * REVISION: 
	 * main() -- can be overloaded
	 * static, non-static, any kind of method can be overloaded
	 * 
	 */

}
