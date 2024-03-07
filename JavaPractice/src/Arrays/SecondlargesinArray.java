package Arrays;

public class SecondlargesinArray {

	public static void main(String[] args) {
		int a[] = {10,23,56,78,91,20,14,97};
		int temp=0;
		for(int i=0; i<a.length; i++) {//
			for(int j=0; j<a.length-i-1; j++) {//0<10
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j] = a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("Second LargestNum is: " +a[a.length-2]);
		System.out.println("Second Minimum num is: "+a[1]);
	}
}
