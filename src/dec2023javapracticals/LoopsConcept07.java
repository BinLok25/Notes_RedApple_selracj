package dec2023javapracticals;

public class LoopsConcept07 {

	public static void main(String[] args) {
		System.out.println("printing using sysout--10 lines of code");
		//1 to 10:worst approach
		System.out.println();
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		
		//to avoid repetitive like above: use loops
		System.out.println("printing using while loop-only 4 lines of code");
		//1.while loop:
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			//++i;  //can write i++ or i=i+1 as well
			break;//breaks the loop the first time it reaches here-so infinite
			//loop condition also saved here if incremental part missing
		}
		
		//to keep displaying infinitely remove break/only once with break
		while(true) {
			System.out.println("welcome to Hotel Taj");
			break;
		}
		//
		int p = 1;
		while(p<=100) {
			System.out.println(p);
			if(p<=100) {
				//since if is within the loop-can write a break here
				//break breaks the entire loop/switch                      
				if(p%5 == 0) {
					System.out.println("Hi");
					//break;
				//	p++;//this line leads to infinite loop again-so position of
					//this p++ should be outside of this if condition
				}
				
				p++;
				//break;
			}
		}
		//
		boolean flag = false;//true leads to infinite loop-false doesnot
		while(flag) {
			System.out.println("Hello");
		}
		//
		int total = 60;
		while(total>=50 && total<=100) {//T && F
			System.out.println("Testing");
			total++;//61 62 .....100...101
		}
		
     System.out.println("//for loop --> PRACTICALS");
//		int k = 1;
//		    for(; k<=10; ){
//		   System.out.println(k);
//		   k++;
//		    }
     
//     for(; ;){ //infinite loop since no incremental part-break will short circuit
//    	   System.out.println("Bye");
//    	   break;
//    	    }
     //can have byte/short vars inside the for loop:
     for(byte b=10; b<=50; b++) {
    	 System.out.println(b);
     }
     //can double and floats be used in for loop: yes
//     for(float h=1.0f; h<=5.5; h++) {
//    	 System.out.println(h);
//     }
     for(float h=1.0f; h<=5.5; h++) {
    	 System.out.println(h);
    	 h=h+0.1f;
     }
     System.out.println("<----chars in for loop---->");
     //a to z:
     for(char ch='a'; ch<='z'; ch++) {
    	 System.out.println(ch);//prints a to z since ch is a char when initialized
     }
     System.out.println("----------------------------");
     
     for(char cg=97; cg<=122; cg++) {
    	 System.out.println(cg+"="+(byte)cg);
     }
     System.out.println("------incremental operator------");
     for(int p1=0; p1<=10; p1++) {
    	 System.out.println("Hello World "+p1);
     }
     System.out.println("------decremental operator--------");
     //10 to 1: decremental operator
     for(int p2=10;p2>=0;p2--) {
    	 System.out.println("Hello World "+p2);
     }
     System.out.println("//do...while loop----->");
     int d =1;
     do {  //generates infinite loop if incremental part missing
    	 System.out.println(d);
    	 d++;
     }
     while(d<=10);
     //d++  //if incremental part writtten here-will generate infinite loop
     
     //
     System.out.println("-----last loop-------");
     int d2 = 1;
     do {
    	 d2++;
    	 System.out.println(d2);
     }
     while(d2<=10);
	}
	

}
