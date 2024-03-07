package Arrays;

import java.util.Arrays;

public class NumericArraySorting {

	public static void main(String[] args) {
		int a[] = {9, 3, 7, 6, 2, 1, 0, 4, 5};
		
		System.out.println("Method 1");
		int temp=0;
		//Method 1
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-i-1; j++) {
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
			}
		}
	
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\n\nMethod 2");
		
		//Method 2
		Arrays.sort(a);
		System.out.print(Arrays.toString(a));
		
		
	}
}
