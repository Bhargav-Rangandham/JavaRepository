package Calender;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class CurrentDateandTime {

	public static void main(String args[]) {
		
		//Before Java 8 version
		String Date = new SimpleDateFormat("dd MMM yyyy").format(Calendar.getInstance().getTime());
		System.out.println(Date);
		 
		//After Java 8 Version
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		
	}
}
