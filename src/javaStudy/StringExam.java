package javaStudy;

public class StringExam {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		if(str1 == str2) {
			System.out.println("str1�� str2�� ���� ���� �����մϴ�.");
		}
		
		if(str1 == str3) {
			System.out.println("str1�� str3�� ���� ���� �����մϴ�.");
		}
		
		if(str3 == str4) {
			System.out.println("str3�� str4�� ���� ���� �����մϴ�.");
		}	
		
		System.out.println(str1);
		System.out.println(str1.substring(3));
		System.out.println(str1);
		
		if(str1.equals(str3)) {
			System.out.println("str1�� str3�� ���� ���� �����ϴ�.");
		}
	}

}
