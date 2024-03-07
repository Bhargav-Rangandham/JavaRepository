package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class printArrayList {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		ArrayList<String> al = new ArrayList<>();
		
		System.out.println("Enter the values in to the arrayList: ");
		for(int i=0; i<5; i++) {
			String color = scn.next();
			al.add(color);
		}
		
		for(int j=0; j<al.size(); j++) {
			System.out.println(al.get(j)+" "+" index is "+j);
		}
	}
}
