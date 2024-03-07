package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListtoArrayConversion {

    public static void main(String[] args) {
    	
    	ArrayList<Integer> al = new ArrayList<>();
    	al.add(0);
    	al.add(2);
    	al.add(3);
    	al.add(5);
    	al.add(7);
    	
    	System.out.print("Output of ArrayList is "+al);
    	System.out.println();
    	//Converting arraylist to Array
    	al.toArray();
    	
    	for(int values: al) {
    		
    		System.out.print(values+" ");   		
    	}    	
    }
}

