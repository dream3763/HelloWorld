package javaStudy;

import java.util.*;

public class ListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		list.add("POK");
		list.add("KIM");
		list.add("POK");
		
				
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		Iterator<String> lter2 = list.iterator();
		
		
		while(lter2.hasNext()) {
			System.out.println(lter2.next());
		}

	}

}
