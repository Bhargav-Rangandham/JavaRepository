package Arrays2;

public class NonRepatingSortedArray {

	public static void main(String[] args) {
		int num[] = {1,2,5,0,4,3,3};
		boolean nonRepeating = true;

		for(int i=0; i<num.length-1; i++) {
			for(int j=0; j<num.length-i-1; j++)
				if(num[j]==num[j+1]) {
					nonRepeating = false;
				}
		}

		if(nonRepeating) {
			System.out.println("Array Contains non repating numbers: "+nonRepeating);
		}
		else {
			System.out.println("Array Contains Repeating numbers: "+nonRepeating);
		}
	}
}
