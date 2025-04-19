package dec2023jasessionspracticals;

public class IncDecPractice04 {

	public static void main(String[] args) {
		
		int a = 11, b = 22, c;
		
		c = a +b + a++ + b++ + ++a + ++b;
//			11+22+11+22+13+24
		
		System.out.println("a=" + a);//13
		System.out.println("b=" + b);//24
		System.out.println("c="+ c); //103
		
		//--------------------------------//
		
		int i = 0;
		int j= i++ - --i + ++i - i--;
		
		System.out.println(i);//1 0 1 0
		System.out.println(j);//1
		
		//--------------------------------//
		
		int x = 19, y=29, z=0;
		int m = x-- - y-- - z--;
		
		System.out.println("x=" + x);//18
		System.out.println("y=" + y);//28
		System.out.println("z=" + z);//-1
		
		System.out.println(m);//-10
		
		float buildNo = 1.1f;//2.1
		float bNo = buildNo++;//1.1
		
		System.out.println(buildNo);//2.1
		System.out.println(bNo);//1.1
		
		char ch = 'a';
		System.out.println(ch);
//		System.out.println(++ch);//'b'
		System.out.println((byte)++ch);//99
		
		

	}

}
