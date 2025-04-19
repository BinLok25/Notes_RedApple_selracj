package dec2023javasessions;

public class CondiStmentsIfElseSwitchCase05 {
	/**
	 * break: is allowed only in loops and switch case statements
	 * switch: applicable only for integers, Strings and chars
	 * 
	 * 
	 * Conditional Statements: 
	 *    if...else statements-to compare some things, two vars
	 *    
	 *    if(){} else{}
	 *    
	 *    if(){} else if(){}..elseif(){}.....else{}
	 *    
	 *    inside the () -- always should have a boolean expression
	 *    
	 *    can a direct boolean value be written inside the () yes
	 *    ----->Antipatterns of writing the code
	 *    if(true){
	 *      system.out.println("Hi");
	 *      }
	 *      else {
	 *      system.out.println("Bye"); //unreachable code-dead code
	 *      }
	 *    -----------//
	 *    boolean flag = true;
	 *    if(flag){
	 *     system.out.println("Hello");
	 *    }
	 *    else{
	 *    system.out.println("World");
	 *    }
	 *    ------//
	 *    int t1 = 100;
	 *    int t2 = 200;
	 *    
	 *    if(t1>=t2){
	 *      system.out.println("t1 and t2 are gr than or equal");
	 *      }
	 *      ----//can we write else without if ?? No
	 *      ----//can we write not inside the ()
	 *      int p1 = 100;
	 *      int p2 = 200;
	 *      if(p1!=p2){
	 *      system.out.println("selenium");
	 *      }
	 *    
	 * 
	 *     == >= <= < > !=  are all comparison operators-conditional operators
	 *     
	 *     else statement always attached with the last if...statement
	 *     ---if the last if is satisfied/true then it will not enter the else part
	 *     
	 *     GOOD PRACTICE:
	 *     so if multiple ifs have to be written then always tag with else if()...else if()..
	 *     then finally the else{} part --- has performance issue though-still anti in case of 
	 *     multiple condition -- TO IMPROVE --use SWITCH CASE
	 *     
	 *     property of SWITCH: direct jump to the matching case and doesnot
	 *     traverse to each case before there is a match--has NO PERFORMANCE ISSUE
	 *     
	 *     else part imp: if the user sending wrong info then the else part should
	 *     say the info about the wrong data being given in the program
	 *     
	 *     to compare two strings: use equals();
	 *     
	 *     break; not allowed to be written outside of a loop OR switch case
	 *     not allowed inside an if condition
	 *     
	 *     Switch case statements:Err
	 *     cannot switch on a value of type double
	 *     only conversible of int values, Strings,or enums
	 *     
	 *     doubles are not allowed inside a switch case statement
	 *     switch cases are applicable only for ints, Strings, enums
	 *     not for doubles
	 *     
	 *     is boolean allowed in switch case?? Err
	 *     cannot switch on a type boolean
	 *     
	 *     can we use switch case for a long no???No
	 *     
	 *     chk it for byte and short values as home work??
	 *     
	 *     characters are considered as a no.s so characters are allowed
	 *     
	 *     switch case statement: use cases
	 *     crosss browser navigations
	 *     multi environment set up: dev, qa, stage, prod
	 *     role based access control: RBAC
	 *     RBAC: user roles: admin, customer, partner, manager, vendor
	 *     Element Locator: id, name, classname, xpath, css, linktext
	 *     OS: windows, Mac, Linux
	 *     mobs: android, ios
	 *     
	 *     nested case : not allowed
	 *     
	 *     if statement can be written inside the switch case statement
	 *     
	 *     switch case : can be written inside the switch case under another case
	 *     ==> nested switch case
	 * 
	 */

}
