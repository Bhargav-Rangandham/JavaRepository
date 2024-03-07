package Arrays;

public class SumOfArraus {

	public static void main(String[] args) {
		
		int a[] = {0,2,3,4,5,6,7,9};//
		int sum=0;
		
		for(int i=0; i<a.length; i++) {
			sum= sum+a[i];
		}
		System.out.println("Total Sum of given array is: " +sum);
		
	}
}
