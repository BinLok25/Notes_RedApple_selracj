package dec2023javasessions;

public class ArrayLiteralTimeComplexityForEach09 {
	/**
	 * Array: non-primitive data type
	 * can store similar kind of data types
	 *
	 * two major limitations:
	 * 1.size is fixed: Static Array
	 * 2.it can store only similar type of data: you can use Object array to
	 * solve the problem
	 * 
	 * disadvantage: if we use static array for storing data-in future more
	 * data cannot be added and we have to resize the array once again in order
	 * to fit new data
	 * 
	 * ----this first type of declaration is called using new key word
	 * int i[] = new int[40];
	 * first we were taking the space -- the max we need
	 * then declare only few whatever in need right then
	 * i[0] = 10;
	 * i[1] = 20;
	 * i[2] = 30;
	 * i[3] = 40;
	 * ----------------------------all previous class notes
	 *
	 *1.we can declare the Arrays using the -- new keyword
	 * 
	 *2.when we have the Array available already=>the values of which are known already
	 *-we can use the array literals
	 * to declare when we have the array values already available
	 * 
	 * ArrayLiterals: curly bracket is part of literal
	 * ----------
	 * int i[] = {10,20,30,40,10,1};
	 * 
	 * this is still static array the only diff is that on the fly not creating/
	 * adding the values
	 * 
	 * cannot go beyond the range-will throw AIOB Exception
	 * 
	 * char ch[] = {a,e,i,o,u}; in-correct syntax-chars should be in single quotes
	 * char ch[] = {'a','e','i','o','u'}; correct syntax
 	 * 
	 * Arrays.toString(arrayName); //prints only in horizontal mode
	 * 
	 * to print in the vertical mode -- have to use for, for each, ...loops
	 * to print in the horizontal mode -- REMOVE ln in the println statement
	 * from inside the loop
	 * 
	 * ArrayLiterals: are used when we know the values of the array already
	 * =>before the creation
	 * 
	 * Array Creation-using 'new' keyword:
	 * done when we do not know the values before hand and we need to add values
	 * on the fly --- whenever required
	 * 
	 * ForEach/Advanced loop: concept
	 * ----------can be used for any kind of data--is not an index based loop
	 * ---not good for backward traversing => in the decreasing order
	 * 
	 * PROBLEMS - for each loop:
	 * -------
	 * 1.cannot use index in this loop
	 * 2.cannot traverse reverse thru the array
	 * 3.major disadvantage-print in reverse order is a complex program
	 * 4.they are slower -- internally it acts as a for loop-it is just a wrapper
	 * on top of a for loop
	 * 
	 * TIME COMPLEXITY: CONCEPT(TC)
	 * ------------------>
	 * amount of time it will take to run the program
	 * can be part of code review during the PR, before architecture - is
	 * considered
	 * ==>Caluclate no. of times the lines of code are getting iterated
	 * 
	 * code optimization---> is never based on the no.of lines of code
	 * the time matters that how soon are we getting the output
	 * how soon it is getting executed and giving the output on the console
	 * 
	 * BIG O: is the representation of time complexity
	 * means the time complexity for a particular code
	 * 
	 * do not chk the no of lines of code-just chk the frequency
	 * 
	 * 
	 * //larger data: 1 to 10M
		
		//BIG O -> 0
		
		int i = 10;
		System.out.println(i);//executes only once-to print 10
		//O(1) - constant time
		
		//20 secs --> 0.000001
		for(int k=1; k<=100000; k++) {
			System.out.println(k);
		}
		
		//calculating TC for the above for loop:
		/**
		 * int k=1; gets executed only once so - 1
		 * k<=100000; gets executed 100000 times=> n times - n
		 * k++ executes 100000 times => n times - n
		 * System.out.println() - executes 100000 times => n
		 * ----overall TC
		 * 1 + n + n + n = 3n+1 ---> a linear Equation
		 * 3n+1 ---> 3n
		 * 1 can be ignored since minute fraction of time it takes 0.000001
		 * even 3 can be ignored from 3n --> since it is also minute time taken
		 * 3n+1 -->3n --> n -->O(n) is overall TIME COMPLEXITY
		 */
	 /**
	  * 
	  * if the LINEAR EQUATION and the CONSTANT TIME - has to be drawn as a
	  * graph
	  * ----->>>how to explain at the time of interview
	  * draw an x and y axis
	  * x ---> represents time taken
	  * y ---> no of iterations
	  * 
	  * constant time is always the horizontal line on x- axis ==>O(n) graph
	  * 
	  * y=mx+c; ---> represents O(n)
	  * 
	  * 
	  * calculating the TC for a while loop:
	  * 
	  * //calculating the TC for a while loop:O(n)
	  * ---------------------->
		int p=0;
		while(p<10) {
			System.out.println(p);
			p++;
			System.out.println("hi");
		}
		//linear eq:1+n+n+n+n = 4n+1 => 4n -->O(n) is TC for a while loop
	  * 
	  * 
	  * do..while TC = O(n)
	  * ---------------------->
	  * 
	  * 
	  *  TC of the array with the iterations:
	  *  -------------------->
	  * //calculating the TC of the array with the iterations:O(n)
		short sh[] = {100, 200, 322,344};
		for(short e: sh) {
			System.out.println(e);
		}
	  * 
	  * TC = 1+n+n = 2n+1 -> 2n --> O(n)
	  * 
	  */
	/**
	 * 
	 * for(int x=1;x<=5;x++) {//5 times inner loop is executing=>5x5=25
			for(int y=1; y<=5; y++) {
				System.out.println(x+""+y);
			}
		}
		/**
		 * use cases:excel sheet iteration, 2D array, matrix, csv files
		 * json files
		 * 
		 * for each iteration of x => inner loop executes 5 times => 1x5
		 * outer loop executes 5 times ==> inner loop executes 5x5 = 25 times
		 * TC:O(n^2)
		 * (1+n+n)(1+n+n+n) = (1+2n)(1+3n)=1+2n+3n(1+2n)
		 * 1+2n+3n+6n^2 = 1+5n+6n^2 = after ignoring 1 = 5n+6n^2 
		 * = n(5+6n) = after ignoring 5 again = 6n^2 --> remove the factor 6
		 * --> O(n^2)
		 * is taking more time for O(n^2) when compared on graph with O(n)
		 * CONCLUSION: O(n) is better performance wise
		 * 
		 * 
		 */
		//calculating for 3 loops: one inside another
		/**
		 * for(int x=1; x<=5; x++) {
			for(int y=1; y<=5; y++) {
				for(int z=1; z>=5; z++) {
					System.out.println(x+""+y+""+z);
				}
			}
		
		}
		 * 
		 */
		
		/**
		 * TC: n^3+n^2+n+1 - cubic --> O(n^3)
		 * (n)(n)(n)
		 * takes even more time than O(n^2) when compared on the graph with
		 * time taken - on x axis and no of iterations on y axis
		 * 
		 * O(n^k) -- dangerous
		 * O(log n) -- we get for binary search
		 * Google search - for Time complexity and go thru the graphs
		 * space complexity ==> memory management
		 */
     /**
	 * 
	 * for every primitive data types: there is some non-primitive wrapper 
	 * classes that are already existing for e.g
	 * int ---> Integer --is a class
	 * float ---> Float
	 * boolean ---> Boolean
	 * 
	 * Arrays: there is no removal method provided by java
	 * Shrink -- happens only in dynamic array
	 * 
	 * iterate: O(n)
	 * update/fetch: O(1)
	 * delete: O(n) --have to write a loop to delete
	 * 
	 */

}
