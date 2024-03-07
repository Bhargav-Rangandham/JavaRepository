package Strings;

import java.util.Scanner;

public class LastIndexOfString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = scn.nextLine();
		
		String s1[] = s.split("\\s");
		int size = s.length();
		
		for(String s2: s1) {
			
			System.out.println("Last Index " +s2+ " is: " +(s2.length()-1));
		}
	}
}
