package javaStudy;

import java.util.Calendar;

public class TeneryExam {

	public static void main(String[] args) {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		String ampm = hour < 12 ? "����" : "����";
		System.out.println(ampm);
	}

}
