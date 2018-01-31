package javaStudy;

public class StringExam2 {

	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = str1.substring(5);
		String str3 = str1 + str2;
		
		System.out.println(str1);
		System.out.println(str2);

		System.out.println(str3);
		
		String str4="";
		for(int i=0;i<100;i++) {
			str4 = str4 + "*";	
		}
		
		StringBuffer str5 = new StringBuffer();
		for(int i=0;i<100;i++) {
			str5.append("*");
		}
		
		String str6 = str5.toString();
		
		System.out.println(str4);		
		System.out.println(str6);
	}

}
