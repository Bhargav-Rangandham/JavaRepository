package Strings;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String to reverse: ");
		String input = scn.nextLine();
		
		String rString ="";
		
		for(int i=input.length()-1; i>=0; i--) {
			
			rString = rString+input.charAt(i);
		}
		
		System.out.println(rString);
	}

}
