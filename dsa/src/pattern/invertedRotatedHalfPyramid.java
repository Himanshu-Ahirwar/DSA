package pattern;

public class invertedRotatedHalfPyramid {
	public static void main(String agrs[]) {
		//int n=4;
		for(int i=1; i<=4 ; i++) {
			for(int j=1; j<=4-i; j++) {
				System.out.print(" ");	
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");	
			}
			//n--;
			System.out.println(" ");

			}
		}
	}
