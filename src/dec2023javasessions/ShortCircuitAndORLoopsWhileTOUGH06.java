package dec2023javasessions;

public class ShortCircuitAndORLoopsWhileTOUGH06 {
	
	/**
	 * 
	 * ShortCircuit operators/conditional operator(&&)(||):
	 * &&(both of them shud be true) ---> both the conditions==> whenever u need 
	 * to give a RANGE
	 * if RHS chk is false--> immediately will short circuit
	 * even if multiple conditions-traverses until it finds a false condition-
	 * where it short circuits/stops
	 * if(a>b && a>c && a>d && a>e){}  
	 * && operator says that the control checks for LHS and RHS
	 * if first condition fails--immediately it short circuits and control goes
	 * to else-if part
	 * if first condition is satisfied/true then only will chk the RHS condl part
	 * Both conditions need to be true-in order to go into the loop/flower braces
	 * false && false - false
	 * true && false - false
	 * true && true - true
	 * 
	 * &&: if LHS is true -- then control goes to RHS
	 * ||: if LHS is false -- then control goes to RHS
	 * 
	 * Short Circuit: use cases
	 * for marks validations, finding the greatest no,-->>to chk specific ranges
	 * 
	 * ||: this operator says either of them should be satisfied
	 * if first condition-not satisfied/false WILL TO SECOND CONDITION
	 * 
	 * |: single OR chks each and every condition
	 * &: chks each and every condition even if first condition is false
	 * if(a>b || a>c) ==> if a>b is not satisfied/true-->control skips the RHS part
	 * if(a>b | a>c) ==> if a>b is false-even then the control goes to RHS part
	 * || and |: what is the difference--> will go to each and every condition
	 * 
	 * 
	 * when to use single OR??(|):use cases:
	 * to chk a web element btn on the page:when all conditions are mandatory use &
	 * 1. isVisible
	 * 2. isEnabled
	 * 3. isClickable
	 * 
	 * 
	 * & : is not a short circuit operator and will chk both the LHS and RHS
	 * whether the condition is satisfied or not--is favourable to LOG issues
	 * if(isVisible & isEnabled & isClickable)
	 * --chks each and every condition whether true/false
	 * 
	 * &&
	 * if(isVisible && isEnabled && isClickable)
	 * --will not chk the 2nd and 3rd condition if first condition is false
	 * ==> immediately will break and come out of loop when first condition is false
	 * 
	 * Difference between & and &&??
	 * 
	 * || or &&:
	 * --------------***VERY IMP
	 * whenever chking giving the ranges -- solve it with && or ||
	 * && : will traverse to the second condition only if first is true
	 * --whenever it encounters a false condition then short circuits/stops
	 * short circuit reason for && is false
	 * 
	 * 
	 * || : will traverse to the second condition if the first is false
	 * --whenever it encounters a true condition then short circuits/stops
	 * short circuit reason for || is true
	 * 
	 * LOOPS:
	 * Whenever we have to repetitive work--then we have to use Loops
	 * used to escape from repetitive code/if..else statements
	 * Three kinds of Loops: while, for loop, do..while loops, 
	 * fourth kind--> Advanced for loop==> for each loop
	 * 
	 * WHILE: in this loop we have to write a condition which is boolean-SHOULD HAVE
	 * AN INCREMENTAL PART(can be i++/++i/i=i+1)  ****VeryImp
	 * if if statement is written inside - the while loop then can write a break statement
	 * 
	 * BUT break will not just break the if statement BUT will break the entire
	 * While/Switch loop
	 * 
	 * can break statement be written inside the while loop?? yes
	 * it breaks the entire loop as soon as it reaches break the first time
	 * 
	 * can we write also inside the while loop??yes using && operator
	 * 
	 * cons: if the iterative/increment is missing then will go into infinite loop
	 * modulus(%): will give the remainder
	 * 1%5 equals 1
	 * 5%5 equals 0
	 * 
	 * 
	 * !: not is written before a boolean flag to make it false/reverse
	 * 
	 * 
	 * &&: and ==> all should be true
	 * ||: OR ===> either of them should be true
	 * if(c1 || c2 ||c3)--if first condition is true--will not go to second condition
	 * if c1 is false --will traverse until true is found and then terminates
	 * 
	 * |: OR ==> also either of them should be true-one of them is true is fine
	 * 
	 * RESULTANT: of && and & is the same
	 * && --> improves the performance
	 * & --> this is good for logs/print information
	 * of || and | is the same
	 * 
	 * 
	 * for primitive: use == for equals to
	 * for non-primitive: String use .equals()
	 * 
	 * 
	 */

}
