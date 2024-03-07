package Misc;

public class Solution {

	 public static void main(String[] args) {
		int n=5;
	   
        for(int i=0; i<n;i++){
            
            for(int j=0; j<=i; j++){
                
                System.out.print("* ");
            }
            System.out.println();            
        }
        for(int l=n; l>=0; l--) {
        	
        	for(int k=n-1-l; k<n; k++){
            
        		System.out.print("* ");
        }
        	System.out.println();
    }
}
}