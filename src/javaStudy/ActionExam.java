package javaStudy;

public class ActionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Action act = new Action() {
			public void act() {
				System.out.println("익명클래스로 행동하다");
			}
			
		};
		
		act.act();

	}

}