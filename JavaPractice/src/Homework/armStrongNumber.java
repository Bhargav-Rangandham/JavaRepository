package Homework;

import java.util.Scanner;

public class armStrongNumber {

	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scn.nextInt();
		int n=num;
		double sum=0;
		
		while(num!=0) {
			
			int rem = num%10;
			sum= sum+Math.pow(rem, 3);
			num=num/10;
			
		}
		if(sum==n) {
			System.out.println("Given Num is Armstrong: "+sum);
		}
		
		else {
			System.out.println("Given num is not Armstrong");
		}
	}
}
