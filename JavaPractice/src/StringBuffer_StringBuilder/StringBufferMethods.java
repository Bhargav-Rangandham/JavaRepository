package StringBuffer_StringBuilder;


public class StringBufferMethods {

	public static void main(String[] args) {
		//Scanner scn = new Scanner(System.in);
		//String input = scn.nextLine(); 
		
		String input = "\r\n"
				+ "Once upon a time, there was a great king whose name was Raja Raja Chola. He was a";
		StringBuffer sb = new StringBuffer(input);
		
		//To append the word to the given String
		sb.append(" formidable warrior of his era!!!");
		System.out.println(sb);
		
		//To Insert a specifed string a specified Location.
		sb.insert(7, "upon ");
		System.out.println("\n"+sb);
		
		//To Delete the Specified String
		sb.delete(5, 10);
		System.out.println("\n"+sb);
		
		//To Replace a String
		sb.replace(26, 29, "lived");
		System.out.println("\n"+sb);
		
		//To get the Substring from the given string
		
		String substring = sb.substring(77, 90);
		System.out.println("\n"+substring);
		
		
	}
}
