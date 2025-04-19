package javacollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept3 {

	public static void main(String[] args) {
		
		
		LinkedList<String> lL = new LinkedList<String>();
		lL.add("test");
		lL.add("qtp");
		lL.add("selenium");
		lL.add("RPA");
		lL.add("RFT");
		
		//print:
		System.out.println("content of linkedList: "+lL);
		
		//addfirst:
		lL.addFirst("Binka");
		lL.addLast("Gp");
		System.out.println("updated content of linkedList: "+lL);
		
		//remove first and last element:
		lL.removeFirst();
		lL.removeLast();
		System.out.println("content of linkedList: "+lL);
		
		lL.remove(2);
		System.out.println("content of linkedList: "+lL);
		
//		//how to print all values of linkedList:
//		//for loop:
//		System.out.println("----------for loop-------------");
//		for(int i=0;i<=lL.size()-1;i++) {
//			System.out.println(lL.get(i));
//		}
//		//advance for loop:for each loop
//		System.out.println("--------advanced for loop------");
//		for(String e: lL) {
//			System.out.println(e);
//		}
//		//iterator:
//		System.out.println("----------iterator-------------");
//		Iterator<String> it = lL.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		//while loop:
//		System.out.println("--------while loop-------------");
//		int num = 0;
//		while(lL.size()>num) {
//			System.out.println(lL.get(num));
//		}

	}

}
