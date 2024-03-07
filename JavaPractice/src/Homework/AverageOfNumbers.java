package Homework;

import java.util.Scanner;

public class AverageOfNumbers {
	
	public static float NumbersAverage(int a, int b) {
		
		float avg = (a+b)/2;
		System.out.println(avg);
		return avg;

	}
	
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		AverageOfNumbers avn = new AverageOfNumbers();
		avn.NumbersAverage(a, b);
		
	}

}
