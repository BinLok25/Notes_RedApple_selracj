package dec2023javapracticals;

public class DataTypes2a {
   public static void main(String[] args) {
	   byte b = 10;
	    b = 11;
	    b=127;
	  //  b=128;  going out of range
	    b=-128;
	  //  b=-129; going out of range
	    b=100; //byte appropriate for storing age vars
	    
	    System.out.println(b);
	    
	    short s1 = 1000;
	    short s2 =1;
	    System.out.println(s1+s2);
	    
	    long l = 100029292;
       long l1 = 9898555558l;
       System.out.println(l1);
       
       System.out.println((byte)'%');
       System.out.println((byte)'^');
       System.out.println((byte)'@');
       
       System.out.println(100+'a');//197
       System.out.println('a'+'b');
       
       //to print ab??simply concatenate with double quote in between
       System.out.println('a'+""+'b'); //ab
       
       
       
       //7.char type: only single digit value-best data type for char: is byte
       char c = 'a';
       char c1 = '1';
       char c2 = '$';
       
       char n1 = 'a';
       char n2 = 'b';
       
       System.out.println(c);
       System.out.println((byte)c);
       System.out.println((byte)c2);
       
       //boolean: true/false --not keywords BUT predefined kws for the bool values
       //size: ~ 1bit
       //range: no range
       boolean flag = true;
       boolean pop = false;
       boolean isUserActive = true;
       
       
       
   }
}
