package Strings;

import java.util.Scanner;

public class subStringReplace {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = scn.nextLine();
		
		System.out.println("\nEnter the String to be replaced: ");
		String a = scn.next();
		
		System.out.println("\nEnter the String to replaced: ");
		String b = scn.next();
		String s1 = s.replace(a, b);
		
		System.out.println(s1);
	}
}
