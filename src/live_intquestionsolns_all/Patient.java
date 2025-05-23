package live_intquestionsolns_all;

public class Patient {
	
	private String name;
	private int age;
	private String disease;
	private int amount;
	
	public Patient() {
		//default no param constructor
	}
	
	public Patient(String name, int age, String disease, int amount) {
		//Params as all field vars constructor...
		super();
		this.name = name;
		this.age = age;
		this.disease = disease;
		this.amount = amount;
		
	}
   //public getters/setters:

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Patient1 [name=" + name + ", age=" + age + ", disease=" + disease + ", amount=" + amount + "]";
	}
	
	
}
