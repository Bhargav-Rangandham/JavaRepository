package TwoDArrays;

import java.util.Scanner;

public class TwoDArrayDemo {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of rows: ");
		int rows = scn.nextInt();
		
		System.out.println("Enter the size of cols: ");
		int cols = scn.nextInt();
		
		int a[][] = new int[rows][cols];
		int sum = 0;
		System.out.println("Enter the values in the array: ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				a[i][j] = scn.nextInt();
			}
		}
		
		for(int i=0; i<rows;i++) {
			for (int j=0; j<cols; j++) {
				System.out.print(a[i][j]+" ");
				
				sum = sum+a[i][j];
			}
			System.out.println(sum);
			System.out.println();
		}
				
		}
}
