package Assignment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dateTimeAssignment {

	public static void main(String[] args) {
		
		LocalDate givendate=LocalDate.parse("08-04-2017",DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		
		LocalDate currentdate=LocalDate.now();
		
		
		System.out.println("given date "+givendate);
		System.out.println("current  date "+currentdate);
		System.out.println(compareDate(givendate,currentdate));
		
	}
	
	public static String compareDate(LocalDate givendate,LocalDate currentdate)
	{
		if(givendate.isBefore(currentdate))
			return "given date is before then current date";
		else if(givendate.isAfter(currentdate))
			return "given date is after then current date";
		else if(givendate.isEqual(currentdate))
			return "given date is equal to current date";
		else
			return "doesn't match any conditon";
			
	}
	
}
