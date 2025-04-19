package string_manipulation25;



   //String Literals: applicable only for Strings - NOT for StringBuilder, StrBuffer
public class StringVsStringBuilderVsStringBufffer27 {

	public static void main(String[] args) {
		
		
		//immutable
		String tr = "Hello";
//		System.out.println(tr);//1.Hello
		tr.concat("selenium");
//		System.out.println(tr);//2.Helloselenium
		tr.concat("testing");
		System.out.println(tr);//3.Helloseleniumtesting
		
		
		String str = "bye";
		str.concat("bye");
		str.concat("goodbye");
		System.out.println(str);
		
		//the above 3 strings are created in SCP wasting memory for 3 strings
		
		//mutable
		StringBuilder sb = new StringBuilder("Helllo");
		System.out.println(sb);
		sb.append("selenium");
		System.out.println(sb);
		sb.append("testing");
		System.out.println(sb);

	}

}
