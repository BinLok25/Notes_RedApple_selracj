package dec2023javasessions;

public class InterfaceAbstractionMultInheri21 {
	
	/**
	 * 
	 * child - parent class(1) -- parent interfaces(n)
	 * 
	 * diamond problem: a child class cannot have multiple parents==>multiple
	 * inheritance 
	 * Multiple inheritance is allowed in the form of interfaces in JAVA
	 * 
	 * scenario: USMedical, UKMedical, IndianMedical--3 interfaces
	 * ---a child class --FortisHospital implements all 3 interfaces
	 * --when u connect the DOTs is a Diamond
	 * 
	 * in interface:
	 * no method body is allowed -- abstract methods
	 * only method declaration
	 * only method prototype
	 * cannot create an obj of interface
	 * interface cannot have bussiness logic
	 * 100% abstraction
	 * 
	 * interface cannot think about the business logic
	 * 
	 * interface can have a parent interface, BUT not a parent class* * * *
	 * 
	 * top casting/up casting: with interfaces
	 * child class obj can be referred by parent interface ref variable
	 * 
	 * what all methods cannot be overridden??
	 * private, static and final methods cannot be overridden
	 * 
	 * after jdk 1.8, two major changes:
	 * 1.we can have static method with method body
	 * public static void billing(){
	 *  System.out.println("USM - billing");
	 *  }
	 * 
	 * 
	 * 2.we can have default method with method body:
	 * default void medicalInsurance(){
	 *  System.out.println("USM - medical insurance");
	 *   }
	 *   
	 *   if the above method is overridden then public access modifier has
	 *   to be written
	 * method hiding:
	 * 
	 * 
	 */
	

}
