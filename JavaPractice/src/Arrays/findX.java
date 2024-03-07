package Arrays;

import java.util.Scanner;

public class findX {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the num to search: ");
		int x = scn.nextInt();
		int a[] = {1,6,9,8,7,5,3,2};
		
		for(int i=0; i<a.length; i++) {//0
			if(x==a[i]) {
			System.out.println("Given " +x+ " is found in this index: " +i);
			}		
		}
	}
}
