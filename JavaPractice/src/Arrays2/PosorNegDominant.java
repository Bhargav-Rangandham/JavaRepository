package Arrays2;

public class PosorNegDominant {

	public static void main(String[] args) {
		int num[] = {-5,2,-3,-6,-1,-2,4, 3, 4, 5, 7};
		int NegCount=0;
		int PosCount=0;
		for(int i=0; i<num.length; i++) {
			
			if(num[i]<=-1) {
				NegCount++;
			}
			else {
				PosCount++;
			}
		}
		
		if(NegCount>PosCount) {
			System.out.println("Negative Dominant: "+NegCount);
		}
		
		else {
			System.out.println("Positive Dominant: "+PosCount);
		}
		
	}
}
