package dec2023javasessions;

import java.util.ArrayList;

public class JavaArrayListDynArrListImple10 {
	
	/**
	 * 
	 * ArrayList: is a default in-built class already there in Java
	 * we need to create the object of ArrayList to use it-using new keyword
	 * 
	 * ArrayList ar = new ArrayList();
	 * import this class from java.util package of java lib
	 * no size needs to be mentioned - since it is dynamic
	 * is index based - stores values on the basis of index
	 * 
	 * how to get the size of ArrayList?
	 * ar.size();
	 * 
	 * array list size is increased automatically-no AIOB exception is thrown
	 * 
	 * allMethods of ArrayList:
	 * add();
	 * remove();
	 * can directly print ArrayList-no need of dot toString() needed
	 * Class objects -- can be directly printed
	 * 
	 * can duplicate values be added?? yes
	 * 
	 * ArrayList: yellow warning--ArrayList is a raw type=>data type not declared
	 * ===> non-generic - any type of data can be added
	 * 
	 * warning mesg: reference to the generics must be parameterized
	 * //markslist --> Generic: int | Integer
	 * //Generics cannot be the primitive data type => keywords not allowed
	 * in generics -- only the wrapper classes OR their respective classes
	 * are allowed
	 * Both LHS, RHS must have the same generics
	 * 
	 * yellow warning => unused warning
	 * 
	 * //emp info: name, age, salary, isActive, gender
		ArrayList<Object> empDataList = new ArrayList<Object>();
		empDataList.add("Rahul");
		empDataList.add(30);
		empDataList.add(50.33);
		empDataList.add(true);
		empDataList.add('m');
		empDataList.add('m');
		empDataList.add(null);
		empDataList.add(null);
		//duplicate values allowed
		//null can be added
		//multiple nulls are allowed
	 * 
	 * 
	 * IQ] Explain the internal implementation of an ArrayList???
	 * how it is working internally???
	 * --------------------
	 * after writing
	 * ArrayList ar = new ArrayList();
	 * how the memory is working internally-java creates 10 virtual segments
	 * in the memory - as the default value of vc/virtual capacity is 10
	 * --it starts from top
	 * physical capacity - is 0 since no eles added yet
	 * ar.size(); --always goes and checks the current physical capacity so zero in the
	 * begining
	 * we do not have any method to calculate the vc
	 * now start filling the values in the ar
	 * ar.add('e); now pc=1; and vc = 9=10-1
	 * .
	 * .
	 * .
	 * .
	 * 
	 * 
	 * after all 10 segments filled pc=10; vc=0--here the virtual segments
	 * (SECOND SLOT) will be added automatically by java-using the formula valuesFilled(pc)/2=5
	 * ar.add(1100);
	 * 
	 * This concept is called LOAD FACTOR = pc/2
	 * 
	 * what is the reason for the vc being given by java--MEMORY MANAGEMENT
	 * for virtual segments--there are no bytes/bits=>physically not occupying
	 * any memory
	 * 
	 * ArrayList list = new ArrayList(5);//if nothing is written inside ()
		//the vc = 10-if explicitly some value is there then vc=5
		//0 1 2 3 4
		//vc=0, pc=5
		//pc/2=5/2=2
		//vc=2
	 * 
	 * 
	 * 
	 */

}
