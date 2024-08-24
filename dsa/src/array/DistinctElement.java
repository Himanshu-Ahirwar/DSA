package array;


public class DistinctElement {
	
	public static boolean element(int a[]) {
		
			for(int i=0 ; i<=a.length-1; i++) {
				for(int j=i+1; j<=a.length-1; j++) {
				
				
					if(a[i] == a[j]) {
						return true;
						}
				  	}
				}
					return false;
				}
	
	public static void main(String agrs[]) {
		int a[]= {1,2,3,4,5};
		System.out.print(element(a));
		
	}
			}
			 
