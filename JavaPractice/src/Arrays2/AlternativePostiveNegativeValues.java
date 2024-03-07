package Arrays2;

public class AlternativePostiveNegativeValues {

	public static void main(String[] args) {
		int num[] = {2,-5,4,-3,6,-4};
		boolean PNValues = true;

		for(int i=0; i<num.length-1; i++) {	
			if(num[i]>=1 && num[i+1]>=0) {
				PNValues = false;
			}
			else if(num[i]<=0 && num[i+1]<=-1){
				PNValues = false;
			}
		}

		if(PNValues) {
			System.out.println("Given Array has alternate Pos & Negative values: "+PNValues);
		}

		else {
			System.out.println("Given Array has no alternate Pos & Negative values: "+PNValues);
		}

	}
}
