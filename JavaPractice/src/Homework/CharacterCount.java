package Homework;

public class CharacterCount {

	public static void main(String args[]) {
		
		String s = "Welcome To My Home";
		int upper=0;
		int lower =0;
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<'z' && ch!=' ') {
				lower++;
			}
			else if(ch>='A' && ch<'Z' && ch!=' ') {
				upper++;
			}
		}
		System.out.print(lower+" "+upper);
	}
}
