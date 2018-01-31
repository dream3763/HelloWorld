package javaStudy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {
	public static void main(String args[]) {
		Date date = new Date();
		
		System.out.println(date);
		System.out.println(date.toString());
		
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
		
		System.out.println(simpleDate.format(date));
		
		long today = System.currentTimeMillis();
		
		System.out.println(today-date.getTime());
		
	}
	

}
