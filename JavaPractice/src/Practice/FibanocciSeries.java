package Practice;

import java.util.Scanner;

public class FibanocciSeries {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter an Input: ");
		
		int count = scn.nextInt();
		
		int n1=0, n2=1, n3, i;
		
		System.out.print(n1+" " +n2);
		
		for(i=0;i<=count;i++) {
			
			n3 = n1+n2;
			System.out.print(" "+n3);
			
			n1=n2;
			n2=n3;
		}
	
	}

}
