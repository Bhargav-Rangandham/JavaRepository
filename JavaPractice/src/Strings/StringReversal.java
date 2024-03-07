package Strings;

public class StringReversal {
	
	public static void main(String[] args) {
		
	String s1 = "Bhargav";
	String s2 = "";
	
	for(int i=s1.length()-1; i>=0; i--) {// 7; 7>0; 
		
		s2 = s2+s1.charAt(i);
	}
	
	System.out.print(s2);
}

}
