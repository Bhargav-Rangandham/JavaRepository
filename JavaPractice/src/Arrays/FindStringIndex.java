package Arrays;

import java.util.Scanner;

public class FindStringIndex {
	
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		//System.out.println("Enter the size of the array: ");
		//int size = scn.nextInt();
		
		String Dogs[] = {"Jack", "Browsey", "Trixy", "Ben", "Pepper"};
//		for(int i=0; i<size; i++) {
//			
//			System.out.println("Enter the dog names: ");
//			Dogs[i] = scn.next();
//			
//			System.out.println("Dogs names are: " +Dogs[i]);
//		}
		
		for(int j=0;j<Dogs.length; j++) {
			
			if(Dogs[j].equalsIgnoreCase("pepper")) {
				
				System.out.println("Dog name is "+Dogs[j] +" is present at index " +j);
			}
			}		
	}
}
