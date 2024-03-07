package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateanArraylist {
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the array list size: ");
		int size = scn.nextInt();
		
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println("Enter the colors into the array list: ");
		for(int i=0; i<size; i++) {
			String color = scn.next();
			al.add(color);
		}
		System.out.println(al);
		
		//To Insert the new values into the object.
		al.add(0, "purple");
		
		System.out.println(al);
		
		//iterating through the values and print the values based on Index
		for(String values: al) {
			System.out.println(values);
		}
		
		
	}

}
