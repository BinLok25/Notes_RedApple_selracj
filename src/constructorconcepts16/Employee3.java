package constructorconcepts16;

public class Employee3 {
	//class variables:
	String name;
	int age;
	double salary;
	boolean isActive;
	char gender;
	//What is the main purpose of creating the constructor??
	/**
	 * Acceptance criteria: in the user story - have to create an employee
	 * for the user registration form
	 * --if you do not have the user info - will you really create the user
	 * registration form?? No
	 * --so if you create the default constructor in this class - everyone
	 * will call the default constructor -- leading to unnecessary creation
	 * of objects
	 * ==>constructor is helping me to create the proper way of creating the
	 * objects
	 * --if i am saying that if you have the name of the employee and also
	 * the age of the employee -- then only you can create the object--makes
	 * sense?
	 * 
	 */
	
	public Employee3(String name, int age) {//constructor/local vars to constructor
		this.name = name;//local name pointing to global name var=>this.globalVar = localVar
		this.age = age;
	}

	public static void main(String[] args) {
	//	Employee3 e = new Employee3();//errs and stops the creation of unnecessary obj
    //without name and age -- could not create the obj==> we are saving the heap memory
	//here
		
		Employee3 e = new Employee3("Tom", 30);
		System.out.println(e.name);//null
		System.out.println(e.age);//0  -- still getting default values-so in the
		//constructor this.name = name  and this.age = age //local
	}

}
