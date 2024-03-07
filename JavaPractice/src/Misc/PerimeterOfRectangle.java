package Misc;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void Rectangle_Perimeter(double height, double breadth) {
		
		double perimeter = 2*(height+breadth);
		
		System.out.println("Perimeter of given rectangle is: "+perimeter);
	}
	
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the Heigh of the rectangle: ");
		double Rheight = scn.nextDouble();
		
		System.out.println("Enter the Heigh of the rectangle: ");
		double Rbreadth = scn.nextDouble();
		
		Rectangle_Perimeter(Rbreadth, Rheight);
		
	}
	
}
