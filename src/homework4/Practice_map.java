package homework4;

import java.util.HashMap;
import java.util.Map;

public class Practice_map {
	public static void main (String[]args) {
		Map<Integer, String> indexes = new HashMap<>();
		
		indexes.put(1, "Java");
		indexes.put(2, "PHP");
		indexes.put(3, "Ruby");
		indexes.put(4, "Python");
		
		String java = indexes.get(1);
		String php = indexes.get(2);
		
		System.out.println(java);
		System.out.println(php);
		
		Map<String, Integer> ranking = new HashMap<>();
		ranking.put("Java", 1);
		ranking.put("PHP", 2);
		ranking.put("Ruby", 3);
		
		for(String key : ranking.keySet()) {
			System.out.println("key:" + key + "value:" + ranking.get(key));
		}
		
		for(Map.Entry<String, Integer> entry: ranking.entrySet()) {
			System.out.println("key:" + entry.getKey() + "value:" + entry.getValue());
		}
		
	}
}
