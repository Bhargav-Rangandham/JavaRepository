package Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		int a[] = {0,1,0,2,0,3,4,0,5,0,6};
		int nonZeroindex=0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]!=0) {
				a[nonZeroindex] = a[i];
				nonZeroindex++;
			}
		}
		
		for(int j=nonZeroindex; j<a.length; j++) {
			a[j]=0;
		}
		
		for(int k=0; k<a.length; k++) {
			System.out.print(a[k]+" ");
		}
		
	}
}
