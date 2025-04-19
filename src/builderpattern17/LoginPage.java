package builderpattern17;

public class LoginPage {
	
	//NS
	String userName;
	String password;
	
	public LoginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
		
	}
	
	public LoginPage() {
		
	}

	//NS --> NS
	public void doLogin() {
		System.out.println("enter username "+ userName);
		System.out.println("enter password "+ password);
		System.out.println("click on login button");
		System.out.println("user is logged in");
	}

}
