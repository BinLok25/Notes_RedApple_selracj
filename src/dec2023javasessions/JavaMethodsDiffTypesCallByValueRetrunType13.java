package dec2023javasessions;

public class JavaMethodsDiffTypesCallByValueRetrunType13 {
	/**
	 * FINAL: can be applied to the local var and also class var
	 * final vars should always be named all in uppercase letters with underscores in 
	 * between the words #####
	 * 
	 * BOTH: class var/local var can be final
	 * BUT: class var can be static
	 * AND: local var CANNOT BE STATIC
	 * 
	 * if the same name is given to both class var and local var -- when the var is called
	 * from inside the main() fn the preference is given to local var always
	 * TO CALL THE CLASS VAR: obj has to be created ==>
	 * classname objRefName = new classname();
	 * objRefName.classvarname 
	 * 
	 * Naming convention for final vars in JAVA:
	 * ------->>>>all capitals with underscore in between
	 * final int DAYS_IN_WEEK = 7;
	 * 
	 * FUNCTIONS/METHODS: both same
	 * ---------->>>>>without fns cannot write any single line of code in any language
	 * main(String[] args) {}
	 * ---is also a fn
	 * it takes Array of String args -- String[] args
	 * 
	 *  //cannot create a function/method inside a function
	 *  //functions are parallel to each other
	 *  //but can call a function from another function
	 * 
	 * PURPOSE: of fn is that fn is having some business logic and this fn we can call it
	 * AND this fn may/maynot return a value
	 * 
	 * is doing something for you -- give input-get output/return
	 * ==> is like a factory
	 * can call a fn n no. of times
	 * 
	 * in the fn -- void and return cannot be together
	 * IS IT A GOOD PRACTICE TO CALL A FN INSIDE PRINT LN STATEMENT?? no
	 * 
	 * Whatever type of params - the fn is made of - the return value should also be stored
	 * in the same return type
	 * 
	 * RETURN : major advantage is that it automatically returns the value from the fn-can
	 * do the calculation and get it stored in a variable
	 * 
	 * either u write blank return or not: By Default it is void in nature
	 * 
	 * public void printName() {
		System.out.println("BinAuto");
		return;//blank return -- void
	}
	 * 
	 * 
	 * we have to create an obj - to call a non-static data members
	 * => vars + methods/fns
	 * 
	 *  //1st: function: no input and no return
	 *  //input: no input
	 *  //return: void -- can not return anything
	 * FUNCTION SIGNATURE ---->>>
	 * public void test(){
	 * 
	 * }
	 * 
	 * 
	 * 2nd: function: some input and no return
	 * 
	 * public void getBill(int days){
	 * 
	 * System.out.println("getting billing amount");
	 * int finalAmount = days * 100;
	 * System.out.println(finalAmount);
	 * 
	 * }
	 * 
	 * 
	 * ---whenever fn is returning something store it in a var and then print--GOOD PRACTICE
	 * 
	 * //3rd: function with some input and return
	   //return type: int
	public int sum(int a, int b) {//2 params fn
		System.out.println("adding two numbers");
		int s = a+b;
		return s;
		
	 * 
	 * call by value: calling a fn by passing a value
	 * what is the diff between param and an argument?
	 * ----imp IQ ########
	 * when we declare a fn with some vars inside the paranthesis
	 * --it is called a param
	 * BUT when we call the same fn - we pass the value for the param
	 * ---that actual value is called argument==> supplying the values when calling the
	 * fn is called argument for the fn
	 * 
	 * e.g: getBill(int days){}; int days is the param
	 * in the main method when we call the same fn by passing some
	 * value to the param: ==>
	 * obj.getBill(10); ---10 is the argument 
	 * 
	 * 
	 * 
	 * IQ]What is the return of main function??? void
	 * because it is not returning any object
	 * 
	 * IQ] is it a good practice to return something in the main()??? NO
	 * 
	 * JVM : says that to start execution from main- the main() methods signature should be
	 * exact public static void
	 * 
	 * What is recursive fn??
	 * a fn returning itself is recursive fn
	 * 
	 * A FN CANNOT RETURN MULTIPLE VALUES 
	 * RETURN statement should be the last statement of the function
	 * RETURN n System.out.println() ---are not the same
	 * BLANK RETURN : is allowed with void
	 * 
	 * public void printName() {
		System.out.println("BinAuto");
//		return;//blank return -- void //blank return is allowed with void => no value in retrun
	}
	 * 
	 */

}
