package javaStudy;

import java.util.Calendar;

public class CalendarExam{
  public String hundredDaysAfter(){
    //���ú��� 100�� ���� ��¥�� "2016��1��1��"�� �������� return�ϼ���.
    Calendar date = Calendar.getInstance();
    
    date.add(Calendar.DATE, 100);
    
    String str = date.get(Calendar.YEAR) + "��"+ (date.get(Calendar.MONTH)+1) + "��"+date.get(Calendar.DATE)+"��";
    
    return str;

  }
  public static void main(String[] args){
	  CalendarExam c = new CalendarExam();
	  
	  String s = c.hundredDaysAfter();
	  
	  System.out.println(s);
  }
  
}
