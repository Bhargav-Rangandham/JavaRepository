package Misc;

import java.util.Scanner;

public class VowelorConsonent {

	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a char to check: ");
		char ch = scn.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			
			System.out.println("Given character is a Vowel " +ch);
			
		}
		else {
			System.out.println("Given character is a consonent " +ch);
		}
	}
}
