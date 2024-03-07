package Arrays;

public class CopyArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		int b[] = new int[a.length];
		
		for(int i=0; i<a.length; i++) {//0
				b[i] = a[i];
			}
		
		for(int k=0; k<b.length; k++) {
			System.out.print(b[k]+", ");
		}
	}
}
