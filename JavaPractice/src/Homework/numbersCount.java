package Homework;

import java.util.Scanner;

public class numbersCount {

	public static void DigitCounter(int size, int arr[]) {
		int zerocount=0; int postivecount=0; int negativeCount=0;
		
		for(int i=0; i<size; i++) {
			
		if(arr[i]==0) {
			zerocount =+1;
		}
		else if(arr[i]<0){
			negativeCount =+1;
		}
		else if(arr[i]>1) {
			postivecount =+1;
		}
	}
	System.out.println("Zero digitas count is "+zerocount +"\n Negative digits count is "+negativeCount +"\n Positive digits count is " +postivecount);		
}
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		numbersCount nc = new numbersCount();
		int arr[] = new int[size];
		
		for(int i=0; i<size; i++) {
	
			arr[i] = scn.nextInt();
		}
		nc.DigitCounter(size, arr);
	}
	
}
