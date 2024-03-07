package Misc;

import java.util.Scanner;

public class principleInterst {
	
	
	public static void principalInterst(int principal_Amount, int time_Months, int interst_Rate) {
		
		int total_interst = (principal_Amount*time_Months*interst_Rate)/100;
		
		System.out.println("Interst amount for the given values is " +total_interst);
		
	}
	
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the principal amount: ");
		int amount = scn.nextInt();
		
		System.out.println("Enter the total months: ");
		int months = scn.nextInt();
		
		System.out.println("Enter the interst rate: ");
		int iRate = scn.nextInt();
		
		principalInterst(amount, months, iRate);
	}
}
