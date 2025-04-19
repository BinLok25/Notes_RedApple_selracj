package faqs99;

public class MissingNumInArray4 {

	public static void main(String[] args) {
		
		/*
		 * applying simple mathematics: add all no.s of array sequentially
		 * --with the missing num as well
		 * 
		 * then add no.s in the given array
		 * 
		 * substract from the bigger num
		 */
		
		int a[] = {1,2,3,4,5,6,8,9};
		
		int seqSumAll = 0;
		for(int j=1;j<=9;j++) {
			seqSumAll = seqSumAll + j;
		}
		System.out.println(seqSumAll);
		
		int arraySum = 0;
		for(int i=0;i<=a.length-1;i++) {
			arraySum = arraySum + a[i];
		}
        System.out.println(arraySum);
        
        System.out.println("Missing num: "+(seqSumAll-arraySum));
	}

}
