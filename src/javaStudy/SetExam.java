package javaStudy;

import java.util.*;

public class SetExam {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		
		boolean flag1 = set1.add("Pok");
		boolean flag2 = set1.add("Kim");
		boolean flag3 = set1.add("Pok");
		
		System.out.println(set1.size());
		
		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);
		
//		Iterator<String> lt = set1.iterator();
//		
//		while(lt.hasNext()) {
//			System.out.println(lt.next());
//		}
		
		for(String str : set1) {
			System.out.println(str);
		}

	}
	
}
