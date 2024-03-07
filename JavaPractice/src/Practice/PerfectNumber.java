package Practice;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Input: ");
		int n = scn.nextInt();
		int i, sum=1;

		for(i=2;i<=n/2; i++) {

			if(n%i==0) 
			sum = sum+i;

		}
		if(n==sum) {
			System.out.println("Given num is Perfect num: "+n);
	}
		else 
			System.out.println("Given num is not a Perfect num: "+n);
	}
}
