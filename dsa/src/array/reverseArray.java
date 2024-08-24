package array;

public class reverseArray {
	
	public static void ReverseAr(int Num[]) {
		int start=0;
		int end = Num.length-1;
		while(start < end) {
			
			int temp=Num[end];
			Num[end]=Num[start];
			Num[start]=temp;
			
			start++;
			end--;
			
		}
	}
    // METHOHD 2
	public static void rev(int Num[]) {
		
		for(int i=Num.length-1; i>=0; i--) {
			System.out.print(Num[i]);
			
		}
	}
	public static void main(String args[]) {
		int Num[]= {1,2,3,4,5};
		rev(Num);
	
	//	for(int i=0; i<=Num.length; i++) {
		//	System.out.print(Num[i]+" ");
		
	}
}
