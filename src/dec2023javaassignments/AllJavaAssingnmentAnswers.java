package dec2023javaassignments;

import java.util.ArrayList;

public class AllJavaAssingnmentAnswers {

	public static void main(String[] args) {
		// 09]try reverse order with the count var in the for each loop??
		int num[] = {10,20,30,40,10,1};
		
		System.out.println(num[2]);
		
		System.out.println("-----reverse-----");
		
//		int count=5;
		int count=num.length-1;
		for(int e:num) {//e is not being used-warning-to remove this warn e=count
			e=count;//5
	//		System.out.println(num[count]);//0-10
			System.out.println(num[e]);//1
			count--;//4
		}
		
		//10] print index also along with the ArrayList??
		
		ArrayList<String> pageList = new ArrayList<String>();
		pageList.add("Login");
		pageList.add("Register");
		pageList.add("Forgot Pwd");
		pageList.add("Wish List");
		
		String counter="0";
		for(String e:pageList) {
			e=counter;
//			System.out.println(pageList[e.toString()]);
			
		}
		

	}

}
