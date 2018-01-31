package javaStudy;

public class BizService {

	public void bizMethod(int i) throws BizException{
		System.out.println("비즈니스 시작");
		if (i < 0) {
			throw new BizException("0 이상이어야 한다.");
		}
		
		System.out.println("비즈니스 종료");
	}

}
