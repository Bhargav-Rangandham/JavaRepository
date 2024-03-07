package Arrays;

import java.util.HashSet;

public class CommoninTwoArrays {

	public static void main(String[] args) {
		String a[] = {"cat", "dog", "pig", "mice"};
		String b[] = {"cat", "dog", "owl", "ant", "bee"};

		HashSet<String> set = new HashSet<String>();
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i].equalsIgnoreCase(b[i])){
					set.add(a[i]);
				}
			}
		}
		
		System.out.println(set);
	}
}
