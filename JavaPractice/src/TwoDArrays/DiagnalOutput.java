package TwoDArrays;

public class DiagnalOutput {

	public static void main(String[] args) {

		int a[][] = {{1,2,3},
				{4,5,6},
				{7,8,9}};

		//System.out.println(a[0].length);

		//Diagonal Elements from Left
		for(int i=0; i<a.length; i++) {//0

			for(int j=a[i].length; j>=0; j--){//1

				if(i+j==a.length-1) {//+
					System.out.print(a[i][j]+" ");

				}
			}
		}

		/*
		// Diagonal Elements from Starting
		for(int i=0; i<a.length; i++) { //

			for(int j=0; j<a[i].length; j++) {//1

				if(i==j) {//0||0
					System.out.print(a[i][j]+" ");

				}
			}
		}
		 */

		/*
		//Diagonal Elements in reverse;
		for(int i=a.length-1; i>=0; i--) { //

			for(int j=a[i].length-1; j>=0; j--){//1

				if(i==j ) {//
					System.out.print(a[i][j]+" ");

				}
			}
		}
		 */		
	}
}
