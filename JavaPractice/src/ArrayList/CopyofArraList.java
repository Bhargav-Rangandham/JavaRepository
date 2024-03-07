package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class CopyofArraList {

	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in); 
		System.out.println("Enter the size of an array: ");
		int size = scn.nextInt();
		
		ArrayList<String> al = new ArrayList<String>();
		
		for(int i=0; i<=size; i++) {
			
			String values  = scn.next();
			al.add(values);
		}
		
		System.out.println(al);
		
		ArrayList<String> al_dup = new ArrayList<>();
			
			al_dup.addAll(al);
	
		System.out.println(al_dup);
	}
}
