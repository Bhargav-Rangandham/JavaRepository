package Arrays;

import java.util.Scanner;

public class sumCondition {

	public static boolean sumCheck(int x) {
		int sum=0;
		int a[] = {2,10,5,10,6,7,10};

		for(int i=0; i<a.length; i++) {
			if(a[i]==10) {
				sum = sum+a[i];
			}
		}

		if(x==sum) {
			System.out.println(x+" "+sum);
			return true;
		}

		return false;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		int x= scn.nextInt();
		
		if(sumCheck(x)) {
			System.out.println("Sum is correct");
		}
		else {
			System.out.println("Sum is not equal");
		}

	}
}
