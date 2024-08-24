package array;

public class maxSumOfSubArray {
	
	public static void maxSum(int num[]) {
		int currentSum=0,maxSum=Integer.MIN_VALUE;
		for(int i=0; i<num.length; i++) {
			for(int j=i; j<num.length; j++) {
				currentSum=0;
				for(int k=i; k<=j; k++) {
					currentSum += num[k];
				}
				System.out.println(currentSum);	
				if(currentSum > maxSum) {
						maxSum=currentSum;
				}
			}
		}
		System.out.print("Max Sum : " + maxSum);
		
}
	static void Kadanes(int num[]) {
		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;
		for(int i=0; i<num.length; i++) {
			currSum = currSum + num[i];
			//ms = Math.max(currSum,maxSum)
			if(currSum > maxSum) {
				maxSum=currSum;
			}
			if(maxSum < 0) {
				currSum=0;
			}
			
		}
		System.out.print("Max Sum : " + maxSum);
	}
	public static void main(String agrs[]) {
		int num[]= {1,2,3};
		Kadanes(num);
	}
}
