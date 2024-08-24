package array;

public class subArray {
	public static void subAr(int numbers[]) {
		
		for(int i=0; i<=numbers.length-1; i++) {
			int start=i;
			for(int j=i+1; j<=numbers.length-1; j++) {
				int end=j;
				for(int k=start; k<=end; k++) {
					System.out.print(numbers[k]+" ");
				}
					
				System.out.println();
				}
			
			System.out.println();
			}
		
		}
	public static void main(String agrs[]) {
		int numbers[]= {1,2,3,4,5};
		subAr(numbers);
		
		}	
	}


