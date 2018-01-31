package javaStudy;

public class ArrayExam {

	public static void main(String[] args) {
		int [] array = new int[100];
		int total = 0;
		
		for(int i = 0 ; i <array.length; i++) {
			array[i] = i+1;
			System.out.println(array[i]);
		}
		
		for(int i = 0 ; i <array.length; i++) {
			total = total + array[i] ;
		}
		System.out.println(total);
		
		int [][] array2 = new int[3][4];
		array2[0][1] = 1;
		
		int [][] array3 = new int[3][];
		
		array3[0] = new int[3];
		
		array3[0][0] = 1;
		
		int [][] array4 = {{1},{1,2},{1,2,3}};
		
		for(int i =0; i<array4.length; i++) {
			for(int j=0; j<array4[i].length; j++) {
				System.out.print(array4[i][j] + " ");
			}
			System.out.println("");
		}
		
		for(int value:array) {
			System.out.println(value);
		}
	}

}
