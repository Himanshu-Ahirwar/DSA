package Strings;

public class ShortestPath {
	
	public static float path(String a) {
		int x=0,y=0;
		for(int i=0; i<a.length(); i++) {
			char str=a.charAt(i);
			if(str == 'N') {
				y++;
			}
			else if(str == 'S') {
				y--;			
			}
			else if(str == 'W') {
				x--;
			}
			else {
				x++;
			}
	}
		int X = x*x;
		int Y = y*y;
		return (float)Math.sqrt(X + Y);
	}
	
    public static void main(String agrs[]) {
    	String a = "uo";
    	System.out.println(path(a));
    	
}
		}



