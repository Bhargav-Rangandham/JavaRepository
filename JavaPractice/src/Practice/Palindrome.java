package Practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter an Input: ");
		int num = scn.nextInt();
		
		int i, rev=0;
		int t = num;
		
		while(num!=0) {
			
			rev = rev*10+(num%10);
			num=num/10;
			
		}
		if(rev==t) {
			
			System.out.println("Given num is Palindrome: " +t);
			
		}
		else {
			System.out.println("Given num is not a Palindrome: " +t);
		}
	}
}
