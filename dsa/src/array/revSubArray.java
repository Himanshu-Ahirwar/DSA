package array;

public class revSubArray {
	    public static void reverseSubArray(int arr[], int l,int r) {
	       int start=l, end=r;
	       
	       while(start < end) {
	      
	            int temp=arr[end];
	            arr[end]=arr[start];
	            arr[start]=temp;
	          	           
	            start ++;
	            end --;
	           
	       }
	       
	    }
	
	public static void printArr(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5,6,7};
		reverseSubArray(arr,2,6);
		printArr(arr);
}
	}