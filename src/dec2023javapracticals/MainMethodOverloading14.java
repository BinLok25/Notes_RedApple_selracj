package dec2023javapracticals;

public class MainMethodOverloading14 {
    //PSVM(String[]){} -- JVM
	public static void main(String[] args) {
		System.out.println("Hiii");
		
		MainMethodOverloading14.main(10);
		MainMethodOverloading14.main(10, "selenium");
		MainMethodOverloading14.main("cypress", "seleinum");

	}
	public static void main(int i) {
		System.out.println("Hiii"+i);

	}
	public static void main(int i, String s) {
		System.out.println("nav"+i+s);

	}
	public static void main(String i, String s) {
		System.out.println("nav"+i+s);

	}

}
