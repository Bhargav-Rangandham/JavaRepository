package Arrays;

import java.util.Scanner;

public class ArraysMaxnMin {
    public static void main(String[] args) {
    	
    	Scanner scn = new Scanner(System.in);
    	System.out.println("Enter the array size: ");
    	
    	int size = scn.nextInt();
    	
        int[] numbers = new int[size];
        
        for(int i=0; i<size;i++) {
        	numbers[i] = scn.nextInt();
        }
        		
        // Initialize variables to store the maximum and minimum values
        int max = Integer.MIN_VALUE; // Start with the smallest possible value
        int min = Integer.MAX_VALUE; // Start with the largest possible value

        // Iterate through the array to find the maximum and minimum values
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        // Print the maximum and minimum values
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
