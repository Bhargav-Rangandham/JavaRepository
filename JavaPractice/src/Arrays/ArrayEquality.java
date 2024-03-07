package Arrays;

import java.util.Arrays;

public class ArrayEquality {

	public static void main(String[] args) {
		int a[] = {1,5,7,2,3};
		int b[] = {1,5,7,2,4};
		
		//Method 1
		/*
		if(a.length==b.length) {
			boolean arrayequals = true;
			for(int i=0; i<a.length;i++) {
				if(a[i]!=b[i]) {
					arrayequals = false;
					break;
				}
			}
			if(arrayequals) {
				System.out.println("Both the array are equal!");
			}
			else {
				System.out.println("Both the arrays are not equal!");
			}


		}

		else {
			System.out.println("Both the arrays are not equal in size");
		}
		*/
		
		//Method 2
		System.out.println(Arrays.equals(a, b));
	}
}
