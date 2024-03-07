package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListMethods {

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of an Array List: ");
		int size = scn.nextInt();
		
		//To Store any kind of values(hetrogeniuos values)
		//ArrayList al = new ArrayList();
		
		// To Store only Specific data type values
		ArrayList<Integer> al = new ArrayList();
		
		System.out.println("Enter the values to ArrayList: ");
		for(int i=0; i<size; i++) {
			int values = scn.nextInt();
			al.add(values);
		}
		//To get all the values in the array
			System.out.println(al);
			
		// to get the specific values from the list.
			System.out.println(al.get(2));
			
		// to remove the specific value from the list.
			al.remove(4);
			System.out.println(al);
			
		// to add value to the specific index.
			al.add(5, 77);
			System.out.println(al);
			
		// to set/update the existing value to the specific index.
			al.set(3, 50);
			System.out.println(al);
		
		// to check whether a specific values is there or not?
			System.out.println(al.contains(3));
			
		//to the Sort the values in the array list we can use the Collections here.
			
			Collections.sort(al);
			System.out.println(al);
		
		// to shuffle the existing order of array list
			Collections.shuffle(al);
			System.out.println(al);
			
		// To check whether the array list is Empty
			System.out.println(al.isEmpty());
	}
}
