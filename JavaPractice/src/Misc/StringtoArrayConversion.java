package Misc;

public class StringtoArrayConversion {
	
	public static void main(String[] args) {
		
		String s= "Bhargav, Ranganadham, Naidu";
		
		char ch[] = s.toCharArray();
		
		for(char c: ch) {
			
			System.out.print(c+" ");
		}
	}
}
