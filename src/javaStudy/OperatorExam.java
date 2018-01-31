package javaStudy;

public class OperatorExam {

	public static void main(String[] args) {
		int i1 = -5;
		int i2 = +i1;
		int i3 = -i1;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		int i4 = ++i3;
		
		System.out.println(i3);
		System.out.println(i4);
		
		int i5 = i3++;
		
		System.out.println(i5);
		System.out.println(i3);		
		
		System.out.println(i1 != i2);
		
		i1 += 10;
		
		System.out.println(i1);		
	}

}
