package javaStudy;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
//		int i = 1;
//		int sum = 0;
//		while (i<=100) {
//			sum = sum + i;
//			i++;
//		}
//		
//		System.out.println(sum);
////		while (i<10) {
////			System.out.println(i);
////			i++;
////		}
//		
//		int value = 0;
//		Scanner sc = new Scanner(System.in);
//		do {
//			value = sc.nextInt();
//			
//			System.out.println("입력한 값 " + value);
//			
//		}while(value != 10);
//		
//		sc.close();
		
		int total = 0;
		for(int j = 1; j <= 100 ;j++) {
//			if(j%2 !=0 )
//				continue;
			total = total + j;
			if(j == 50)
				break;

		}
		
		System.out.println(total);
	}
}
