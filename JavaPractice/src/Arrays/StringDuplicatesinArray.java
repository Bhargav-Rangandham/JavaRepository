package Arrays;

public class StringDuplicatesinArray {

	public static void main(String[] args) {
		String arr[] = {"abc", "bac", "abc", "cab", "bac", "xyz"};
		String brr[] = new String[arr.length];
		int count=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].equalsIgnoreCase(arr[j])) {
					brr[count++] = arr[i];
				}
			}
		}
		for(int i=0; i<count; i++) {
			System.out.println("Duplicates of string are: "+brr[i]);
		}
		
	}
}
