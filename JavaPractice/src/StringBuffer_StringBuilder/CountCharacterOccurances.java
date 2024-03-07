package StringBuffer_StringBuilder;

import java.util.Scanner;

public class CountCharacterOccurances {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = scn.nextLine();
		StringBuffer sb = new StringBuffer(s);
		int count =0;
		char ch = 'a';
		
		for(int i=0; i<sb.length(); i++) {
			if(sb.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("Count of a given char is: "+count);
	}
}
