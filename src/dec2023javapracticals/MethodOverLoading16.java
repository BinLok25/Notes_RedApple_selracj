package dec2023javapracticals;

public class MethodOverLoading16 {
	
	//MethodOverloading
	//poly(many)+morphism(forms): compile time polymorphism (static binding)
	//Decision is taken at COMPILE time 
	
	public void search(int a) {
		System.out.println(a);
	}
	public void search(int price, String color) {
		
	}

	public static void main(String[] args) {
		MethodOverLoading16 obj = new MethodOverLoading16();
		obj.search(10);//call by value => calling method by passing value

	}

}
