package dec2023javapracticals;

public class User11 {
	
	//category - blueprint - class --prototype, template/generic form
	//instance -- object
	//Human -- class -- properties: name, eyes, address, nose, height
	//laptop -- class: name, size, color, price
	
	//class variables : data members
	String name;
	int age;
	String city;
	String telephone;
	double salary;
	boolean isActive;
	
	//now how to define the values??
	
	public static void main(String[] args) {
		
		//create the object of the class: using the new keyword
		User11 u1 = new User11();
		
		//User11 - class
		//u1 --> object reference name
		//new User11(); --> Object
		//the type of u1 is User11
		
		u1.name = "Gunel";
		u1.age = 30;
		u1.city = "Bangalore";
		u1.telephone = "9084332845";
		u1.salary = 12.33;
		u1.isActive = true;
		
		System.out.println(u1.name);
		System.out.println(u1.isActive);
		
		System.out.println("---u2 user info---");
		User11 u2 = new User11();
		
		//how many photo copies of class vars-two copies - one each to u1 and u2
		//how many objs - two
		//default value of name - a String - is null
		
		System.out.println(u2.name);
		System.out.println(u2.age);
		System.out.println(u2.city);
		System.out.println(u2.telephone);
		System.out.println(u2.salary);
		System.out.println(u2.age);
		System.out.println(u2.isActive);
		
		System.out.println("---u3 user info---");
		
		User11 u3 = new User11();
		
		u3.name = "Devika";
		u3.age = 30;
		u3.city = "Bangalore";
		u3.telephone = "9084332845";
		u3.salary = 64.33;
		u3.isActive = true;
		

		System.out.println(u3.name);
		System.out.println(u3.age);
		System.out.println(u3.city);
		System.out.println(u3.telephone);
		System.out.println(u3.salary);
		System.out.println(u3.age);
		System.out.println(u3.isActive);
		
		System.out.println(u3);
		
		//no reference object: unnecessary space is occupied in memory
		new User11().name = "Tom";
		new User11().age = 40;
		
		
	}

}
