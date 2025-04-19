package dec2023javapracticals;

public class Car12 {
	
	String name;
	String licenseNum;
	double price;
	String color;
	static final int wheels = 4;

	public static void main(String[] args) {
		
		Car12 c1 = new Car12();
		c1.name = "BMW";
		c1.licenseNum = "12121";
		c1.price = 80.11;
		c1.color = "Red";
//		c1.wheels = 4;
		
		
		Car12 c2 = new Car12();
		c2.name = "Audi";
		c2.licenseNum = "323232";
		c2.price = 82.11;
		c2.color = "Black";
//		c2.wheels = 4;
		
		
		Car12 c3 = new Car12();
		c3.name = "Honda";
		c3.licenseNum = "434343";
		c3.price = 22.11;
		c3.color = "White";
//		c3.wheels = 4;
		
		//how to acccess the static var:
		//1. using class name:
		System.out.println(Car12.wheels);
		
		
		System.out.println(c1.name+" "+c1.licenseNum+" "+c1.price+" "+c1.color);
		
		System.out.println(c2.name+" "+c2.licenseNum+" "+c2.price+" "+c2.color);
		
		System.out.println(c3.name+" "+c3.licenseNum+" "+c3.price+" "+c3.color);
		
		//2.directly:
		System.out.println(wheels);
		
		//3.can I access the static var using the obj ref name?
		System.out.println(c1.wheels);//yellow warning - should be accessed the common way
		
		

	}

}
