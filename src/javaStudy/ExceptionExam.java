package javaStudy;

public class ExceptionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		int y = 0;
		int k =0;
		try {
			k = i/y;
			System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println("0���� ������ �����ϴ�. " + e.toString());
		}finally {
			System.out.println("�ݵ�� ����");
		}
		
		


	}

}
