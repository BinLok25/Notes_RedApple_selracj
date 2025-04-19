package dec2023javasessions;

public class TopCastingDownCastingInheritRulesFinalKW20 {
	/**
	 * VARIABLE OVERLOADING: no such concept in java
	 * IQ] can we have multiple classes for a specific child class?? No
	 * Since it creates a DIAMOND PROBLEM => MULTIPLE INHERITANCE
	 * 
	 * ----the same concept of a specific child class having multiple parents
	 * ----is made possible in java with the help of INTERFACES
	 * 
	 * METHOD HIDING/static method overriding:
	 * if the child class has the same method as in the parent interface
	 * ---then it is called method hiding---NEED to write proper NOTES on this
	 * 
	 * STATIC methods/vars: cannot be overridden BUT inherited into the child
	 * class
	 * 
	 * What is the reason for static methods --NOT TO BE ABLE TO be OVERRIDDEN
	 * ---------Static methods/vars stored in CMA and is not part of OBJECT
	 * it is stored somewhere in CMA -- is only one copy
	 * and it would be violation of OOPS concept
	 * Hence java avoids overriding for STATic methods/vars
	 * since there is no object assoiciated with it -- it cannot participate
	 * in polymorphism which is an oops concept ==> method overloading/overridding
	 * ....
	 * 
	 * PRIVATE: methods cannot be overridden
	 * 
	 * GETTERS/SETTERS: for private variables
	 * 
	 * can we use a private key word for a method??
	 * ----if final method/var then they cannot be overridden
	 * 
	 * to prevent METHOD OVERRIDING : can declare a method as FINAL
	 * 
	 * STATIC,FINAL,PRIVATE: these 3 types cannot be OVERRIDDEN
	 * 
	 * TOP/UP CASTING: child class obj can be referenced by parent class ref variable
	 * topcasting LIMITATION: can access individual/overridden methods
	 * 
	 * 
	 * PARENT: can access the overridden methods
	 * 
	 * 
	 */

}
