package javaStudy;

public class MyCalExam {

	public static void main(String[] args) {
		Calculator cal = new MyCal();
		
		System.out.println(cal.multi(2, 3));
		System.out.println(cal.plus(2, 3));
		System.out.println(cal.exec(2, 3));
		System.out.println(Calculator.exec2(2, 3));

	}

}
