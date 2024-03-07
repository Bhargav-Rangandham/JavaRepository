package Arrays2;

public class LargestGapBetweenNumbers {

	public static void main(String[] args) {
		int num[] = {23,-2,45,38,12,4,6};
		
		for(int i=0; i<num.length-1; i++) {
			for(int j=0; j<num.length-i-1; j++) {
				if(num[j]>num[j+1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		int gap=0;
		for(int i=0; i<num.length-1;i++) {
			gap = num[i+1]-num[i];
			System.out.println(gap);
		}
	}
}
