package Misc;

import java.util.Scanner;

public class StringComparision {

	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the First String: ");
		String s1 = scn.nextLine().toUpperCase();
		
		System.out.println("Enter the Second String: ");
		String s2 = scn.nextLine().toUpperCase();
		
		int S1 = s1.length(); 
		int S2 = s2.length();
		
		if(S1>S2) {
			System.out.println("String s1: "+S1 + " is larger than s2: "+S2);
			
		}
		
		else if(S1<S2){
			System.out.println("String s2: "+S2 + " is larger than s1: "+S1);
		}
		
		else {
			System.out.println("Both String are same in size");
		}
	}
}
