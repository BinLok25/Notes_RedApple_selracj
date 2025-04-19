package dec2023javapracticals;

public class ForEachAdvancedLoop09 {

	public static void main(String[] args) {
		//for each: is not an index based loop
		
		int i[] = {10,20,30,40,10,1};
		
		//index based loop:
		for(int k=0; k<=i.length-1;k++) {
			System.out.println(i[k]);
		}
		
		System.out.println("---all using for each----");
		
		//for each:
		for(int naveen: i) {//no need to write i[]--java already understands
			System.out.println(naveen);
		}
		System.out.println("-----double array-------");
		//double array:
		double d[] = {1.1, 3.4, 9.8, 12.33};
		for(double e:d) {
			System.out.println(e);
		}
		System.out.println("-----String array-------");
		//String array:
		String product[] = {"macbook", "imac", "cannon"};
		for(String s:product) {
			System.out.println(s);
			break; //to print first ele and just come out of loop
		}
		System.out.println("------Object array------");
		//Object array:
		Object data[] = {"Nakul", 30, 12.33, 'm', false};
		for(Object e: data) {
			System.out.println(e);
		}
		//
		int num[] = {10, 20, 30, 40, 1};
		//0-10
		//1-20
		
		System.out.println("---for each with an extraa var to print index--");
		int count = 0;
		for(int e:num) {
			System.out.println(count+"-"+e);//0-10
			count++;
		}
		
		//printing in reverse:using for each is a complex program-NOT SIMPLE
		//for loop is good to print in reverse
		System.out.println("----short dataType array---");
		short sh[] = {100,200,322,344};
		for(short e:sh) {
			System.out.println(e);
		}

	}

}
