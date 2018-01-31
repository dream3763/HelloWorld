package javaStudy;

public class BoxExam {

	public static void main(String[] args) {
		
//		Box box = new Box();
//		
//		box.setObj(new Object());
//		Object obj2 = box.getObj();
//		
//		box.setObj("Hello");
//		String str1 = (String)box.getObj();
//		
//		box.setObj(1);
//		int i = (int)box.getObj();
//		
		Box<Object> box = new Box<>();
		box.setObj(new Object());
		Object obj1 = box.getObj();
		
		Box<String> box2 = new Box<>();
		box2.setObj("Hello");
		String str = box2.getObj();
		
		Box<Integer> box3 = new Box<>();
		box3.setObj(10);
		int i = box3.getObj();
		

	}

}
