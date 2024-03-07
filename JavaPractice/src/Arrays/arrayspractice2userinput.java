package Arrays;

import java.util.Scanner;

public class arrayspractice2userinput {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the array size: ");
		int size = scn.nextInt();
		
		int array[] = new int[size];
		
		for(int i=0; i<size; i++) {
			
			System.out.println("Enter the value to be placed in the array:");
			array[i] = scn.nextInt();
			
			
		}
		
		System.out.println(array[0] +" " + array[1] + " "+ array[2]);
	}
}
