package Arrays;

public class Arrayspractice2 {
	
	public static void main(String[] args) {
		/* Type 1
		String dogs[] = new String[5];
		
		dogs[0] = "Browsey";
		dogs[1] = "Trixy";
		dogs[2] = "Jack";
		dogs[3] = "Jujubi";
		dogs[4] = "Ben";
		
		*/
		
		//Type 2
		
		String dogs[] = {"Browsey", "Trixy", "Jack", "Jujubi", "Ben"};
		//for(int i=0; i<dogs.length; i++) {
		for(String dog: dogs) {
			//System.out.println("My Favorite Dog names are: " +dogs[i] +" Hashcodes are " + dogs[i].hashCode());
			System.out.println(dog);
		}		
		
		System.out.println();
	}
}
