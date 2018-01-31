package javaStudy;

public class StringBufferExam {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		sb.append("Hello");
		sb.append(" ");
		sb.append("World");
		
		String str = sb.toString();
		
		System.out.println(str);

		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("Hello");
		
		if(sb2 == sb3) {
			System.out.println("sb2 == sb3");
		}
		
		String str1 = new StringBuffer().append("Hello").append(" ").append("world").toString();
		
		System.out.println(str1);
	}

}
