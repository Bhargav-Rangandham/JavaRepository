package patternPrograms;

import java.util.Scanner;

public class leftAngleTriangle {

	public static void main(String[] args) {
		//Scanner scn = new Scanner(System.in);
		//int n = scn.nextInt();
		int n =5;
		for(int i=0;i<n;i++) //0
		{ 
			for(int j=2*(n-i);j>=0;j--)//10 
			{
				System.out.print(" ");
			}

			for(int k=0;k<=i;k++) 
			{	
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}
}