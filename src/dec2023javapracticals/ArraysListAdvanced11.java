package dec2023javapracticals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysListAdvanced11 {

	public static void main(String[] args) {
		
	ArrayList<String> browserList = new ArrayList<String>(Arrays.asList("chrome","firefox","edge"));
	System.out.println(browserList.size());
	
	browserList.add("IE");
	System.out.println(browserList.size());
	
	System.out.println(browserList.get(0));
	
	System.out.println(browserList.indexOf("naveen"));//-1
	System.out.println(browserList.indexOf("firefox"));//1
	
	if(browserList.indexOf("naveen")==-1) {
		System.out.println("plz pass the right browser name....");
	}
	System.out.println(browserList);
	browserList.removeAll(browserList);
	System.out.println(browserList);//empty list
	System.out.println(browserList.size());
	
	ArrayList<String> osList = new ArrayList<String>(Arrays.asList("windows","mac","linux"));
	
	browserList.addAll(osList);
	System.out.println(browserList);
	System.out.println(osList);
	
	browserList.removeAll(osList);//browsers
	System.out.println(browserList);//browsers
	
	osList.add(0, "unix");
	System.out.println(osList);
	
	osList.set(0, "Naveen");
	System.out.println(osList);
	
	osList.add("Testing");
	System.out.println(osList);
	
	if(osList.contains("mac")) {
		System.out.println("test passed");
	}
	else {
		System.out.println("FAILED");
	}
		
	ArrayList<String> subList = new ArrayList<String>(Arrays.asList("mac","windows"));
	
	System.out.println(osList.containsAll(subList));
	
	ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(10,20,11,45,60,89));
	System.out.println(numList);
//	Collections.sort(numList);
//	System.out.println(numList);
	
	Collections.swap(numList, 0, 1);
	System.out.println(numList);
	
	List<Object> testList = Collections.emptyList();//empty list --> immutable=>cannot add into this
	System.out.println(testList.size());
//	testList.add("Cypress"); //unsupported Operation Exception
	System.out.println(testList);
	
	Collections.sort(osList);
	System.out.println(osList);//first sorts the capital letter words then small case letters
	
	
	ArrayList<String> footerLinksList = new ArrayList<String>();//mutable list
	footerLinksList.add("help");
	System.out.println(footerLinksList);
	
	
	

	}

}
