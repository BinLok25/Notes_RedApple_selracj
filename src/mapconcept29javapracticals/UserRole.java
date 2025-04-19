package mapconcept29javapracticals;

import java.util.HashMap;

public class UserRole {
	
	public void doLogin(String un, String pwd) {
		System.out.println("user login with : "+un+ "-"+pwd);
		
	}
	
	public String getUserCreds(String role) {
		HashMap<String, String> userMap = new HashMap<String, String>();
		
		userMap.put("admin", "admin:admin123");
		userMap.put("seller", "seller:seller123");
		userMap.put("vendor", "vendor:vendor123");
		userMap.put("partner", "partner:partner123");
		userMap.put("user", "praveen:praveen@1990");
		
		return userMap.get(role);
		
	}

	public static void main(String[] args) {
		// Amazon - RBAC - Role based access control
		//UM - IAM
		
		String role="admin";
		UserRole app = new UserRole();
		String creds = app.getUserCreds(role);
		System.out.println(creds);
		
		String cred[] = creds.split(":");
		
		
	}

}
