package dec2023javapracticals;

public class Application14 {
	// duplicate methods are not allowed

	public void test() {// 0 param

	}

	public void test(int i) {// 1 param

	}

	public void test(int l, int j) {// 2 params

	}

	public void test(int l, String k) {// 2 params

	}

	public void test(String k, int l) {// 2 params

	}

	// ecommerce app:
	public void login(String un) {

	}

	public void login(String un, String pwd) {

	}

	public void login(String un, String pwd, int otp) {

	}

	public void login(String un, String pwd, String role) {

	}

	// search fnlty can be overloaded:
	public void doSearch(String name) {

	}

	public void doSearch(String name, String color) {

	}

	public void doSearch(String name, String color, int price) {

	}

	// payment fnlity: can be overloaded:
	public void makePayment(String paymentMethod) {

		switch (paymentMethod) {
		case "upi":

			break;
		case "paypal":

			break;

		default:
			break;
		}

	}

	// uber:
	public void booking(String st, String end) {

	}

	public void booking(String st, String end, String carType) {

	}

	public void booking(String st, String end, String carType, String paymentMethod) {

	}

	public void makePayment(String cc, int cvv, int otp) {

	}
    //caller: user method: to call other methods
	public static void main(String[] args) {

	}

}
