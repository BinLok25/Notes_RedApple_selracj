package faqs102;

public class RemoveJunk02 {

	public static void main(String[] args) {
		
		//Regex: regular expression [^a-zA-Z0-9]
		
		String str = "@#$%^ )bkarnam18@gmail.com(*&^";
		
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);

	}

}
