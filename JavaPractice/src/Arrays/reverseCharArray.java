package Arrays;

public class reverseCharArray {

	public static void main(String args[]) {
		char array[] = {'a', 'b', 'c', 'd', 'e', 'f'};
		char temp[] = new char[array.length];
		
		for(int i=array.length-1, j=0; i>=0; i--, j++) {
			temp[j] = array[i];
		}
		for(char ch : temp) {
		
			System.out.print(ch+" ");
		}
	}
}
