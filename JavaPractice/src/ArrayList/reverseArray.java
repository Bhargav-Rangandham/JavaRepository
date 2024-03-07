package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class reverseArray {

	public static void main(String args[]) {
		
		int arr[] = {10, 22, 33, 44, 66, 77, 88};
		
		List<Integer> al = new ArrayList(Arrays.asList(arr));
		
		Collections.sort(al, Collections.reverseOrder());
		
		for(int value: al) {
			System.out.println(value);
		}
	}
}
