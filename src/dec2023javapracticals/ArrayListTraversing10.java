package dec2023javapracticals;

import java.util.ArrayList;

public class ArrayListTraversing10 {

	public static void main(String[] args) {
		
		ArrayList<String> footerLinksList = new ArrayList<String>();
		footerLinksList.add("Login");
		footerLinksList.add("Register");
		footerLinksList.add("Forgot Pwd");
		footerLinksList.add("Wish List");
		
		System.out.println(footerLinksList.size());
		
		System.out.println(footerLinksList);
		
		System.out.println(footerLinksList.get(0));
		System.out.println(footerLinksList.get(3));
//		System.out.println(footerLinksList.get(4));//IOB
		//here in case of ArrayList-IndexOutOfBoundsException
		//for negative index - IOB exception
		//limit - o to pc
		
		
		//to print all the values of arrayList: for loop
		
		//index loop:
		for(int i=0;i<footerLinksList.size();i++) {
			System.out.println(footerLinksList.get(i));
		}
		
		System.out.println("-------for each----------");
		//for each:
		for(String e: footerLinksList) {
			System.out.println(e.toString());
		}
		
		//
		ArrayList<String> pageList = new ArrayList<String>();
		pageList.add("Login");
		pageList.add("Register");
		pageList.add("Forgot Pwd");
		pageList.add("Wish List");
		
//		pageList.add(5, "contact us");//IOB
		
        pageList.add(0, "Naveen");//adds
        pageList.set(2, "Naveen");//replaces with new value
        
        pageList.remove(1);
        System.out.println(pageList.get(1));
        
        				
        
        System.out.println(pageList);
        
       
		
		
		

	}

}
