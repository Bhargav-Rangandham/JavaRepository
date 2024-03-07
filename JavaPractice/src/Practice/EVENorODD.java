package Practice;

import java.util.Scanner;

public class EVENorODD {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Input: ");
		int n = scn.nextInt();
		
		if(n%2==0) {
			
			System.out.println("Given num is Even: " +n);
		}
		else {
			System.out.println("Given num is Odd: " +n);
		}
	}

}
