package dec2023javasessions;

import dec2023javapracticals.StaticMethodConcept15;

public class StaticMethodStackMemoryStackOverFlowMethodCalling15 {
	
	/**
	 * 
	 * public class StaticMethodConcept15 {
	
	public static String name;
	public int age;
	
	public static void getInfo() {
		System.out.println("get info");
	}
	public void sendMail() {
		System.out.println("send mail");
	}

	public static void main(String[] args) {
		//call static var and methods:
		//1.by using class name:
		StaticMethodConcept15.name = "Tom";
		System.out.println(StaticMethodConcept15.name);
		
		StaticMethodConcept15.getInfo();
		
		//call non static method: create the object
		StaticMethodConcept15 obj = new StaticMethodConcept15();
		obj.age = 10;
		obj.sendMail();
		
		//2.can access static vars and methods using obj ref name, but with
		//a warning: not recommended
		System.out.println(obj.name);
		obj.getInfo();
		
		//3.can I access static var and method directly? - without class name
		System.out.println(name);
		getInfo();
	 * 
	 * 
	 * when the obj is created with this line of code:
	 * StaticMethodConcept15 obj = new StaticMethodConcept15();
	 * 
	 * MEMORY: is divided into 2 parts: HEAP   STACK
	 * for STATIC vars/methods METASPACE/CMA (name, getInfo stored here)
	 * main() also goes into static memory
	 * 
	 * one copy of classs vars name, age -- given to each obj
	 * the obj is stored on the heap => new StaticMethodConcept15();
	 * the ref var name -- obj -- is stored on stack memory
	 * all the static vars -- stored in the CMA(common memory allocation)
	 * 
	 * the class var names and the values -- stored inside each of the obj
	 * ---> on the heap =>age, sendMail()
	 * 
	 * when this line is written -- errs
	 * System.out.println(obj.name);
	 * because name is a static var ---> which needs to be called the
	 * STATIC WAY => USING CLASSNAME.varName
	 * 
	 * IQ] why main() method is static??
	 * So we do not have to create any object -- 
	 * 
	 * IQ] why main() method is void in nature??
	 * Because we do not return any thing from the main()
	 * --and also we do not write any Business Logic in the main()
	 * --main() is just a caller method -- to call the other methods, vars
	 * PUBLIC: it is public so jvm can access it anytime anywhere
	 * SO THE SIGNATURE IS LIKE THAT : for main()
	 * PUBLIC STATIC MAIN
	 * 
	 * Can we over load the static method?? YES
	 * Can we over load the main method?? YES
	 * whic method will the JVM call?? -- will always look for the signature
	 * public static void WITH one String param -- String [] args
	 * which JVM is passing and not us
	 * ---if the exact above signature is available -- then only we can call
	 * the main() otherwise we cannot call it
	 * 
	 * STACK OVERFLOW: this error StackOverFlow Error occurs 
	 * 
	 * When 2 diff main() keep calling each other
	 * e.g: A15 main() calls B15 main()
	 * ==> A15.java calls B15.java
	 * and vice versa
	 * 
	 * Stack --> memory
	 * memory is completely occupied and we do not have any space left --
	 * over flow happens and the program got crashed automatically
	 * 
	 * 
	 * EXECUTION: of programs happens always in the STACK memory and not
	 * in any other memory
	 * 
	 * HOW EXACTLY IS THE MEMORY ALLOCATED INSIDE THE EXECUTION STACK??
	 * ----------
	 * Execution stack -- works exactly like this
	 * first of all -- main() is being called by JVM, which takes some space
	 * in the STACK memory and calls it
	 * so main() is calling m1 and again m1 takes some space in stack
	 * and m1 calls m2
	 * and m2 takes some space in Stack and is Calling m3 => 4 Stacks got
	 * created
	 * ----this is the execution Stack in the STACK memory
	 * ALLOCATION AND DE-ALLOCATION of memory Stack happens
	 * after all execution memory on stack for the methods becomes o
	 * ==> start from 0 and go to max memory then when de-allocation happens
	 * it becomes 0
	 * GC cannot clean the Stack
	 * ----and actual storage of main() is in CMA
	 * and m1, m2, m3 methods are on heap
	 * 
	 * EVERY PROGRAM HAS ONE EXECUTION MEMORY FOR EXECUTION STACK - lifo
	 * Stack memory is easy to handle -- since only allocation and de-allocation
	 * happens
	 * HEAP: memory is difficult to handle--JVM takes care of it
	 * 
	 * local vars of methods : will participate in the STACK execution
	 * class vars : will not participate in the STACK execution
	 * 
	 * fifo --> Queue
	 */

}
