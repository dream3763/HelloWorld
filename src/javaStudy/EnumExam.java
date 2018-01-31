package javaStudy;

public class EnumExam {
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gender1;
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		
		gender1 = "kids";
		
		GENDER gender2;
		gender2 = GENDER.MALE;
		gender2 = GENDER.FEMALE;
		
		System.out.println(gender2);
	}
enum GENDER{
	MALE,FEMALE;
}
}
