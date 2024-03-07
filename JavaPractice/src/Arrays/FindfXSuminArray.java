package Arrays;

import java.util.Scanner;

public class FindfXSuminArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Num to find: ");
		int n = scn.nextInt();
		int a[] = {3,4,7,9,2,5,6};

		for(int i=0; i<a.length;i++) {//0
			for(int j=0; j<a.length-1-i; j++) {//0
				if(n==(a[j]+a[j+i])) {
					System.out.println(a[j]+" "+a[j+1]);
					
				}
			}
		}
	}
}
