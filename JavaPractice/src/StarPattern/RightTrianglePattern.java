package StarPattern;

import java.util.Scanner;

public class RightTrianglePattern {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a input: ");
		
		int n = scn.nextInt();
		
		for(int i=0; i<=n; i++) {
			
			for(int j=0; j<=i; j++) {
				
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
