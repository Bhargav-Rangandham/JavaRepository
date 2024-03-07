package gamePrograms;

import java.util.Scanner;

public class Numberguessing {

	public static void main(String[] args) {


		int MagicNum = 7, count=4;

		Scanner scn = new Scanner(System.in);
		
		if(count>=0 && count<=4) {
			
			for(int i=0; i<=count; i++) {
				System.out.println("Guess a number from 0-9: ");
				int guess = scn.nextInt(); 
			
				if(guess==MagicNum) {
					System.out.println("Your guess is Right :)");
					break;
				}
				else {
					System.out.println("Your guess is Wrong:(");
					System.out.println("Try Again!!!");
					count--;
					
				}
			}
		}
		else {
				System.out.println("You have reached the trail count!!!");
		}
	}	
}
