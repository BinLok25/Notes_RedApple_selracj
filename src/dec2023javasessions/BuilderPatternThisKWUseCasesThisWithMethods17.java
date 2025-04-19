package dec2023javasessions;

public class BuilderPatternThisKWUseCasesThisWithMethods17 {
	
	/**
	 * one constructor could be called from another constructor BUT it 
	 * should be the first statement
	 * 
	 * public Employee(String name, int age){
	 *        this("testing", 40, 10); //one constr...being called from another constr.
	 *        this.name = name;
	 *        this.age = age;
	 * }
	 * 
	 * is it a good practice to create an obj inside a constructor??
	 * 
	 * 1.calling non-static method from static -- happens only with obj
	 * creation
	 * 2.calling static method from Non-static -- direct call/thru classname.methodname
	 * 3.non-static AND non-static --->>can talk to each other
	 * 
	 * BUILDER PATTERN:
	 * 
	 * we avoidd the builder pattern in the POM
	 * 
	 * 
	 * This: keyword can be used not only in constr... BUT in the method also
	 * to initialize the class vars
	 * 
	 * //this keyword: use cases
		//1. constr...+this
		//2. constr...calling
		//3. method + this
		//4. builder pattern ---> return this
	 */

}
