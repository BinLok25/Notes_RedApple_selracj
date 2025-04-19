package dec2023jasessionspracticals;

public class IncrementalAndDecrementalOperators04 {

	public static void main(String[] args) {
		// ++ and --
		
		//1.post increment: later => increase the value later
		int a = 1;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		
		int g = -98;
		int h = g++;
		System.out.println(g);
		System.out.println(h);
		
		int k = -999;
		System.out.println(k++);//-999
		System.out.println(k);//-998
		
		//2.pre-increment: before => increase the value before
		int x = 1;
		int y = ++x;
		System.out.println(x);//2
		System.out.println(y);//2
		
		int p = -99;
		int q = ++p;
		System.out.println(p);//-99-i did wrong -98
		System.out.println(q);//-98
		
		//3.post-decrement:
		int u = 2;
		int r = u--;
		System.out.println(u);//2-i did wrong 1
		System.out.println(r);//2
		
//		System.out.println(10++);//wrong syntax - cannot apply inc operator to value
		
		int s1 = 10;
		System.out.println(s1--);//10
		System.out.println(s1);//9
		
		//4.pre-decrement:
		int m = 2;
		int n = --m;
		System.out.println(m);//1
		System.out.println(n);//1
		
		int t1 = -999;
		int t2 = --t1;
		System.out.println(t1);//-1000
		System.out.println(t2);//-1000
		
		int m1 = 5;
		int k1 = m1++ + ++m1;
		System.out.println(m1);//7
		System.out.println(k1);//k1 = 5 + 7 = 12
		
		
		
	}

}
