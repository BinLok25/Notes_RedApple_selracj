package constructorconcepts16;

public class Employee {
	//is not the right way to create the objects --should take the help from constructor
	String name;
	int age;
	double salary;
	boolean isActive;
	char gender;
	
	//const...name will be same as the class name
	//const...cannot return anything/no void also/no return type
	//const... can be overloaded
	//const... will be called when we create the obj of the class => in main()
	//const...is used to initialize the class vars with the const...local vars using this keyword
	//const...is used to restrict the object creation - depends on the use case
	//const...is used for initialization purpose only not for business logic
	//but function is used for business logic which may or may not return
	//const...is called only when the object is created
	public Employee() {//0 param const...//the moment u comment this constr.. starts to 
		//give error in main()--since u restrict creation of an obj
		
	}
	public Employee(int i) {//1 param
		System.out.println(i);
	}
	public Employee(int i, String s) {
		System.out.println(i+s);
	}
	
	//e1, e2, e3...will occupy lots of memory on heap -- with multiple/one for each photocopies of
	//class vars given to each obj -- so not right way to create the objs
	//so need to take the help of constructor -- which assigns class var to local var
	//using this key word
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.name = "Tom";
		
		Employee e2 = new Employee();
		e2.name = "BinAuto";
		e2.age = 15;
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
