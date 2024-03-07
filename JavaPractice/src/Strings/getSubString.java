package Strings;

import java.util.Scanner;

public class getSubString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = "the quick brown fox is now changes to fox.";
		
		System.out.println("Enter the Substring to get: ");
		int a = scn.nextInt();
		
		System.out.println("Enter upto the String to get the value: ");
		int b = scn.nextInt();
		
		String s1 = s.substring(a, b);
		System.out.println("New String is: "+s1);
		
	}
}
