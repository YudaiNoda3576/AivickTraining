package practice1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchFruits {
	public static void main(String[] args) {
			int fruitsPrice = Integer.parseInt(args[0]);
			
			Map<String, Integer> fruits = new HashMap<>();
				fruits.put("りんご", 200);
				fruits.put("バナナ", 100);
				fruits.put("みかん", 150);
				fruits.put("ぶどう", 300);
				fruits.put("もも", 400);
			
			upperAve(fruitsPrice, fruits);
		
	}

	private static void upperAve(int fruitPrice, Map<String, Integer> fruits ) {
		for (Map.Entry <String, Integer> entry : fruits.entrySet()) {
			if(fruitPrice <= entry.getValue()) {
				System.out.print(entry.getKey() + " ");
			}
		}
	}
}
