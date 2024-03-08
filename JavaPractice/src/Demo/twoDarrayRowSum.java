package Demo;

public class twoDarrayRowSum {

	public static void main(String[] args) {
	
		//int a[] = {1,2,3};
		int ar[][] = {{1,2,3}, {4,5,6}, {7,8,9}};	
		int rows= ar.length;
		int cols = ar[0].length;
		System.out.println(rows+" "+cols); 
		
		for(int i=0; i<rows; i++) {//0
			int rowSum =0;
			for(int j=0; j<cols; j++) {//1<3	
				rowSum=rowSum+ar[i][j];// 6
			}
			System.out.println(rowSum);
		}
	}

}
