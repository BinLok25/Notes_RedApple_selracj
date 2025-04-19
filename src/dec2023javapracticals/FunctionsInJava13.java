package dec2023javapracticals;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsInJava13 {
	
	//cannot create a function/method inside a function
	//functions are parallel to each other
	//but can call a function from another function
	//NS functions -- data members of the class -- vars/properties + actions/fns
	
	//1st: function: no input and no return
	//input: no input - 0 parameter
	//return: void -- can not return any thing
	
	public void test() {
		System.out.println("test method");
	}
	
	//2nd: function: some input and no return
	//return type: void
	public void getBill(int days) {// 1 param fn
		System.out.println("getting billing info");
		int finalAmount = days * 100;
		System.out.println(finalAmount);
		
	}
	//3rd: function with some input and return
	//return type: int
	public int sum(int a, int b) {//2 params fn
		System.out.println("adding two numbers");
		int s = a+b;
		return s;
		
	}
	//4th: function: no input and some return
	//return type: String
	private String getInfo() {
		System.out.println("getting information");
		String s = "Hello App";
		return s;
	}
	
	
	//return type: boolean
	public boolean isAppExists() {
		return true;
	}
	//
	public Object[] calculateMarks(int marks, float extraMarks, int i){
		float finalMarks = marks + extraMarks - i;
		String school = "IBM";
		boolean flag = true;
		Object finalInfo[] = {school, finalMarks, flag};
		
		return finalInfo;
	}
	//function cannot have multiple returns:
	public int testing() {
		System.out.println("testing is done");
		return 100;//return should be the last statement of the fn
//		System.out.println("cannot write println statement after the return-errs");
	}
	public void printName() {
		System.out.println("BinAuto");
//		return;//blank return -- void //blank return is allowed with void => no value in retrun
	}
	
	public void launchURL(String url) {
		System.out.println(url);
	}
	public String[] getDevices() {
		System.out.println("getting devices");
		String devices [] = {"MacbookPro","iPad","iPhoneI4"};
		return devices;
	}
	public ArrayList<String> getUsersList() {
		System.out.println("getting all users");
		ArrayList<String> userList = new ArrayList<String>();
		userList.add("Shiva");
		userList.add("Leena");
		userList.add("Ravi");
		
		return userList;
	}

	public static void main(String[] args) {
		//call a function:create a object for calling non-static fns
		FunctionsInJava13 obj = new FunctionsInJava13();
		obj.test();
		
		obj.getBill(10);//calling function by passing value: callByValue - 10: value/argument
		
		obj.getBill(20);
		
		System.out.println(obj.sum(10, 20));//NOT A GOOD PRACTICE to direct call fn inside println
		obj.sum(10, 20);
		int m = obj.sum(10, 20);
		System.out.println(m-5);
		
		int m1 = obj.sum(-10,4);
		System.out.println(m1+9);
		
		Object mesg = obj.getInfo();
		System.out.println(mesg);
		
		if(obj.isAppExists()) {
			System.out.println("login to app");			
		}
		
		Object[] f1 = obj.calculateMarks(70, 10.00f, 5);
		System.out.println(f1);
		
        obj.launchURL("https://www.google.com");
        
       String myDevices[]= obj.getDevices();
       System.out.println(Arrays.toString(myDevices));
       System.out.println(myDevices.length);
       
       ArrayList<String> myList = obj.getUsersList();
       System.out.println(myList);
     
	}

	

}
