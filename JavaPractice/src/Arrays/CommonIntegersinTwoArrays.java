package Arrays;

import java.util.HashSet;

public class CommonIntegersinTwoArrays {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,7,6,5};
		int b[] = {1,3,7,5,9,0,8};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i]==b[j]) {
					set.add(a[i]);
				}
			}
		}
		System.out.println(set);
	}
}
