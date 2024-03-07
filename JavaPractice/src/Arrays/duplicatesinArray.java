package Arrays;

public class duplicatesinArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,1,2,3,4};
		int b[] = new int[a.length];
		int count=0;
		
		for(int i=0; i<a.length;i++) { //

			for(int j=i+1; j<a.length; j++) {//
				
				if(a[i]==a[j]) {
					b[count++]=a[i];

				}
			}
		}
		for(int k=0; k<count; k++) {
			System.out.print(b[k]+" ");
		}
	}
}
