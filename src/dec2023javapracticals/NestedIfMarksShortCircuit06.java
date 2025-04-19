package dec2023javapracticals;

public class NestedIfMarksShortCircuit06 {
 //this problem cannot be solved using switch case - as there will be many cases 
	//to cover-->cannot give number range in the case statement of switch
	public static void main(String[] args) {
		int marks = 100;
		if(marks <= 100) {
			if(marks >= 80 && marks <= 90) {
				System.out.println("Grade A");
			}
			else {
				if(marks >= 95) {
					System.out.println("Grade A++");
					if(marks == 100) {
						System.out.println("eligible for scholarship");
					}
				}
				else {
					if(marks >=0 && marks <=10) {
						System.out.println("failed");
					}
					else if(marks >=11 && marks <= 30) {
						System.out.println("Grade C");
					}
				}
			}
		}
		else {
			System.out.println("plz pass the right marks");
		}

	}

}
