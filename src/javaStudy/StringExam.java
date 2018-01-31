package javaStudy;

public class StringExam {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		if(str1 == str2) {
			System.out.println("str1과 str2는 같은 곳을 참조합니다.");
		}
		
		if(str1 == str3) {
			System.out.println("str1과 str3는 같은 곳을 참조합니다.");
		}
		
		if(str3 == str4) {
			System.out.println("str3과 str4는 같은 곳을 참조합니다.");
		}	
		
		System.out.println(str1);
		System.out.println(str1.substring(3));
		System.out.println(str1);
		
		if(str1.equals(str3)) {
			System.out.println("str1과 str3은 같은 값을 가집니다.");
		}
	}

}
