package pattern;

public class palindromicPatternWithNum {
public void diam(int n) {
		
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=(n-i) ; j++) {
				System.out.print(" ");	
				}
			//Descending
			for(int j=i; j>=1; j--) {
				System.out.print(j);		
				}
			//Ascending
			for(int j=2; j<=i; j++) {
				System.out.print(j);		
				}
			  
			
			System.out.println(" ");	
				}
		 	
	}
	   	public static void main(String args[]) {
	   		palindromicPatternWithNum bt=new palindromicPatternWithNum();
	   		bt.diam(4);
	   	
	   	}
}
