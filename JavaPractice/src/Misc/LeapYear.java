package Misc;

import java.util.Scanner;

public class LeapYear {

	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the Year to check in format(YYYY): ");
		int year = scn.nextInt();
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			
			System.out.println("Given year is a Leap Year: " +year);
			
		}
		else {
			System.out.println("Given year is not a Leap Year: "+year);
		}
		
		
	}
}
