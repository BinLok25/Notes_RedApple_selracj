package dec2023javapracticals;

import java.util.Arrays;

public class ArraysConcept08 {

	public static void main(String[] args) {
		// Array: non primitive data type
		//can store similar kind of data types
		
		//1. using new key word:
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
//		i[4] = 50;
		
		System.out.println(i);//prints address of array -- random string
		System.out.println(Arrays.toString(i));
		
		System.out.println(i[0]);
		System.out.println(i[1]);
//		System.out.println(i[4]);//ArrayIndexOutOfBoundsException
//		System.out.println(i[-1]); //AIOB
		
		//print the values from array: for loop
		System.out.println("<--print hi,bye-->");
		for(int k=0;k<=3;k++) {
		 System.out.println(i[k]);//10 20 30 40
		 
		   if(i[k]==20) {
			   System.out.println("Hi");
			   break;
		   }
		   System.out.println("Bye");
		}
		//
		short sh[] = new short[3];//0 to 2
		System.out.println("length = "+sh.length);
		System.out.println("Li = "+0);
		System.out.println("Hi = "+(sh.length-1));
		
		System.out.println(Arrays.toString(sh));
		sh[0]= 10;
		System.out.println(Arrays.toString(sh));
		sh[2] = 30;
		System.out.println(Arrays.toString(sh));
		sh[1] = 40;
		System.out.println(Arrays.toString(sh));
		
		for(int p=0;p<sh.length;p++) {
			System.out.println(sh[p]);
		}
		//char array:
		//default value of character - is space
		char ch[] = new char[4];//0-2
		ch[0] = 'a';
		ch[1] = '1';
		ch[2] = '$';
		ch[3] = 98;
		
		System.out.println(ch[3]);
		System.out.println(Arrays.toString(ch));

		//float array:
		float fh[] = new float[2];
		fh[0] = 12.33f;
		fh[1] = 100;
		System.out.println(Arrays.toString(fh));
		
		//emp data: name(string), age(int), salary(double), gender(char), isPermanent(boolean)
	    //object array: can store any kind of data type
		
		Object empData[] = new Object[5];
		empData[0] = "Shilpa";
		empData[1] = 30;
		empData[2] = 25.55;
		empData[3] = 'f';
		empData[4] = true;
		
		System.out.println(Arrays.toString(empData));
		
		System.out.println(empData.length);
		
	   //String Array:
		String product[] = new String[3];
		product[0] = "Macbook Pro";
		product[1] = "Macbook Air";
		product[2] = "iPad";
		
		for(int x=0;x<=product.length-1;x++) {
			System.out.println(product[x]);
			
			if(product[x].equals("Macbook Air")) {
				System.out.println("Out of stock");
				break;
			}
			
		}
	}

}
