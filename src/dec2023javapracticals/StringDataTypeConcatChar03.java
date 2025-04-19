package dec2023javapracticals;

public class StringDataTypeConcatChar03 {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		String x = "hello";
		String y = "world";
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+x);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		
		System.out.println(a+b+x+y+a+b);
		
		double c = 12.33;
		double d = 23.44;
		System.out.println(x+y+c+d);
		
		System.out.println(a+b+c+d+x+y);
		
		char c1 = 'a';
		char c2 = 'b';
		System.out.println(c1+c2);
		
		System.out.println(c1+""+c2);
		
		System.out.println(x+" "+y);
		
		String t1 = "a";
		String t2 = "b";
		System.out.println(t1+t2);
		
		System.out.println(c1+' '+c2);
		
		System.out.println(true+x);
		//System.out.println(true+true); gives syntax error
		
		System.out.println('a'+'b'+"hello"+"selenium"+100+200+12.33);
		
		//range: -128 to 127
		byte b3 = 1;
		byte b4= 10;
		
		//int, long
		long l = b3+b4;
		System.out.println(l);
		
		int b5= b3 - b4;
		
		//range: -32768 to 32767
		short s1 = 100;
		short s2 = 200;
		
		int s3 = s1+s2;
		System.out.println(s3);
		
		int i = 200;
		int j = 300;
		int k = i+j;
		
		byte g = 10;
		int u = g;

		int r1 = 130;
		byte r2 = (byte) r1; //(byte)130
		System.out.println(r2);
		
		char c5 = 'a'; //97
		int b6 = (int)c5;
		System.out.println(b6);
		
		byte b7 = (byte)((int)c5);  //double casting
		System.out.println(b7);
		
		double dr = 12.33;
		int tr = (int)dr;
		System.out.println(tr);
		
		System.out.println("------------");
		
		char c8 = 'c';
		char c9 = 'd';
		
		System.out.println(c8*c9); //99x100=9900
		System.out.println(c8+c9); //199
		System.out.println(c8-c9); //-1
		System.out.println(c8/c9); //0.99 =0
			
		
		//' ' ascii value 32
		System.out.println(c8+" "+c9);//c8 c9 => c d
		System.out.println(c8+' '+c9);//99+32+100
		
		System.out.println(' '+' '); //64
		System.out.println(" "+' '); //just space
		
		System.out.println((byte)1000);
		
		
		
		
	}

}
