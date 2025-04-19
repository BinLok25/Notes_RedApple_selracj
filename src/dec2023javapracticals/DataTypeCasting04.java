package dec2023javapracticals;

public class DataTypeCasting04 {
	
	public static void main(String[] args) {
		//WIDENING e.gs:
		byte t = 10;
		int k = t; //no type casting req since widening
		System.out.println(k);//10
		
		int p = 150;
		byte q = (byte) p; //errs initially until casting applied since NARROWING
		System.out.println(q);//-106
		
		long l = p;
		System.out.println(l);//150//int can be stored in long as well-widening
		
		long l1 = 1000;
		float f1 = l1;
		System.out.println(f1);//1000.0//long can be stored in float-widening
		
		float f2 = 12.85f;
        long l2 = (long) f2;//errs until cast is applied to RHS
        System.out.println(l2);//12
        
        int i1 = (int) f2;
        System.out.println(i1);//12
        
        //-128 to 127
        float f3 = 200.85f;
        byte b3 =(byte) f3; //errs until cast is applied
        System.out.println(b3);//-56
        
        //increment and decrement operators concept:
        
        //post increment:
        int a = 1;
        int b = a++;
        System.out.println(a); //2
        System.out.println(b); //1
        
        int y=10;
        
        
        
        
        
        
        
	}
	
	

}
