package Numbers;

import java.util.Scanner;

public class palindromeNum {

	public static void main(String args[]) {
		//Scanner scn = new Scanner(System.in);
		//System.out.println("Enter a number to check: ");
		int num = 454;
		int n=num;
		int rev=0; int rem=0;
		
		while(num!=0) {
			rem = num%10;//
			rev = (rev*10)+rem;//
			num=num/10;
		}
		System.out.println(rev+" "+n);
		if(rev==n) {
			System.out.println("Given Num is a palidrome: "+n);
		}
		else {
			System.out.println("Given num is not a palindrome: "+n);
		}
		
	}
}
