package Strings;

import java.util.Scanner;

public class Strings {

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String: ");
		
		String s = scn.nextLine();
		
		// replace() function
		String s1 = s.replace(" is", " is Not");
		System.out.println(s1);
		
		//chartAt() function
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a') {
				System.out.println("char is present in string "+i );
			}
		}
			System.out.println("given char is not found");
	}
}
