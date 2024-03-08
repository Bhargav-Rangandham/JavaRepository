package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class subListofArrayList {
	
	public static void main(String argsa[]) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = scn.nextInt();
		
		System.out.println("Enter the values to the list: ");
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0; i<size; i++) {
			
			int values = scn.nextInt();
			al.add(values);
		}
		System.out.println(al);
		
		List<Integer> sub_array = al.subList(0, 4);
		
		System.out.println(sub_array);
		
	}
}




