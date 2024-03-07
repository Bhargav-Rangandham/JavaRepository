package HashSet;

import java.util.HashSet;

public class HashSetMethods {

	public static void main(String[] args) {
		
		//HasShet does not allow duplicates values.
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> set1 = new HashSet<>();
		
		//To add the values
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(3);
		set.add(5);
		System.out.println("Values of set1 is: "+set);
		
		//To Clone/Copy values to another Set
		set1 = (HashSet<Integer>) set.clone();
		System.out.println("Values of set1 is: "+ set1);
		
		//To Compare two Hashsets
		for(int i : set) {
			System.out.println("Compare two sets: "+set1.contains(i));
		}
		//To Remove particular value using index.
		set.remove(3);
		System.out.println(set);
		
		//To Remove all the values from the set.
		set.removeAll(set);
		System.out.println(set);
	}
}
