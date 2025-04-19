package dec2023javapracticals;

public class StringLiteralConstantPool26 {

	public static void main(String[] args) {
		
		String tr = "Hello";
		tr.concat("selenium");
		System.out.println(tr);
		
		//String literals:
		String s1 = "Hello"; //1-SCP
		String s2 = "Hello"; //0
		
		//
		String s3 = new String("world");//1-in heap, 1- in SCP
		
		String s4 = "world";
		String s5 = "Hello";
		
		String s6 = new String("selenium");//1-in heap, 1- in SCP
		String s7 = "seleinum";
		String s8 = new String("selenium");//1-heap
		
		System.out.println(s1==s2);//scp == scp -- true
		System.out.println(s4==s3);//scp=heap
		//cannot compare heap refs with double equal to - will always give false
        //it will always compare their respective memory address not their value
		System.out.println(s6==s8);//heap == heap -- false
		
		System.out.println(s6.equals(s8));//true
		System.out.println(s4.equals(s3));
		
		
	}

}
