package dec2023javapracticals;

public class NestedIfSalaryProblem06 {
	//for checking the ranges - always use &&
	//it does not make sense to use || since it traverses to the RHS condition-if lhs false
	public static void main(String[] args) {
		int salary = 60;
				if(salary<=100 || salary <=10) {
				System.out.println("PASS");	
				}
	}

}
