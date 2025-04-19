package javacollections;

import java.util.ArrayList;
import java.util.Iterator;

import arraylistconcept.Employee;

public class ArrayListConcept2 {

	public static void main(String[] args) {
		
		//static array:
		int a[] = new int[4];
		
		//dynamic array:
		//1.can contain duplicate values/elements
		//2.maintains insertion order
		//3.synchronized
		//4.allows random access to fetch the eles as it stores on index basis
		
		ArrayList ar1 = new ArrayList();
		ar1.add(20);
		ar1.add(20);
		ar1.add(30);
		
		System.out.println(ar1.size());//size of arraylist
		
	//	System.out.println(ar1.get(3));//to get the value at index=3
		
		ar1.add(40);
		ar1.add(50);
		ar1.add(50);
		ar1.add(12.33);
		ar1.add("Test");
		
		System.out.println(ar1.size());
		
		System.out.println(ar1.get(4));
		
		//to print all the values from arraylist:
		//1.for loop
		//2.using iterator
		
		for(int i=0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		System.out.println("--------------------");
		//non-generic vs generic:
		
		
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("core Java");
		ar2.add("Selenium");
		ar2.add("Rest Assured");
		
		//using iterator to print all the values of ar2:
		Iterator<String> it = ar2.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		System.out.println("--------------------");
		//initializing the Employee class objects:
		Employee e1 = new Employee("Yadavi", 50, "QA");
		Employee e2 = new Employee("Meera", 35, "Dev");
		Employee e3 = new Employee("Tara", 36, "Manager");
		
		//creating arraylist:
		ArrayList<Employee>ar3 = new ArrayList<Employee>();
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);

		//iterator to traverse the values of ar3:
		Iterator<Employee> itr = ar3.iterator();
		while(itr.hasNext()) {
			Employee emp = itr.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.department);
			System.out.println("--------------------");
		}
		
		
	}

}
