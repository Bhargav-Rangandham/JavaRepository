package patternPrograms;

import java.util.Scanner;

public class RightAngleStarProgram {

	public static void main(String arg[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for(int i=0;i<n;i++) { // 1

			for(int j=0;j<i; j++) //1
			{	
				System.out.print("*" + " ");
				//System.out.print(" ");
			}
			System.out.println();
		}
	}
}