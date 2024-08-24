package array;

public class binarySearch {
	
	public static int biSearch(int numbers[],int key) {
		
		int Start = 0 , End = numbers.length - 1;
	
		while(Start <= End) {
			
			int mid = (Start + End)/2;
					
			if(numbers[mid] == key) {
				return mid;
			}
			if(numbers[mid] < key) {
				Start = mid + 1;
			}
			else {
				End = mid - 1;
		} 
		
	}
		return -1;

}
	public static void main(String args[]) {
		int numbers[] = {2,3,4,5,6,7,9};
		int key = 3;
		System.out.println("element found at index " + biSearch(numbers, key) );
	}
}
