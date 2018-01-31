package javaStudy;

public class ExceptionExec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 0;
		try {
			int z = devide(x, y);
			System.out.println(z);
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}

	}
	
	public static int devide(int x, int y) throws ArithmeticException {
		int result =0;
		
		if(y == 0) {
			throw new ArithmeticException("0으로 나눌 수 없습니다.");
		}
		
		result = x/y;
		
		return result;
	}

}
