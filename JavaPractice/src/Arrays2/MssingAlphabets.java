package Arrays2;

public class MssingAlphabets {

	public static void main(String[] args) {
		
		char ch[] = {'p','r','s','u','v'};
		String s = new String(ch);
		
		char alphabets[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		String s2 = new String(alphabets);
		
		for(int i=0; i<=ch.length; i++) {
			if(!s.contains(String.valueOf(s2.charAt(i)))){
				System.out.println(s2.charAt(i)+" ");
			}
		}
	}
}
