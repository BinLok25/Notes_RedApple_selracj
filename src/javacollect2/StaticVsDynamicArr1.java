package javacollect2;

import java.util.ArrayList;
import java.util.Iterator;

public class StaticVsDynamicArr1 {

	public static void main(String[] args) {
		//static Array:
		int StArr[]= new int[3];
		
		ArrayList arLi = new ArrayList();
		
		arLi.add(20);
		arLi.add(33);
		arLi.add(40);
		
		System.out.println(arLi.size());
		
		arLi.add(50);
		arLi.add(53);
		arLi.add(60);
		
		System.out.println(arLi.get(3));
		
		//creating Employee class objects:
		Employee e1 = new Employee("Naveen",27,"QA");
		Employee e2 = new Employee("Navya",32,"PO");
		Employee e3 = new Employee("Nandini",37,"Admin");
		
		ArrayList<Employee>ar3 = new ArrayList<Employee>();
		
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);
		
		//using iterator to traverse thru ar3:
		Iterator<Employee> it = ar3.iterator();
		
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.department);
		}
		
		

	}

}
