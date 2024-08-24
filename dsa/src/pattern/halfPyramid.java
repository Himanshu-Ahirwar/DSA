package pattern;

public class halfPyramid {
	public static void main(String agrs[]) {
		char ch= 'A';
		for(int i=1; i<=4 ; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
				ch++;
				}
			
			System.out.println(" ");

		}
	}
}
