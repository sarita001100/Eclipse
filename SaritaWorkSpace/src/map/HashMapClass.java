package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
//country(key).population(value)
		HashMap<String, Integer> map = new HashMap<>();

		// insertion
		map.put("India", 120);
		map.put("China", 30);
		map.put("Japan", 124);
		map.put("China", 45);
		System.out.println(map);
		// search
//	if(map.containsKey("Japan")) {
//		System.out.println("key is present in the map");
//	}else{
//	System.out.println	("key is not present in the map");
//		
//	}
//	System.out.println(map.get("India"));//key exists
//	System.out.println(map.get("Rasiya"));//does not exists
//	
//	System.out.println(map.containsKey("india"));//boolean
		// System.out.println(map.containsKey("India"));//boolean
//first way
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		// second way
//	Set<String>keys=	map.keySet();
//for(String key:keys) {
//	System.out.println(key+" "+map.get(key));
//}
		map.remove("China");
		System.out.println(map.size());
		System.out.println(map);
	}

}
