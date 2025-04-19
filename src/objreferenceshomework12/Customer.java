package objreferenceshomework12;

public class Customer {
    
	String name;
    int age;
    String city;
    
	public static void main(String[] args) {
	// using 5 refs c1, c2, c3, c4, c5 -- creating objs with ref names:
		
		Customer c1 = new Customer();
		c1.name = "Taruna";
		c1.age = 25;
		c1.city = "Pune";
		
		Customer c2 = new Customer();
		c2.name = "Neha";
		c2.age = 35;
		c2.city = "Bangalore";
		
		Customer c3 = new Customer();
		c3.name = "Victor";
		c3.age = 30;
		c3.city = "LA";
		
		Customer c4 = new Customer();
		c4.name = "Shiva";
		c4.age = 35;
		c4.city = "Delhi";
		
		Customer c5 = new Customer();
		c5.name = "Elma";
		c5.age = 40;
		c5.city = "NY";
		
		System.out.println("--------BeforeRefChanges---------");
		System.out.println(c1.name+" "+c1.age+" "+c1.city);//T
		System.out.println(c2.name+" "+c2.age+" "+c2.city);//N
		System.out.println(c3.name+" "+c3.age+" "+c3.city);//V
		System.out.println(c4.name+" "+c4.age+" "+c4.city);//S
		System.out.println(c5.name+" "+c5.age+" "+c5.city);//E
		
		System.out.println("-----------c1=c2---------------");
		
		c1=c2;
		System.out.println(c1.name+" "+c1.age+" "+c1.city);//N
		System.out.println(c2.name+" "+c2.age+" "+c2.city);//N
		System.out.println(c3.name+" "+c3.age+" "+c3.city);//V
		System.out.println(c4.name+" "+c4.age+" "+c4.city);//S
		System.out.println(c5.name+" "+c5.age+" "+c5.city);//E
		
		
        System.out.println("-----------c2=c3---------------");
		
		c2=c3;
		System.out.println(c1.name+" "+c1.age+" "+c1.city);//N
		System.out.println(c2.name+" "+c2.age+" "+c2.city);//V
		System.out.println(c3.name+" "+c3.age+" "+c3.city);//V
		System.out.println(c4.name+" "+c4.age+" "+c4.city);//S
		System.out.println(c5.name+" "+c5.age+" "+c5.city);//E
		
        System.out.println("-----------c3=c4---------------");
		
		c3=c4;
		System.out.println(c1.name+" "+c1.age+" "+c1.city);//N
		System.out.println(c2.name+" "+c2.age+" "+c2.city);//V
		System.out.println(c3.name+" "+c3.age+" "+c3.city);//S
		System.out.println(c4.name+" "+c4.age+" "+c4.city);//S
		System.out.println(c5.name+" "+c5.age+" "+c5.city);//E
		
        System.out.println("-----------c4=c5---------------");
		
		c4=c5;
		System.out.println(c1.name+" "+c1.age+" "+c1.city);//N
		System.out.println(c2.name+" "+c2.age+" "+c2.city);//V
		System.out.println(c3.name+" "+c3.age+" "+c3.city);//S
		System.out.println(c4.name+" "+c4.age+" "+c4.city);//E
		System.out.println(c5.name+" "+c5.age+" "+c5.city);//E
		
        System.out.println("-----------c5=c1---------------");
		
		c5=c1;
		System.out.println(c1.name+" "+c1.age+" "+c1.city);//N
		System.out.println(c2.name+" "+c2.age+" "+c2.city);//V
		System.out.println(c3.name+" "+c3.age+" "+c3.city);//S
		System.out.println(c4.name+" "+c4.age+" "+c4.city);//E
		System.out.println(c5.name+" "+c5.age+" "+c5.city);//N
		
		System.out.println("------------DONE-------------");
		
		
		
		

	}

}
