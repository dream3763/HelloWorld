package javaStudy;

import java.util.Calendar;

public class SwitchExma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 1;
		
		switch(value){
			case 1:
				System.out.println("1");
			    break;
			case 2:
				System.out.println("2");
				break;
			default:
				System.out.println("그 외 다른 숫자");
		}
		
		int month = Calendar.getInstance().get(Calendar.MONTH)+1;
		String season ="" ;
		
		switch (month) {
			case 3 :
			case 4 :
			case 5 :
				season = "봄";
			break;
		
			case 6 :
			case 7 :
			case 8 :
				season = "여름";
			break;
			
			case 9 :
			case 10 :
			case 11 :
				season = "가을";
			break;
			
			case 12 :
			case 1 :
			case 2 :
				season = "겨울";
									
		}
		
		System.out.println("현재 월은 " + month + "월 이고 현재 계절은 " + season + "입니다.");

	}

}
