package javaStudy;

public class BizServiceExec {

	public static void main(String[] args) {
		BizService biz = new BizService();
		
		biz.bizMethod(5);
		
		try {
			biz.bizMethod(-3);
		}catch(BizException e) {
			e.printStackTrace();
		}
	}

}
