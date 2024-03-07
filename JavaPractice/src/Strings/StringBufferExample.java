package Strings;

import java.util.Scanner;

public class StringBufferExample {

    public static void main(String args[]) {
    	Scanner scn = new Scanner(System.in);
    	System.out.println("Enter the string: ");
    	String input = scn.nextLine();
		StringBuffer sb = new StringBuffer(input);
        
        //To reverse the given string using reverse() function.
        sb.reverse();
        String s = sb.toString();
        System.out.println(s);
        
        // To delete the words in the String delete() function.
        /*
        sb.delete(4, 7);
        String newS = sb.toString();
        System.out.println(newS);
        */
        
        // To Replace the words in the String using replace() function.
        
        sb.replace(5, 7, "is not");
        System.out.println(sb);
    }
}

