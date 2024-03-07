package Misc;

import java.util.Scanner;

public class SumOfNumbers {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int sum=0;
		for(int i=0; i<=10; i++) {
			sum = sum+i;
		}
		System.out.println("Total Sum of numbers: "+sum);
		
		
	}

}
