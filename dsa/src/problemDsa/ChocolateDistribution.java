package problemDsa;

public class ChocolateDistribution {
	
	public static int[] choco(int num[]) {
		int min=Integer.MAX_VALUE;

		for(int i=0; i<num.length-1; i++) {
			int k=num[i];
			for(int j=0; j<num.length-1-i; j++ ) {
				if(num[j] < min) {
					min=num[j];
				}
			}
			int temp=min;
			min=k;
			k=temp;
		}
		return num;
	}
	public static void main(String agrs[]) {
		int num[]= {1,2,7,4,3};
        choco(num);
        for(int i=0; i<num.length; i++) {
        	System.out.print(num[i]);
        }
		}
	}


