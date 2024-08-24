package Strings;

public class Palindrome {
	public static boolean palindrome(String a) {
		int n=a.length();
		for(int i=0; i<a.length()/2; i++) {
			if(a.charAt(i) != a.charAt(n-1-i)){
				return false;
			}
		}
		return true;
	}
    public static void main(String agrs[]) {
    	String a = "racecar";
    	System.out.println(palindrome(a));
    	
}
		}
