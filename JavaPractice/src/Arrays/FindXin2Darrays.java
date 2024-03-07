package Arrays;

import java.util.Scanner;

public class FindXin2Darrays {

	public static void main(String args[]) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the Rows size: ");
		int rows = scn.nextInt();

		System.out.println("Enter the coloum size: ");
		int cols = scn.nextInt();

		int matrix[][] = new int[rows][cols];
		
		// This loop is to get the Matrix input values from user
		for(int i=0; i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix[i][j] = scn.nextInt();

			}
		}

		// This loop is to get the display the output values from matrix
		for(int i=0; i<rows;i++) {
			for (int j=0;j<cols;j++) {

				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}

		System.out.println("Enter a number to find in the Matrix: ");
		int x = scn.nextInt();

		for(int i=0; i<rows;i++) {
			for(int j=0;j<cols;j++) {

				if(matrix[i][j]==x) {
					System.out.println("Given "+x +" is present in ("+i+ ", "+j+ ")");
					break;

				}
			}			
		}
	}
}