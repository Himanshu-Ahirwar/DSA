package Sorting;

public class selectionSort {
	public static void Sort(int a[]) {
		
		for(int turn=0 ; turn<a.length-1; turn++) {
			int minPos = turn;
			for(int j=turn+1; j<a.length; j++) {
				if(a[minPos] > a[j] ) {
					minPos = j;		
			  	}
		    }
			int temp=a[minPos];
			a[minPos]=a[turn];
			a[turn]=temp;
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
		 




