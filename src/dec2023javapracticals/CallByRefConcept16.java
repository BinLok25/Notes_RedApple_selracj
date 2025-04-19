package dec2023javapracticals;

public class CallByRefConcept16 {
	
	String name;
	int age;
	
	
	public static void getInfo(CallByRefConcept16 t1){
//		CallByRefConcept16 t1 = new CallByRefConcept16();
		
		System.out.println(t1.name);
		System.out.println(t1.age);
		
	}

	public static void main(String[] args) {
		
		CallByRefConcept16 obj = new CallByRefConcept16();
		obj.name = "Prateek";
		obj.age = 30;
		
		getInfo(obj);//call by reference
		
		CallByRefConcept16 app = new CallByRefConcept16();
		getInfo(app);//now app also pointing to obj - so given to t1 and t1 breaks from obj
		//But t1 given to app -- which doesnot have any value for name, age so null,0
		

	}

}
