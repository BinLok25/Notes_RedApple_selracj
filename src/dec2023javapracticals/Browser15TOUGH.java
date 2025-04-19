package dec2023javapracticals;

public class Browser15TOUGH {
	
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	public void m3() {
		System.out.println("m3 method");
		m1();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser15TOUGH obj = new Browser15TOUGH();
		obj.m1();//stack overflow

	}

}
