package Misc;

import java.util.Scanner;

public class WeightConverter {

	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter your weight: ");
		int weight = scn.nextInt();
		String type1 = "K"; 
		String type2 = "L";
		System.out.println("(K)gs? or (L)bs? ");
		String type = scn.next();
		
		if(type1.equals(type)) {
			
			weight = (int) (weight*0.45);
			System.out.println("Your weight in lbs is: " +weight);
		}
		
		else if(type2.equals(type)) {
			
			weight = (int) (weight/0.45);
			System.out.println("Your weight in kgs is: "+weight);
		}
		
		else {
			System.out.println(" Enter correct type in 'K' or 'L' ");
		}
	}

}
