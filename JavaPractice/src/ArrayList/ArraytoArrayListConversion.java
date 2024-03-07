package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraytoArrayListConversion {
	
	public static void main(String args[]) {
		
		String arr[] = {"Dog", "Cat", "Ant", "Mice", "Owl", "Bee"};
		
		for(String value: arr) {
			System.out.println(value);
		}
		
		//To Convert the Array to Array list using Collections Framework.
		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));
		
		// Sorting in Ascending order
		Collections.sort(al);
		System.out.println(al);
		
		//Sorting in descending order
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);

	}

}
