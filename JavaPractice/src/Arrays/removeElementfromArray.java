package Arrays;

public class removeElementfromArray {

	public static void main(String[] args) {//This we need to work!
		int a[] = {2,4,6,5,8,9,3};
		//a.toString();
		int x=9;
		int removeindex = -1;
		for(int i=0; i<a.length; i++) {
			if(x==a[i]) {
				removeindex = i;
				break;
			}
		}

		if(removeindex!=-1) {
			for(int j=removeindex; j<a.length-1; j++) {
				a[j] = a[j+1]; 
			}

		}
		
		for(int i=0; i<a.length-1; i++) {
			System.out.print(a[i]+" ");
			
		}
	}
}
