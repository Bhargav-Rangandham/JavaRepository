package Strings;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Sring to check: ");
		String s = scn.next();
		
		StringBuffer rev = new StringBuffer(s.length());
		
		for(int i=s.length()-1; i>=0; i--) {
			rev.append(s.charAt(i));
		}
		if(s.equalsIgnoreCase(rev.toString())) {
			System.out.println("Given String is Palindrome "+s);
		}
		else {
			System.out.println("Given string is not a palindrome "+s);
		}
	}
}
