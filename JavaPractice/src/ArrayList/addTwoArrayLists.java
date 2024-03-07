package ArrayList;

import java.util.ArrayList;

public class addTwoArrayLists {
	
	public static void main(String args[]) {
		
		ArrayList<String> a = new ArrayList<>();
		a.add("Rajesh");
		a.add("Bhargav");
		a.add("Ammulu");
		a.add("Pavan");
		
		ArrayList<Integer> b = new ArrayList<>();
		b.add(10);
		b.add(25);
		b.add(36);
		b.add(77);
		
		ArrayList<Object> c = new ArrayList<>();
		c.addAll(a);
		c.addAll(b);
		
		System.out.println(c);
		
	}

}
