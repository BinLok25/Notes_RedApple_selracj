package dec2023jasessionspracticals;

public class DataTypeCasting04 {

	public static void main(String[] args) {
		
		byte t = 10;
		int k = t;
		
		System.out.println(k);
		
		int p = 150;
		byte q = (byte)p;
		System.out.println(q);
		
		long l = p;
		System.out.println(l);
		
		long l1 = 1000;
		float f1 = l1;
		System.out.println(f1);
		
		float f2 = 12.85f;
		long l2 = (long)f2;
		System.out.println(l2);
		
		int i1 = (int)f2;
		System.out.println(l1);
		
		float f3 = 800.85f;
		int b3 = (byte)f3;
		System.out.println(b3);
		
		int ch = 'a';
		byte bh = 'a';
		
		int c1 = 'b';
		int f11 = c1;//b ->98
		System.out.println(f11);
		
		int v = 97;
		char v1 = (char)v;//97--a
		System.out.println(v1);//a
		
		
		

	}

}
