package faqs99;

public class MissingNumInArray04REPAIRWRONG {

	public static void main(String[] args) {
		/**
		 * declare the array as provided 
		 * ----i) do the sequential sum of the array=>including the missing no.s
		 * ---ii) do the sum of the array no.s => arraySum
		 * --iii) now substract the arraySum from Sequential Sum
		 * the array should be in sorted ORDER
		 */ 
		
		int a[] = {1, 2, 4, 5, 6, 7, 8, 9};
		
		//finding the array sequential sum:
		int arrSeqSumAll = 0;
		for(int i=0;i<=9; i++) {
			arrSeqSumAll = arrSeqSumAll + i;
		}
		
		System.out.println(arrSeqSumAll);
		
		//finding arraySum:
		int arraySum = 0;
		for(int j=1;j<a.length;j++) {
			 arraySum = arraySum + a[j];
		}
		System.out.println(arraySum);
		
		System.out.println("missing no: "+(arrSeqSumAll- arraySum));

	}

}
