package string_manipulation25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringConcept {

	public static void main(String[] args) {
		String str = "This is my java code and i am so happy";
		
		System.out.println(str.length());
		//li = 0
		//hi = 37
		//len = hi+1
		//hi = len-1
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(37));
//		System.out.println(str.charAt(38));//StringIndexOutOfBoundsException - SIOB
//       System.out.println(str.charAt(-1));//SIOB
		
		System.out.println(str.indexOf("T"));//indexOf is an overloaded method
		
		//need to create formula to find the nth index of a char:
		
		
		String mesg = "this is my java code";
		
		System.out.println(mesg.indexOf("java"));//1
		System.out.println(mesg.indexOf("python"));//-1
		System.out.println(mesg.indexOf("Java"));//-1
		
		String m = "Welcome null";
		if(m.indexOf("admin") == 8) {
			System.out.println("correct message");
		}else {
			System.out.println("incorrect message");
		}
		
		if(m.indexOf("admin") == -1) {
			System.out.println("incorrect mesg - FAIL");
		}
		
		//
		String test = "       hello     world     ";
		System.out.println(test.trim());
		
		//
		String dob = "01-01-1990";
		System.out.println(dob.replace("-", "/"));
		
		String top = "       hello     world      "; //helloworld
//		System.out.println(top.replace(" ", ""));//helloworld
		System.out.println(top.replaceAll(" ", ""));
		
		String mg = "Java Python Ruby";
//		System.out.println(mg.replace(" ", "||"));
		
		System.out.println(mg.replace("Java", "JS"));
		
		//split: is a function -- will always give String[]
		String pop = "javascript:java:python:ruby";
		System.out.println(pop.split(":")); //prints the address of obj in memory
		String p[] = pop.split(":");
		
		System.out.println(p[0]);
		
		//*******************StringConcepts26PRACTICALS*************************//
		
		String name = "Test Automation Labs";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		String domain = "        hello selenium      ";
		String dom = domain.replaceAll("\\s+", "");
		System.out.println(dom);
		
		String t1 = "your order id is 12345";
		String orderId = t1.replaceAll("\\D+", "");
		System.out.println(orderId);
		
		String t2 = "your user id is 9090 and order id is 12345";
//		String newStr = t2.replaceAll("\\D+", "");
//		System.out.println(newStr);
		
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(t2);
		
		String userId = null;
		String oId = null;
		
		while(matcher.find()) {
			matcher.group();
			System.out.println(matcher.group());
		}
		
		if(matcher.find()) {
			userId = matcher.group();
			System.out.println(userId);
		}
		
		if(matcher.find()) {
			oId = matcher.group();
			System.out.println(oId);
		}
		
		System.out.println(userId);
		System.out.println(oId);
		
		//
		String tr = "Hello!!! this is my value .$1233333*";
		String finalValue = tr.replaceAll("[^a-zA-Z\\s]", "");
		System.out.println(finalValue);
		
		
		
		
		
		
		
		
	}

}
