package dec2023javapracticals;

import java.util.ArrayList;

public class ArrayListConcept10 {

	public static void main(String[] args) {
		//ArrayList -- class: default : Dynamic Array
		
		//create the object of ArrayList: new keyword
		
		ArrayList ar = new ArrayList();
		ar.add(100);//0
		ar.add(200);//1
		
		System.out.println(ar.size());//2
		
		ar.add(300);
		ar.add(400);
		
		System.out.println(ar.size());//4
		
		ar.add(500);
		ar.add(600);
		
		System.out.println(ar.size());//6
		System.out.println(ar);
		
		ar.remove(5);
		
		System.out.println(ar.size());//5
		System.out.println(ar);
		
		ar.remove(0);
		System.out.println(ar.size());//5
		System.out.println(ar);
		
		ar.add(300);
		System.out.println(ar);
		
		ar.add(12.33);
		ar.add(true);
		ar.add('c');
		ar.add("BinAuto");
		
		System.out.println(ar);
		
		//markslist --> Generic: int | Integer
		//Generics cannot be the primitive data type
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(100);
		//marksList.add(12.33);//errs as the generic is diff
		
        //empNames: -- generic: String
		ArrayList<String> empNamesList = new ArrayList<String>();
		empNamesList.add("Naveen");
		empNamesList.add("Tom");
		empNamesList.add("Rahul");
		
		//emp info: name, age, salary, isActive, gender
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
		empDataList.add("Rahul");
		
		ArrayList list = new ArrayList(5);//if nothing is written inside ()
		//the vc = 10-if explicitly some value is there then vc=5
		//0 1 2 3 4
		//vc=0, pc=5
		//pc/2=5/2=2
		//vc=2
		
		
				
		
	}

}
