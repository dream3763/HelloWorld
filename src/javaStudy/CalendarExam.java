package javaStudy;

import java.util.Calendar;

public class CalendarExam{
  public String hundredDaysAfter(){
    //오늘부터 100일 뒤의 날짜를 "2016년1월1일"의 형식으로 return하세요.
    Calendar date = Calendar.getInstance();
    
    date.add(Calendar.DATE, 100);
    
    String str = date.get(Calendar.YEAR) + "년"+ (date.get(Calendar.MONTH)+1) + "월"+date.get(Calendar.DATE)+"일";
    
    return str;

  }
  public static void main(String[] args){
	  CalendarExam c = new CalendarExam();
	  
	  String s = c.hundredDaysAfter();
	  
	  System.out.println(s);
  }
  
}
