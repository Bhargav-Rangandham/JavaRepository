package Homework;

import java.util.Scanner;

public class greatestofTwo {

	public static void GreatestOfTwo(int a, int b) {
		
		if(a>b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
		return;
	}
	
	
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		greatestofTwo gt = new greatestofTwo();
		gt.GreatestOfTwo(a, b);
	}
}
