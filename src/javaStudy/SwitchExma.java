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
				System.out.println("�� �� �ٸ� ����");
		}
		
		int month = Calendar.getInstance().get(Calendar.MONTH)+1;
		String season ="" ;
		
		switch (month) {
			case 3 :
			case 4 :
			case 5 :
				season = "��";
			break;
		
			case 6 :
			case 7 :
			case 8 :
				season = "����";
			break;
			
			case 9 :
			case 10 :
			case 11 :
				season = "����";
			break;
			
			case 12 :
			case 1 :
			case 2 :
				season = "�ܿ�";
									
		}
		
		System.out.println("���� ���� " + month + "�� �̰� ���� ������ " + season + "�Դϴ�.");

	}

}
