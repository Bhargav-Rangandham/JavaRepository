package Sorting;

public class BubbleSorting {
	
	public static void main(String args[]) {
		
		int number[] = {9, 6, 8, 2, 5, 3};
		
		//Bubble Sorting
		for(int i=0; i<number.length-1; i++) {
			for(int j=0; j<number.length-i-1;j++) {
			
				if(number[j]>number[j+1]) {
					int temp = number[j];
					number[j]=number[j+1];
					number[j+1] = temp;
				}
				
			}	
		}
		for(int i=0; i<number.length;i++) {
			System.out.print(number[i]+ " ");
		}
		
	}
}
