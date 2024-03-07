package Arrays;
import java.util.Scanner;

public class PairSumInArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the num to check: ");
		int n = scn.nextInt();

		int a[] = {2, 3, 4, 5, 6, 7, 8, 9};
		boolean pairFound = false;

		for (int i = 0; i < a.length - 1; i++) {//2
			for(int j=i+1; j<a.length;j++) {//3
				int sum = a[i] + a[j];
				if (sum==n) {
					System.out.println("Pair with the given sum: " + a[i] + " " + a[j]);
					pairFound = true;
				}
			}
		}

		if (!pairFound) {
			System.out.println("No pairs found with the given sum.");
		}
	}
}