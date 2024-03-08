package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListtoArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of the list: ");
		int n = scn.nextInt();
		
		for(int i=0; i<n; i++) {
			int value = scn.nextInt();
			
			list.add(value);
		}
		
		list.toArray();
		
		for(int x : list) {
			System.out.print(x+" ");
		}
	}

}
