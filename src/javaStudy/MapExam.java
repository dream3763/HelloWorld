package javaStudy;

import java.util.*;

public class MapExam {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("001", "POK");
		map.put("002", "KIM");
		map.put("003", "POK");
		map.put("003", "KANG");
		
		System.out.println(map.size());
		
		System.out.println(map.get("003"));
		
		Set<String> key = map.keySet();
		
		Iterator<String> keys = key.iterator();
		while(keys.hasNext()) {
			String key_value = keys.next();
			String value = map.get(key_value);
			System.out.println(key_value + ":" + value);
		}

	}

}
