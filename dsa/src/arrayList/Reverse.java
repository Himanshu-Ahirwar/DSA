package arrayList;

import java.util.ArrayList;
public class Reverse {
	
	public void Rev(ArrayList<Integer> arr) {
		
		for(int i=arr.size()-1; i>=0; i--) {
			System.out.print(" " + arr.get(i) );
		}
	}
	public static void main(String args[]) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(2);
		arr.add(3);
		arr.add(4);
		Reverse obj= new Reverse();
		obj.Rev(arr);
	}
}
