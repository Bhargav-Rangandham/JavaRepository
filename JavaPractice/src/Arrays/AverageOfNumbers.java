package Arrays;

public class AverageOfNumbers {

	public static void main(String[] args) {
		int a[] = { 1,9,8,6,5,7,3,2,4};//45
		int n = a.length;
		int sum=0;
		
		for(int i=0; i<n; i++) {
			sum = sum+a[i];
		}
		int average = sum/n;
		System.out.println("Average of the array is: " +average);
		
	}
}
