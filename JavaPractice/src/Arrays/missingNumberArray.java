package Arrays;

public class missingNumberArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,5,6,7,8,9};
		int n = a.length+1;
		//System.out.println(n);
		int sum=(n*(n+1))/2; //
		
		for(int i=0; i<a.length; i++) {	
			sum = sum-a[i];
		}
		System.out.println(sum);
	}
}
