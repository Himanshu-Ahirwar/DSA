package Sorting; //O(n^2)

public class bubbleSort {
	public static void Sort(int a[]) {
		int temp=0;
		for(int turn=0 ; turn<a.length-1; turn++) {
			for(int j=0; j<a.length-1-turn; j++) {
			
				if(a[j] > a[j+1]) {
					
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
					}
			  	}	
		    }
	}
	public static void printArr(int a[]) {
	for(int i=0; i<a.length; i++) {
		System.out.print(" "+ a[i]);
	}
	}

	public static void main(String agrs[]) {
		int a[]= {1,199,7,4,5};
		Sort(a);
		printArr(a);
	
		}
	}
		 


