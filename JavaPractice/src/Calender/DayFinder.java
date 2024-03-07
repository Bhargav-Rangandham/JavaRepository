package Calender;

import java.time.LocalDate;
import java.util.Scanner;

public class DayFinder {

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the date(yyyy-mm-dd) format: ");
		String input = scn.nextLine();
		
		LocalDate date = LocalDate.parse(input);
		
		String dayofweek = date.getDayOfWeek().toString();
		
		System.out.println(dayofweek);
	}
}
