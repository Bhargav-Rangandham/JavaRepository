package Arrays;

import java.util.Scanner;

public class FindArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number to search: ");

		int array[] = {7, 11, 21, 26, 99, 66, 72};

		int x = scn.nextInt();
		for(int i=0; i<array.length; i++) {

			if(x == array[i]) {
				System.out.println("Index value of "+x+ " is: " +i);
				break;
			}
		}
	}
}
