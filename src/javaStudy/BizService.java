package javaStudy;

public class BizService {

	public void bizMethod(int i) throws BizException{
		System.out.println("����Ͻ� ����");
		if (i < 0) {
			throw new BizException("0 �̻��̾�� �Ѵ�.");
		}
		
		System.out.println("����Ͻ� ����");
	}

}
