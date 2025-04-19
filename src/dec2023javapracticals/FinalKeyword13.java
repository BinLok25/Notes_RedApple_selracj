package dec2023javapracticals;

public class FinalKeyword13 {
     int i=20; //class var --can be static, final as well
     
//     static final int num = 20;
     final int num = 20;
	public static void main(String[] args) {
		
		final int i = 10; //local var--cannot be static -- can be final
		
		System.out.println(i);
		
//		System.out.println(num);
		
		FinalKeyword13 obj = new FinalKeyword13();
        System.out.println(obj.num);
        
        //constant vars:
        final int DAYS_IN_WEEK = 7;
        
//        DAYS_IN_WEEK = 10;
        
        int salary = 100 * DAYS_IN_WEEK;
        System.out.println(salary);
		
		

	}
	public void test() {
		// TODO Auto-generated method stub
		
	}

}
