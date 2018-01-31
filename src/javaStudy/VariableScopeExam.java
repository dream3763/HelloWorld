package javaStudy;

public class VariableScopeExam {
	int globalScope= 10;
	static int value =2;
	public void method1(int a) {
		int b = 2;
		System.out.println(globalScope);
		System.out.println(b);
		System.out.println(a);
	}
	
	public void method2(int d) {
		int c = 2;
		System.out.println(globalScope);
//		System.out.println(b);
//		System.out.println(a);
	}	

	public static void main(String[] args) {
		VariableScopeExam vs = new VariableScopeExam();
		// TODO Auto-generated method stub
		System.out.println(vs.globalScope);
	
		System.out.println(value);
		
		VariableScopeExam.value = 100;
		System.out.println(VariableScopeExam.value);

	}

}
