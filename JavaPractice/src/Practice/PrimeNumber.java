package Practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the input: ");
		int n = scn.nextInt();
		int i, count;

		for(i=1;i<=n;i++) {
			count=0;
			for(int j=2; j<=i/2;j++) {
				if(i%j==0) {
					count++;
					break;

				}
			}
			if(count==0) {
				System.out.println("Given number is Prime: " +i);
			}
		}
	}
}
