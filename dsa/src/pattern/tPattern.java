package pattern;

public class tPattern {
public void diam(int n) {
		int mid=n/2;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n ; j++) {
			if(i==1 || j==mid) {
				System.out.print("*");	
				}
			 else {
				System.out.print(" ");	
			 }
			}
			System.out.println();			
			}
}
	   	public static void main(String args[]) {
	   		tPattern bt=new tPattern();
	   		bt.diam(9);
	   	}


}
