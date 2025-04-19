package impcodeforaninterview;

import java.util.HashMap;

import allexceptions.MyException;

public class UserRole29 {
	String un;
	String pwd;
	
	public static void doLogin(String un, String pwd) {
		System.out.println("user log in with: "+ un + "-" + pwd);
	}
	//overloading the doLogin() to take String param:
	public void doLogin(String role) {
		
			String creds = getUserCreds(role);
			creds.split(":")[0].trim();
			creds.split(":")[1].trim();
			doLogin(un, pwd);
		
	}
	private HashMap<String, String> getUserMap() {
		HashMap<String, String> userMap = new HashMap<String, String>();
		userMap.put("admin", "admin:admin123");
		userMap.put("seller", "seller:seller123");
		userMap.put("vendor", "vendor:vendor123");
		userMap.put("partner", "partner:partner123");
		userMap.put("user", "user:user123");
		userMap.put("supplier", "supplier:supplier123");
		
		return userMap;
	}
	private String getUserCreds(String role) {
		if(getUserMap().containsKey(role)) {
			return getUserMap().get(role);
		}else {
			throw new MyException("USER ROLE NOT FOUND");
		}
	}

	public static void main(String[] args) {
		//Amazon - RBAC - role based access control
		//UM - IAM
		
		String role = "partner";
		UserRole29 app = new UserRole29();
		app.doLogin("admin");
		
		app.doLogin("sekhar@mail.com", "skh@123");
		

	}

}
