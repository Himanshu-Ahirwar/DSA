package array;

public class MaxArray {
	
	int  maxAr(int a[]) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int curr=0;
		
		for(int i=0; i<a.length; i++) {
			curr=a[i];
			//MAXIMUM
			if(curr > max) {
				max=curr;
			}
			//MINIMUM
			if(curr < min ) {
				min=curr;
			}
		}
		return max-min;
	}
	 public static void main(String args[]) {
		 int a[]= {1,3,5,6,4};
		 MaxArray obj=new MaxArray();
		 System.out.println(obj.maxAr(a));
		 
	 }

}
