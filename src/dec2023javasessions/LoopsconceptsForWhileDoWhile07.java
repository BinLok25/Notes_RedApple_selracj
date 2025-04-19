package dec2023javasessions;

public class LoopsconceptsForWhileDoWhile07 {
	
	/**
	 * 0 : is neither odd OR even -- doesnot come in the category of odd/even
	 * 
	 * in code if there is an infinite loop encountered -- then the code after
	 * the line where it raises an infinite loop will start erroring in red since
	 * it becomes unreachable
	 * 
	 * while loop: initialization is not participating in the loop WHEREAS
	 * for loop: initialization is participating in the loop****
	 * 
	 * when to use for loop and when to use while loop???
	 * for loop: use cases
	 * ------------->e.gs
	 * 1.static dropdown
	 * 2.to iterate Arrays which are fixed size
	 * 
	 * can get infinite loops even with For : when the incremental part is missing
	 * 
	 * for(int k=1; k<=10; ){
	 *    System.out.println(k);
	 *    }
	 *    
	 * -----------------the below for loop is also correct
	 *    int k = 1;
	 *    for(; k<=10; ){
	 *    System.out.println(k);
	 *    k++;
	 *    }
	 *  //------will give infinite Bye -since by default it will take true for conditional
	 *  part
	 *  for(; ;){
	 *   System.out.println("Bye");
	 *   }
	 *   
	 *   //while loop------>
	 *   
	 *   while loop: use cases
	 *   when no. of iterations are not fixed
	 *   ---------------e.gs
	 *   1.webelement on the page-dynamic-wait is varying 5,10,15,3,30
	 *   not sure how much time it takes to appear on the page
	 *   2.wait until page loading
	 *   3.dropdown: values are dynamic-sometimes 5, 10, 20 values seen
	 *   4.webtable pagination
	 *   5.carousel
	 *   recommended for you on ecommerce websites-with an > btn
	 *   6.calendar handling/date picker
	 *   7.page scrolling:infinite 
	 *   
	 *   int i =1;  //initialization is excluded from loop=> not participating in the loop
	 *   while(i<=10){ //conditional part
	 *   System.out.println(i);  //statement part
	 *   i++;  //incremental part
	 *   
	 *   relate the above code with the diagram of while
	 *   we have to write the business logic in such a way-that we come out of
	 *   the loop => incremental part
	 *   
	 *   //for loop -------->have 3 sections inside the ()-initialization, condition
	 *   and incremental part--can shuffle the init, incremental parts out of the
	 *   brackets as well
	 *   short/byte data type vars can be used inside the for loops
	 *   initialization is participating in the loop only the first time
	 *   
	 *   There will be some discrepancy in the output when float values are used
	 *   in a for loop-which can be overcome -- with the use of WRAPPER classes
	 *   
	 *   in the programming world byte/float works like that only
	 *   
	 *   for(float h=1.0f; h<=5.5; h++) {
    	 System.out.println(h);
    	 h=h+0.1f;
     }
     
	 *   
	 *  
	 *   for(int k=1; k<=10; k++){ //if incremental part missing-infinite loop
	 *   System.out.println(k);
	 *   k++;  //can write ++k/k=k+1
	 *   
	 *   
	 *      }
	 *      
	 *     System.out.println("----Print Odd&Even Nos using For...Loop----");
	
	//1 to 10:odd
//	for(int num=1;num<=10;)//num++) {
//		System.out.println(num);
//		//num++;//instead increase the num by 2
//	   
//		
//	}
		
	
	for(int num=1; num<=10;) {
		System.out.println(num);
		num = num+2;
	}
		 
	 *      
	 * do...while loop------------>
	 * 
	 * inside this loop -- while doesnot have any body
	 *  
	 * here also the no. of iterations are not fixed
	 * in this loop while doesnot have a body-only condition in ()
	 * in do...while loop-the business logic whatever u have already written will
	 * execute atleast once   
	 *  //1 to 10:
	 *  int d= 1;  //generates infinite loop since incremental part missing
	 *  do{//behaves like a while body even though while does not have direct body
	 *  }
	 *  while(d<=10); //only if this while condition is satisfied-goes into do block   
	 * 
	 * -------CORRECT SYNTAX OF DO-WHILE------->>>
	 * System.out.println("//do...while loop----->");
     int d =1;
     do {  //generates infinite loop if incremental part missing
    	 System.out.println(d);
    	 d++;
     }
     while(d<=10);
     //d++  //if incremental part writtten here-will generate infinite loop
     
	 * 
	 * 
	 * do...while loop: use cases
	 * 1.element already present on the page -- click on it and break
	 * 2.
	 * 
	 * 
	 * There are 2 more: advanced loop other than the above
	 * 4.for each loop
	 * 5.streams: using lambda added in jdk 8
	 * 
	 */

}
