package dec2023javapracticals;

public class IncDecPractice04 {

	public static void main(String[] args) {
		int a = 11; int b = 22; int c;
		
		c = a + b + a++ + b++ + ++a + ++b;
		
		System.out.println("a="+a);//13
		System.out.println("b="+b);//24
		System.out.println("c="+c);//103
		
		int i = 0;
		int j = i++ - --i + ++i - i--;
		System.out.println(j);//0
		
		boolean b1 = true;
		//b1++;//type mismatch cannot apply int to boolean
		System.out.println(b1);
		
		int m = 19; int n = 29; int p=0;
		int k = m-- - n-- - p--;
		
		System.out.println("m="+m);//18
		System.out.println("n="+n);//28
		System.out.println("p="+p);//-1
		
		System.out.println(k);//-10
		
		float f1 = 1.1f;
		float f2 = f1++;
		System.out.println(f1);//2.1
		System.out.println(f2);//1.1
		
		char ch = 'a';//97
		System.out.println(++ch);//98=b
		System.out.println((int)++ch);
		
		
		
		
		
		
		
		
		

	}

}
