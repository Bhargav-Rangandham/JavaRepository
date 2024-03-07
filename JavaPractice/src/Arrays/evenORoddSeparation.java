package Arrays;

public class evenORoddSeparation {

	public static void main(String[] args) {
		int a[] = {2,3,4,5,6,7,1};
		int evenvalues=0;
		int oddvalues=0;
		
		for(int i=0; i<a.length; i++) {
			if((a[i]%2==0)) {
				a[evenvalues] = a[i];
				evenvalues++;
			}
		}
		
		for(int i=0; i<a.length; i++) {
			
			if((a[i]%2!=0)) {
				a[evenvalues+oddvalues] = a[i];
				oddvalues++;
			}
		}
		
		for(int i=evenvalues; i<evenvalues+oddvalues; i++) {
			a[i] = a[i-evenvalues];
		}
		for(int k=0; k<a.length; k++) {
			System.out.print(a[k]+" ");
		}
}
}
