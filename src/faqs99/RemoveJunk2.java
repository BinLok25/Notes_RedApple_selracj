package faqs99;

public class RemoveJunk2 {

	public static void main(String[] args) {
		String s = "@!98765$%^123&abc*ANMKI()";
		
		//Regular expression:[^a-z1-9A-Z]
		
		s = s.replaceAll("[^a-z1-9A-Z]", "");
		
		System.out.println(s);
		
		

	}

}
