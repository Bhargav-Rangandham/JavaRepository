package Sorting;

public class SelectionSorting {
	
	public static void main(String args[]) {
		
		int numbers[] = {8, 9, 2, 6, 1,4};
		
		for(int i=0; i<numbers.length-1;i++) {//0
			int smallest =i;
			for(int j=i+1; j<numbers.length;j++) {//2
				
				if(numbers[smallest]>numbers[j]) {
					
					smallest=j;
				}
			}
			int temp = numbers[smallest];
			numbers[smallest]=numbers[i];
			numbers[i]=temp;
		}
		
		for(int k=0;k<numbers.length;k++) {
			System.out.print(numbers[k]+" ");
		}
	}
	
	

}
