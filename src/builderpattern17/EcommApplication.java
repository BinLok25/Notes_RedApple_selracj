package builderpattern17;

public class EcommApplication {
	
	//execution is not possible ==> since no main()
	//no default const....is written --> java will add one default hidden const...
	/**
	 * SCENARIO:user logging in into an ecommerce appn with un and pwd
	 * overloading the login method to simulate various use cases of
	 * user simulation
	 * i) user logging in with just un and pwd
	 * ii)user logging in with un, pwd, role
	 * iii) user logging in and then searching for the product
	 * iv)user adding the items to the cart
	 * v) user going thru the payment Gateway => paying for the items
	 * using upi(in india), Google pay, Wallet
	 * @return 
	 */
	
	public EcommApplication login(String un, String pwd) {
		System.out.println("logged in with:"+un+pwd);
		//return new EcommApplication();  //comment to stop unwanted obj creation
		return this;
	}
	public EcommApplication login(String un, String pwd, String role) {
		System.out.println("logged in with:"+un+pwd+role);
		return this;
	}
	public EcommApplication search(String productName) {
		System.out.println("search: "+productName);
		return this;
	}
	public EcommApplication search(String productName, String color) {
		System.out.println("search: "+productName+""+color);
		return this;
	}
	public EcommApplication search(String productName, String color, int price) {
		System.out.println("search: "+productName+""+color+""+price);
		return this;
	}
	public EcommApplication addToCart(String productName) {
		System.out.println("add to cart: "+productName);
		return this;
	}
	
	public EcommApplication payment(String upi) {
		System.out.println("making payment via: "+upi);
		return this;
	}
	public EcommApplication payment(String cc, int cvv) {
		System.out.println("making payment via cc: "+cc+""+cvv);
		return this;
	}

	public EcommApplication getOrderId() {
		System.out.println("order id is done...order id is: " + 12345);
		return this;
	}

	public EcommApplication logout() {
		System.out.println("logged out");
		return this;
	}
	//can all these methods be called from a diff class??
	//Does it make sense to create a main method in this class??
	/**
	 * No because ecommerce appn is a kind of utility class - which is
	 * there in my class with all the utilities
	 * Is there any possibility that some one is going to create an obj
	 * from this class and call the methods?? no
	 * so always remember that in the frame work - we will always create
	 * the main() in a diff class--that class is called a Test class/caller class
	 * 
	 * doesnot make sense to write the main() here - because this is like
	 * a utility class/appn class which has all the features of the app
	 * in it
	 * 
	 * AppTest.java is a user class which is going to call these methods
	 * 
	 * main business logic is written in EcommApplication.java
	 * people should create the obj of this class -- and call these
	 * methods--not by coming inside this class- from outside of this class
	 * ---how to call all these non-static methods from the main() outside
	 * of this class?? By creation of the Obj and thru dot
	 * 
	 * default const... need not be written here
	 * the moment class is created - a default constructor which is hidden is automatically
	 * created by jvm
	 * 
	 * Once a parameterized const... created by user - then the java will not add the
	 * default constr... and will focus only on the parameterized constr...created by
	 * user
	 * CURRENT CLASS OBJ: 
	 * ---------->>>>
	 * return new classname();
	 * 
	 * if every method starts returning the current class obj -- if there are 10
	 * methods => 10 current class obj -- will flock the heap memory - UNNECESSARY
	 * TO STOP: the unnecessary obj creation
	 * return this;  //needs to be added instead of return new classname();
	 * ===> it will go to the main() where this class's obj was created previously
	 * to use the same -- in this case the AppTest.java
	 */
}
