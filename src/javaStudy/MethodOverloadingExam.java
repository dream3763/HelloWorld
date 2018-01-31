package javaStudy;

public class MethodOverloadingExam {

	public static void main(String[] args) {
		MyClass2 my = new MyClass2();
		
		System.out.println(my.plus(1, 2));
		System.out.println(my.plus(1, 2, 3));
		System.out.println(my.plus("I ", "Work"));

	}

}
