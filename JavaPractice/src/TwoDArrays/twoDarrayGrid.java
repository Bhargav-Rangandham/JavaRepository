package TwoDArrays;

import java.util.Scanner;

public class twoDarrayGrid {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of rows: ");
		int rows= scn.nextInt();
		System.out.println("Enter the size of cols: ");
		int cols= scn.nextInt();
		
		for(int i=0; i<rows; i++) {//0<5
			
			for(int j=0; j<cols; j++) {//5<5
				System.out.print("- ");
			}
			System.out.println();
		}
	}
}
