package array;

public class pairsArray {
	public static void Pairs(int numbers[]) {
		
		for(int i=0; i<=numbers.length-1; i++) {
			int curt=numbers[i];
			for(int j=i+1; j<=numbers.length-1 ; j++) {
				System.out.print("("+ curt + ","+ numbers[j] + ")" );
				 }
			}
		}
	public static void main(String agrs[]) {
		int numbers[]= {1,2,3,4,5};
		Pairs(numbers);
		
		}	
	}

