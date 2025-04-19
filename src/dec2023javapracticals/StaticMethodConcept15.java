package dec2023javapracticals;

public class StaticMethodConcept15 {
	
	public static String name;
	public int age;
	
	public static void getInfo() {
		System.out.println("get info");
	}
	public void sendMail() {
		System.out.println("send mail");
	}

	public static void main(String[] args) {
		//call static var and methods:
		//1.by using class name:
		StaticMethodConcept15.name = "Tom";
		System.out.println(StaticMethodConcept15.name);
		
		StaticMethodConcept15.getInfo();
		
		//call non static method: create the object
		StaticMethodConcept15 obj = new StaticMethodConcept15();
		obj.age = 10;
		obj.sendMail();
		
		//2.can access static vars and methods using obj ref name, but with
		//a warning: not recommended
		System.out.println(obj.name);
		obj.getInfo();
		
		//3.can I access static var and method directly? - without class name
		System.out.println(name);
		getInfo();
		

	}

}
