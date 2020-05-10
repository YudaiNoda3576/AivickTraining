package practice1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fruits {

	public static void main(String[] args) {	
		try {
			String fruit = args[0];
			
			Map<String, Integer>fruits = new HashMap<>();
				fruits.put("りんご", 200);
				fruits.put("バナナ", 100);
				fruits.put("みかん", 150);
				fruits.put("ぶどう", 300);
				fruits.put("もも", 400);	
				
			System.out.println(fruit + "は" + fruits.get(fruit) + "円です");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("例外が発生しました。りんご,バナナ,みかん,ぶどう,もものいずれかを入力してください");
		}
				
		
		
	}
}
