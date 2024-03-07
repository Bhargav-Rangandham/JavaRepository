package Practice;

import java.util.Scanner;

public class NumberReverse {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a input: ");
		
		int n = scn.nextInt();
		
		int i, rev=0;
		while(n!=0) {
			
			rev = rev*10+(n%10);
			n=n/10;
			
		}
		System.out.println(rev);
	}

}
