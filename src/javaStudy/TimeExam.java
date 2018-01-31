package javaStudy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		LocalDate ld = LocalDate.of(2018, Month.APRIL, 2);

		System.out.println(ld);
		
		LocalTime lt = LocalTime.of(11, 21);
		
		LocalTime lt3 = LocalTime.parse("11:31:22");
		System.out.println(lt);
		System.out.println(lt3);
		
		LocalDate dt1 = dt.toLocalDate();
		System.out.println(dt1);
		System.out.println(dt.getDayOfMonth());
		
	    LocalDateTime dt5 = LocalDateTime.now();
	    System.out.println(dt5.getMonth());
	}

}
