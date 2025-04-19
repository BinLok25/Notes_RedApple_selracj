package dec2023javapracticals;

public class Customer12 {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		
		Customer12 c1 = new Customer12();
		c1.name = "Taruna";
		c1.age = 25;
		c1.city = "Pune";
		
		Customer12 c2 = new Customer12();
		c2.name = "Neha";
		c2.age = 35;
		c2.city = "Bangalore";
		
		Customer12 c3 = new Customer12();
		c3.name = "Victor";
		c3.age = 30;
		c3.city = "LA";
		
		Customer12 c4 = new Customer12();
		c1.name = "Mathew";
		c1.age = 25;
		c1.city = "Elcentro";
		
		//before no change in references:
		System.out.println(c1.name+""+c1.age+""+c1.city);
		System.out.println(c2.name+""+c2.age+""+c2.city);
		System.out.println(c3.name+""+c3.age+""+c3.city);
		System.out.println(c4.name+""+c4.age+""+c4.city);
		
		System.out.println("---------------------------");
		
		c1=c2;
		System.out.println(c1.name+""+c1.age+""+c1.city);
		System.out.println(c2.name+""+c2.age+""+c2.city);
		System.out.println(c3.name+""+c3.age+""+c3.city);
		System.out.println(c4.name+""+c4.age+""+c4.city);
		
		System.out.println("---------------------------");
		
		c2=c3;
		System.out.println(c1.name+""+c1.age+""+c1.city);
		System.out.println(c2.name+""+c2.age+""+c2.city);
		System.out.println(c3.name+""+c3.age+""+c3.city);
		System.out.println(c4.name+""+c4.age+""+c4.city);
		
		System.out.println("---------------------------");
		
		c3=c4;
		System.out.println(c1.name+""+c1.age+""+c1.city);
		System.out.println(c2.name+""+c2.age+""+c2.city);
		System.out.println(c3.name+""+c3.age+""+c3.city);
		System.out.println(c4.name+""+c4.age+""+c4.city);
		
		System.out.println("---------------------------");
		
		c4=c1;
		System.out.println(c1.name+""+c1.age+""+c1.city);
		System.out.println(c2.name+""+c2.age+""+c2.city);
		System.out.println(c3.name+""+c3.age+""+c3.city);
		System.out.println(c4.name+""+c4.age+""+c4.city);
		
		System.out.println("---------------------------");
		

	}

}
