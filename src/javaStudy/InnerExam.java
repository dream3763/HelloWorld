package javaStudy;

public class InnerExam {
	class Cal{
		public int value = 0;
		public void plus() {
			value ++;
		}
	}

	static class Cal2{
		public int value = 3;
		public void plus() {
			value ++;
		}
	}
	
	public void method() {
		class Cal{
			public int value = 2;
			public void plus() {
				value ++;
			}
		}
		
		Cal cal = new Cal();
		cal.plus();
		System.out.println(cal.value);
	
	}
	public static void main(String[] args) {
		InnerExam t = new InnerExam();
		InnerExam.Cal cal = t.new Cal();
		
		cal.plus();
		System.out.println(cal.value);
		
		InnerExam.Cal2 cal2 = new InnerExam.Cal2();
		
		cal2.plus();
		System.out.println(cal2.value);
		
		t.method();

	}

}
