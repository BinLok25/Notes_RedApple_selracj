package constructorconcepts16;

public class Employee4 {
	//class vars:
	String name;
	int age;
	double salary;
	char gender;
	boolean isActive;
	
	

	public Employee4(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Employee4(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Employee4(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Employee4(String name, int age, double salary, char gender, boolean isActive) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.isActive = isActive;
	}

	public static void main(String[] args) {
		Employee4 e1 = new Employee4("Tom", 30);

	}

}
