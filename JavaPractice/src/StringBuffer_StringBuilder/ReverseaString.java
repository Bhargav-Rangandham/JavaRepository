package StringBuffer_StringBuilder;

import java.util.Scanner;

public class ReverseaString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the String to Reverse: ");
		String s = scn.nextLine();
		
		//Using String Buffer Concept
		StringBuffer sb = new StringBuffer(s);
		
		StringBuffer reverse = sb.reverse();
		
		System.out.println("\nReverse String using 'String Buffer' is: "+reverse);
		
		//Using StringBuilder Concept
		
		StringBuilder sb1 = new StringBuilder(s);
		StringBuilder reverse1 = sb1.reverse();
		
		System.out.println("\nReverse String using 'String Builder' is: "+reverse1);
		
		
		//Concat Two Strings 
		String s1 ="This is";
		String s2 = "Bhargav!";
		
		StringBuffer concat = new StringBuffer();
		
		concat.append(s1).append(" ").append(s2);
		
		System.out.println("\nConcat String is: "+concat);
		
		
		
		
	}
}
