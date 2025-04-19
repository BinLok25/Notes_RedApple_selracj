package builderpattern17;

public class Registration {
	
	String name;
	String tel;
	String pwd;
	
	public void userReg(String name, String tel, String pwd) {
		System.out.println("enter username: "+name);
		System.out.println("enter phone: "+tel);
		System.out.println("enter pwd: "+pwd);
		
		this.name = name; //this.globalvar = localvar
		this.tel = tel;
		this.pwd = pwd;
		
	}
	public void getUserInfo() {
		System.out.println(name+""+tel+""+pwd);
	}

	public static void main(String[] args) {
		// calling non-static vars, method in static main()
        // thru the obj
		Registration reg = new Registration();
		reg.userReg("Sana", "12121", "sana@123");
		reg.getUserInfo();
		
		//this keyword: use cases
		//1. constr...+this
		//2. constr...calling
		//3. method + this
		//4. builder pattern ---> return this
	}

}
